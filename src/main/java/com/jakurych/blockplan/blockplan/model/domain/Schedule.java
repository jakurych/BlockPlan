package com.jakurych.blockplan.blockplan.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Schedule {
    @Id
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany
    private List<Activity> activities;

}
