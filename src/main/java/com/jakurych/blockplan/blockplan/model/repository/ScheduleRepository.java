package com.jakurych.blockplan.blockplan.model.repository;

import com.jakurych.blockplan.blockplan.model.domain.Schedule;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.*;
import java.time.Duration;
import java.util.List;
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
