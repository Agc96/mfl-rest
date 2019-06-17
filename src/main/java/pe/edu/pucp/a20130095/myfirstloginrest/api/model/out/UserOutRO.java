package pe.edu.pucp.a20130095.myfirstloginrest.api.model.out;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import pe.edu.pucp.a20130095.myfirstloginrest.api.model.base.BaseOutRO;
import pe.edu.pucp.a20130095.myfirstloginrest.api.model.base.ErrorTypes;
import pe.edu.pucp.a20130095.myfirstloginrest.db.model.User;

@JsonRootName("userOutRO")
public class UserOutRO extends BaseOutRO {

    private int userId;
    private String fullName;
    private String email;

    @JsonCreator
    public UserOutRO(@JsonProperty("errorCode") int errorCode,
                     @JsonProperty("message") String message,
                     @JsonProperty("userId") int userId,
                     @JsonProperty("fullName") String fullName,
                     @JsonProperty("email") String email) {
        super(errorCode, message);
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
    }

    public UserOutRO(ErrorTypes error) {
        super(error);
        // Los otros atributos se inicializan por defecto en 0 o null.
    }

    public UserOutRO(ErrorTypes error, String customMessage) {
        super(error, customMessage);
        // Los otros atributos se inicializan por defecto en 0 o null.
    }

    public UserOutRO(ErrorTypes error, User user) {
        super(error);
        this.userId = user.getId();
        this.fullName = user.getFullName();
        this.email = user.getEmail();
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
