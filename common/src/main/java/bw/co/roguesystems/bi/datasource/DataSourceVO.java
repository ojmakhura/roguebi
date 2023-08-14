package bw.co.roguesystems.bi.datasource;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataSourceVO implements Serializable {
    
    private Long id;

    private String name;

    private DataSourceType type;

}
