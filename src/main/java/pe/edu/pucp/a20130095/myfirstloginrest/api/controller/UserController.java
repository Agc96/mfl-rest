package pe.edu.pucp.a20130095.myfirstloginrest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.pucp.a20130095.myfirstloginrest.db.controller.ApplicationRepository;
import pe.edu.pucp.a20130095.myfirstloginrest.db.controller.UserRepository;
import pe.edu.pucp.a20130095.myfirstloginrest.db.model.Application;
import pe.edu.pucp.a20130095.myfirstloginrest.db.model.User;
import pe.edu.pucp.a20130095.myfirstloginrest.api.model.base.ErrorTypes;
import pe.edu.pucp.a20130095.myfirstloginrest.api.model.in.LoginInRO;
import pe.edu.pucp.a20130095.myfirstloginrest.api.model.out.UserOutRO;
import pe.edu.pucp.a20130095.myfirstloginrest.utils.Crypto;
import pe.edu.pucp.a20130095.myfirstloginrest.utils.Utilities;

@RestController
public class UserController {

    private final static String MISSING_USERNAME  = "Ingrese el nombre de usuario.";
    private final static String MISSING_PASSWORD  = "Ingrese la contraseña.";
    private final static String INVALID_USER_DATA = "El nombre de usuario o la contraseña no son válidos.";

    @Autowired
    private ApplicationRepository appRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/login")
    public UserOutRO login(@RequestBody LoginInRO request) {
        // Ver si hay errores en el JSON de entrada
        UserOutRO error = validateLoginData(request);
        if (error != null) return error;

        // Obtener el usuario con el nombre de usuario especificado
        String username = request.getUsername();
        User user = userRepository.findFirstByUsername(username);
        if (user == null) {
            return new UserOutRO(ErrorTypes.INVALID_DATA, INVALID_USER_DATA);
        }
        String password = request.getPassword();
        if (!Crypto.verify(user.getHash(), password)) {
            return new UserOutRO(ErrorTypes.INVALID_DATA, INVALID_USER_DATA);
        }

        // Devolver la respuesta con los datos del usuario
        return new UserOutRO(ErrorTypes.NO_ERROR, user);
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
        Application app = appRepository.findFirstByName(applicationName);
        if (app == null) {
            return new UserOutRO(ErrorTypes.INVALID_APP_NAME);
        }

        // Validar usuario y contraseña
        String username = request.getUsername();
        if (Utilities.isEmptyString(username)) {
            return new UserOutRO(ErrorTypes.MISSING_DATA, MISSING_USERNAME);
        }
        String password = request.getPassword();
        if (Utilities.isEmptyString(password)) {
            return new UserOutRO(ErrorTypes.MISSING_DATA, MISSING_PASSWORD);
        }

        // Si ha pasado todas las pruebas, continuar con la ejecución
        return null;
    }

}
