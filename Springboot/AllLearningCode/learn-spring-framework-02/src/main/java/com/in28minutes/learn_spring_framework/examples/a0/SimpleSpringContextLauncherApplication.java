package com.in28minutes.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
//import org.apache.commons.lang3;


@Configuration
//@ComponentScan("com.in28minutes.learn_spring_framework.examples.a0") This is also correct, then just using @ComponentScan also works cuz current directory
@ComponentScan
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) throws InvalidTokenException {
        try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
//        String sample = "ca85e83f53d9f6afbe795e174c2b91e6";
//        boolean isOktaId = isValidOktaToken(sample);
//        System.out.println(isOktaId);
    }

//    public static boolean isValidOktaToken(String token) throws InvalidTokenException {
//        if ((token.length() == 20 && token.matches("[A-Za-z0-9]+")) || (token.length() == 32 && token.matches("[A-Fa-f0-9]+"))) {
//            return token.length() == 20 && token.matches("[A-Za-z0-9]+"); //returns true if it's OktaId and false when HPPId
//        }
//        throw new InvalidTokenException(); //throws an error when it is neither OktaId nor HPPId
//    }
}
