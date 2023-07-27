package com.jakurych.blockplan.blockplan.dto;

import com.jakurych.blockplan.blockplan.model.domain.Activity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

public class ScheduleDto {

    @Id
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany
    private List<Activity> activities;

}
