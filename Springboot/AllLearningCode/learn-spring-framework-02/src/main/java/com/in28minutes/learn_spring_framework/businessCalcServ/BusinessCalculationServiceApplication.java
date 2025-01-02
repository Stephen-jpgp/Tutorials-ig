package com.in28minutes.learn_spring_framework.businessCalcServ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationServiceApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceApplication .class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
