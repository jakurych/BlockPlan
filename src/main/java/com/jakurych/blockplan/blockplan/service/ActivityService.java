package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.Activity;
import com.jakurych.blockplan.blockplan.model.domain.Test;
import com.jakurych.blockplan.blockplan.model.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //??
public class ActivityService {
    private final ActivityRepository activityRepository;
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }


}
