package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) { };
record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Steff";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        var person = new Person("Tams", 14, new Address("1st Street, Brahmapur", "Uttarkhand"));

        return person;
    }

    @Bean
    @Primary
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) { //autowiring
        return new Person(name, age, address2);
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { //autowiring
        return new Person(name, age, address);
    }

    @Bean(name = {"address2", "address"})
    @Primary
    public Address address() {
        var address = new Address("1st Street, Mahadevapura", "Whitefield");
        return address;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        var address = new Address("Motinagar", "Hyderabad");
        return address;
    }
}
