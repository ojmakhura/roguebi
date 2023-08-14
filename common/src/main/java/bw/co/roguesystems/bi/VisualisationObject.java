package bw.co.roguesystems.bi;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VisualisationObject implements Serializable {
    
    private String title;
    private VisualisationObjectType type;
    private String yLabel;
    private String xLabel;
    private Map<String, String> headerNames;
    private Map<String, Object> data;

}
