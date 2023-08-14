package bw.co.roguesystems.bi.datasource;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "data_sources")
@Getter
@Setter
public class DataSource implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_SOURCE_SEQ")
    @SequenceGenerator(name="DATA_SOURCE_SEQ", sequenceName="DATA_SOURCE_SEQ", allocationSize=1)
    private Long id;

    private DataSourceType type;

    @Column(name = "name", nullable = false)
    private String name;
    


}
