package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.dto.ActivityDto;
import com.jakurych.blockplan.blockplan.dto.mappers.ActivityMapper;
import com.jakurych.blockplan.blockplan.model.domain.Activity;
import com.jakurych.blockplan.blockplan.model.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository activityRepository;
    private final ActivityMapper activityMapper;

  public ActivityDto createOrUpdate(ActivityDto activityDto){
      Activity activity = activityMapper.mapActivityDtoToActivity(activityDto);
      Activity savedActivity = activityRepository.save(activity);
      return activityMapper.mapActivityToActivityDto(savedActivity);

  }

    public ActivityDto delete(Integer id) {
      Activity activity = findById(id);
      if(activity != null){
          activityRepository.delete(activity);
          return activityMapper.mapActivityToActivityDto(activity);
      }else{
          return null;
      }
    }

    public ActivityDto findById(int id) {
      Activity activity = activityRepository.findById(id).orElse(null);
        return activityMapper.mapActivityToActivityDto(activity);
    }

    public List<ActivityDto> findAll() {
        List<Activity>  activities = activityRepository.findAll();
        return activities.stream().map(activityMapper::mapActivityToActivityDto).collect(Collectors.toList());
    }

    public Activity findByName(String name) {
        return activityRepository.findByName(name);
    }

    public List<Activity> findByDuration(Duration duration) {
        return activityRepository.findByDuration(duration);
    }

}
