package com.sajl.spingboot.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach {

    public CricketCoach( )
    {
        System.out.println("Class Loading : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Daily Practice for 60 Min";
    }
}
