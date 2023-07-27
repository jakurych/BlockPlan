package com.jakurych.blockplan.blockplan.dto.mappers;

import com.jakurych.blockplan.blockplan.dto.CategoryDto;
import com.jakurych.blockplan.blockplan.model.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    static CategoryMapper getInstance(){
        return Mappers.getMapper(CategoryMapper.class);
    }

    CategoryDto mapCategoryToDto(Category CategoryDto);

}