package com.jakurych.blockplan.blockplan.controller;


import com.jakurych.blockplan.blockplan.model.domain.Activity;
import com.jakurych.blockplan.blockplan.service.ActivityService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jakurych.blockplan.blockplan.dto.ActivityDto;
import com.jakurych.blockplan.blockplan.model.domain.Activity;


import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping(value = "/activity", produces = MediaType.APPLICATION_JSON_VALUE)
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public ResponseEntity<ActivityDto> create(@RequestBody ActivityDto activity) {
        return ResponseEntity.ok(activityService.createOrUpdate(activity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        activityService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActivityDto> find(@PathVariable int id) {
        ActivityDto activity = activityService.findById(id);
        if (activity != null) {
            return ResponseEntity.ok(activity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ActivityDto>> findAll() {
        List<ActivityDto> activities = activityService.findAll();
        return ResponseEntity.ok(activities);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<ActivityDto> findByName(@PathVariable String name) {
        ActivityDto activity = activityService.findByName(name);
        if (activity != null) {
            return ResponseEntity.ok(activity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/duration")
    public ResponseEntity<List<ActivityDto>> findByDuration(@RequestParam(name = "duration") Duration duration) {
        List<ActivityDto> activities = activityService.findByDuration(duration);
        return ResponseEntity.ok(activities);
    }

}
