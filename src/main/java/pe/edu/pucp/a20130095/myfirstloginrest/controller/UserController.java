package pe.edu.pucp.a20130095.myfirstloginrest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.pucp.a20130095.myfirstloginrest.model.api.base.ErrorTypes;
import pe.edu.pucp.a20130095.myfirstloginrest.model.api.in.LoginInRO;
import pe.edu.pucp.a20130095.myfirstloginrest.model.api.out.UserOutRO;
import pe.edu.pucp.a20130095.myfirstloginrest.utils.Utilities;

@RestController
public class UserController {
    
    @PostMapping("/user/login")
    public UserOutRO login(@RequestBody LoginInRO request) {
        // Ver si hay errores en el JSON de entrada
        UserOutRO error = validateLoginData(request);
        if (error != null) return error;
        // Obtener el usuario con el nombre de usuario especificado
        String username = request.getUsername();
        String password = request.getPassword();
        return new UserOutRO(0, null, 1, "agc", "a@a.com");
    }

    private UserOutRO validateLoginData(LoginInRO request) {
        // Validar datos de entrada
        if (request == null) {
            return new UserOutRO(ErrorTypes.MISSING_APP_NAME);
        }
        String applicationName = request.getApplicationName();
        if (Utilities.isEmptyString(applicationName)) {
            return new UserOutRO(ErrorTypes.MISSING_APP_NAME);
        }
        if (!Utilities.checkApplicationName(applicationName)) {
            return new UserOutRO(ErrorTypes.INVALID_APP_NAME);
        }
        // Validar usuario y contraseña
        String username = request.getUsername();
        if (Utilities.isEmptyString(username)) {
            return new UserOutRO(ErrorTypes.MISSING_DATA, "Ingrese el nombre de usuario.");
        }
        String password = request.getPassword();
        if (Utilities.isEmptyString(password)) {
            return new UserOutRO(ErrorTypes.MISSING_DATA, "Ingrese la contraseña.");
        }
        // Todo ok, continuar con la ejecución
        return null;
    }

}
