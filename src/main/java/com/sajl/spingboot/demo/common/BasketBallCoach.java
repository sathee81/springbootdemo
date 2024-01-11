package com.sajl.spingboot.demo.common;

public class BasketBallCoach implements Coach {
    public BasketBallCoach()
    {
        System.out.println("Class Loading " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Daily Do Ball Practice for 120 Min";
    }
}
