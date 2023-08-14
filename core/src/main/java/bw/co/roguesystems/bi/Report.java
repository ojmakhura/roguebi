package bw.co.roguesystems.bi;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import bw.co.roguesystems.bi.datasource.DataSource;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "reports")
public class Report implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPORT_SEQ")
    @SequenceGenerator(name="REPORT_SEQ", sequenceName="REPORT_SEQ", allocationSize=1)
    private Long id;

    private LocalDateTime createdOn;
    
    private String createBy;

    private List<DataSource> dataSources;

}
