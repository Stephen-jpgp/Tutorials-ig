package com.in28minutes.learn_spring_framework.examples.e1;

public class InvalidTokenException extends Exception{
    @Override
    public String toString() {
        return "This is an Invalid Token that is neither HPP nor Okta";
    }
}