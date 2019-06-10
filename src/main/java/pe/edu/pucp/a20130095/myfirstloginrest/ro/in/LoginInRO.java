package pe.edu.pucp.a20130095.myfirstloginrest.ro.in;

import com.fasterxml.jackson.annotation.JsonRootName;

import pe.edu.pucp.a20130095.myfirstloginrest.ro.base.BaseInRO;

@JsonRootName("loginInRO")
public class LoginInRO extends BaseInRO {

    private String username;
    private String password;

    @JsonCreator
    public LoginInRO(@JsonProperty("applicationName") String applicationName,
                     @JsonProperty("username") String username,
                     @JsonProperty("password") String password) {
        super(applicationName);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
