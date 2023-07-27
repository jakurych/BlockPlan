package com.jakurych.blockplan.blockplan.model.repository;

import com.jakurych.blockplan.blockplan.model.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.*;
import java.time.Duration;
import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    List<Activity> findByDuration(Duration duration);
    Activity findByName(String name);


}
