package bw.co.roguesystems.bi.datasource;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataSourceRepository extends JpaRepository<DataSource, Long>, JpaSpecificationExecutor<DataSource> {

    Optional<DataSource> findAllByType(DataSourceType type );

    Optional<DataSource> findAllByName(String name);

    Optional<DataSource> findAllByNameCotainingIgnoreCase(String name);
    
}
