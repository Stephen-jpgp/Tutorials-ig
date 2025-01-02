package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(PacManGame.class).up();
//            context.getBean(MarioGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
