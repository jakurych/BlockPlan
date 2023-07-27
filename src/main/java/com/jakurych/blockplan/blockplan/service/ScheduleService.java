package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.Schedule;
import com.jakurych.blockplan.blockplan.model.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    public Schedule createOrUpdate(Schedule schedule){
        return scheduleRepository.save(schedule);
    }
    public void delete (int id){
        scheduleRepository.deleteById(id);
    }
    public Schedule findById(int id){
        return scheduleRepository.findById(id).orElse(null);
    }
    public List<Schedule> findAll(){
        return scheduleRepository.findAll();
    }


}
