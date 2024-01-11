package com.sajl.spingboot.demo.rest;

import com.sajl.spingboot.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @Value("${first.name}")
    private String firstName;
    @Value("${last.name}")
    private String lastName;
    private Coach cricketCoach;
    private Coach basketBallCoach;

    @Autowired
    public DemoController (@Qualifier("cricketCoach") Coach theCricketCoach ,
                           @Qualifier("basketBall") Coach theBasketBallCoach )
    {
        cricketCoach = theCricketCoach;
        basketBallCoach = theBasketBallCoach;

    }
    @GetMapping("/")
    public String sayHello()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello  "+ firstName + " " + lastName);
        sb.append("<BR>");
        sb.append( cricketCoach.getDailyWorkout());
        sb.append("<BR>");
        sb.append( basketBallCoach.getDailyWorkout());

        return sb.toString() ;
    }
}
