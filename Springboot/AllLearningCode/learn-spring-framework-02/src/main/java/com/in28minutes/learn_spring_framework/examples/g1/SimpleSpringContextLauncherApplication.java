package com.in28minutes.learn_spring_framework.examples.g1;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//import org.apache.commons.lang3;

public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) throws InvalidTokenException {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            context.getBean(GameRunner.class).run();
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
