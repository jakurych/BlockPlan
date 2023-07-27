package com.jakurych.blockplan.blockplan.dto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.jakurych.blockplan.blockplan.model.domain.User;
import com.jakurych.blockplan.blockplan.dto.UserDto;


@Mapper
public interface UserMapper {
    static UserMapper getInstance(){
        return Mappers.getMapper(UserMapper.class);
    }

    UserDto mapUserToDto(User UserDto);

}
