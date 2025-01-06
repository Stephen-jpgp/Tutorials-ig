package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String user, String password) {
        return user.equalsIgnoreCase("in28minutes") && password.equalsIgnoreCase("dummy");
    }
}
