package com.jakurych.blockplan.blockplan.dto.mappers;

import com.jakurych.blockplan.blockplan.dto.ScheduleDto;
import com.jakurych.blockplan.blockplan.model.domain.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper {
    static ScheduleMapper getInstance(){
        return Mappers.getMapper(ScheduleMapper.class);
    }

    ScheduleDto mapScheduleToDto(Schedule ScheduleDto);

}