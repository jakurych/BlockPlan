package com.jakurych.blockplan.blockplan.dto.mappers;

import com.jakurych.blockplan.blockplan.dto.ActivityDto;
import com.jakurych.blockplan.blockplan.model.domain.Activity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActivityMapper {
    static ActivityMapper getInstance(){
        return Mappers.getMapper(ActivityMapper.class);
    }

    ActivityDto mapActivityToActivityDto(Activity ActivityDto);
    Activity mapActivityDtoToActivity(ActivityDto Activity);

}
