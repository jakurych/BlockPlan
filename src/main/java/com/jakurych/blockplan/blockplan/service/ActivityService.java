package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.Activity;
import com.jakurych.blockplan.blockplan.model.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository activityRepository;

    public Activity createOrUpdate(Activity activity) {
        return activityRepository.save(activity);
    }

    public void delete(Integer id) {
        activityRepository.deleteById(id);
    }

    public Activity findById(int id) {
        return activityRepository.findById(id).orElse(null);
    }

    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    public Activity findByName(String name) {
        return activityRepository.findByName(name);
    }

    public List<Activity> findByDuration(Duration duration) {
        return activityRepository.findByDuration(duration);
    }

}
