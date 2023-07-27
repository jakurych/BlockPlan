package com.jakurych.blockplan.blockplan.dto.mappers;

import com.jakurych.blockplan.blockplan.dto.NotificationDto;
import com.jakurych.blockplan.blockplan.model.domain.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotificationMapper {
    static NotificationMapper getInstance(){
        return Mappers.getMapper(NotificationMapper.class);
    }

    NotificationDto mapNotificationToDto(Notification NotificationDto);

}