package pe.edu.pucp.a20130095.myfirstloginrest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.pucp.a20130095.myfirstloginrest.model.api.in.LoginInRO;
import pe.edu.pucp.a20130095.myfirstloginrest.model.api.out.UserOutRO;

@RestController
public class UserController {
    
    @PostMapping("/user/login")
    public UserOutRO login(@RequestBody LoginInRO loginInRO) {
        return new UserOutRO(0, null, 1, "agc", "a@a.com");
    }
}