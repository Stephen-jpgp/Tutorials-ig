package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
    @Bean
    @Primary
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
