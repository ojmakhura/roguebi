package bw.co.roguesystems.bi.datasource;

public class DataSourceConverter {

    public static void toEntity(DataSourceVO dataSourceVO, DataSource dataSource) {
        dataSource.setName(dataSourceVO.getName());
        dataSource.setType(dataSourceVO.getType());
    }

    public static void toVO(DataSource dataSource, DataSourceVO dataSourceVO) {
        dataSourceVO.setId(dataSource.getId());
        dataSourceVO.setName(dataSource.getName());
        dataSourceVO.setType(dataSource.getType());
    }
    
    public static DataSourceVO toVO(DataSource dataSource) {
        DataSourceVO dataSourceVO = new DataSourceVO();
        toVO(dataSource, dataSourceVO);
        return dataSourceVO;
    }

    public static DataSource toEntity(DataSourceVO dataSourceVO) {
        DataSource dataSource = new DataSource();
        toEntity(dataSourceVO, dataSource);
        return dataSource;
    }

}
