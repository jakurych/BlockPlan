package com.jakurych.blockplan.blockplan.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.Duration;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter

public class ActivityDto {
    @Id
    private int id;
    private String name;
    private Duration duration;
    private Color color;
}
