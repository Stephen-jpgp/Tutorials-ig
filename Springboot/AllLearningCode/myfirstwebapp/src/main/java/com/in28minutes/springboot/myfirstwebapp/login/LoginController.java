package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap map) {
        map.put("password", password);
        if (authenticationService.authenticate(name, password)) {
            map.put("name", name);
            return "welcome";
        }
        map.put("errorMessage", "Invalid Credentials");
        return "login";
    }
}
