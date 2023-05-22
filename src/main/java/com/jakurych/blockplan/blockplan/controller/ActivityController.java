package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.model.domain.Activity;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.Duration;
@RestController

public class ActivityController {
    private Activity activity;

    public void createActivity(int id,String name,Duration duration,Color color){
        Activity newActivity = new Activity(id,name,duration,color);
    }
}
