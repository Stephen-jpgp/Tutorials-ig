package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(PacManGame.class).up();
            context.getBean(MarioGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
