package com.jakurych.blockplan.blockplan.controller;

import com.jakurych.blockplan.blockplan.model.domain.Schedule;
import com.jakurych.blockplan.blockplan.service.ScheduleService;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/schedule",produces = MediaType.APPLICATION_JSON_VALUE)
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ResponseEntity<Schedule> create(@RequestBody Schedule schedule){
        return ResponseEntity.ok(scheduleService.createOrUpdate(schedule));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        scheduleService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Schedule>  find(@PathVariable int id ){
        Schedule schedule = scheduleService.findById(id);
        if(schedule != null){
            return ResponseEntity.ok(schedule);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Schedule>> findAll(){
        List<Schedule> schedules = scheduleService.findAll();
        return ResponseEntity.ok(schedules);
    }

}
