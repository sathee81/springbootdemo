package com.sajl.spingboot.demo.config;

import com.sajl.spingboot.demo.common.BasketBallCoach;
import com.sajl.spingboot.demo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean("basketBall")
    public Coach basketBallCoach ()
    {
        return new BasketBallCoach();
    }
}
