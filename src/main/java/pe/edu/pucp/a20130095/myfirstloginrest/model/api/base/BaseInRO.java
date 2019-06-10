package pe.edu.pucp.a20130095.myfirstloginrest.model.api.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("baseInRO")
public class BaseInRO {

    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

    @JsonCreator
    public BaseInRO(@JsonProperty("applicationName") String applicationName) {
        this.applicationName = applicationName;
    }
}
