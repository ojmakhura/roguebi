package bw.co.roguesystems.bi.datasource;

import java.util.Collection;

import javax.xml.crypto.Data;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import bw.co.roguesystems.bi.RogueBiServiceException;
import bw.co.roguesystems.bi.RogueBiSpecifications;

@Service
public class DataSourceService {
    
    private final DataSourceRepository dataSourceRepository;

    public DataSourceService(DataSourceRepository dataSourceRepository) {
        this.dataSourceRepository = dataSourceRepository;
        
    }

    public DataSourceVO create(DataSourceVO dataSourceVO) {

        if(dataSourceVO.getId() != null) {
            throw new RogueBiServiceException("Cannot create a data source with an id");
        }

        DataSource dataSource = new DataSource();

        DataSourceConverter.toEntity(dataSourceVO, dataSource);

        dataSource = dataSourceRepository.save(dataSource);
        dataSourceVO.setId(dataSource.getId());

        return dataSourceVO;
    }

    public void update(DataSourceVO dataSourceVO) {

        DataSource dataSource = dataSourceRepository.findById(dataSourceVO.getId()).orElseThrow();

        DataSourceConverter.toEntity(dataSourceVO, dataSource);

        // dataSourceRepository.save(dataSource);
    }

    public void delete(Long id) {
        dataSourceRepository.deleteById(id);
    }

    public DataSourceVO get(Long id) {
        DataSource dataSource = dataSourceRepository.findById(id).orElseThrow();
        
        return DataSourceConverter.toVO(dataSource);
    }

    public Collection<DataSourceVO> getAll() {

        Collection<DataSourceVO> sources = dataSourceRepository.findAll().stream().map(dataSource -> {
            return DataSourceConverter.toVO(dataSource);
        }).toList();

        return sources;
    }

    public Collection<DataSourceVO> getAllByType(DataSourceType type) {

        if(type == null) {
            throw new RogueBiServiceException();
        }

        Specification<DataSource> spec = RogueBiSpecifications.<DataSource, DataSourceType>findByAttribute("type", type);

        Collection<DataSourceVO> sources = dataSourceRepository.findAllByType(type).stream().map(dataSource -> {
            return DataSourceConverter.toVO(dataSource);
        }).toList();

        return sources;
    }

    public Collection<DataSourceVO> getAllByName(String name) {



        Collection<DataSourceVO> sources = dataSourceRepository.findAllByName(name).stream().map(dataSource -> {
            return DataSourceConverter.toVO(dataSource);
        }).toList();

        return sources;
    }

}
