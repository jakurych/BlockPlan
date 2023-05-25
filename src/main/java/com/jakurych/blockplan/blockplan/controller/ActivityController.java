package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.model.domain.Activity;
import com.jakurych.blockplan.blockplan.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.Duration;
import java.util.List;

@RestController
@RequiredArgsConstructor

public class ActivityController {
    private ActivityService activityService;

    public void createActivity(int id,String name,Duration duration,Color color){
        Activity newActivity = new Activity(id,name,duration,color);
    }
    @GetMapping
    public ResponseEntity<List<Activity>> findAll() {
        return ResponseEntity.ok(activityService.findAll());
    }

}
