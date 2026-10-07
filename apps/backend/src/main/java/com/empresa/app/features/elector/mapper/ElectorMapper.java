package com.empresa.app.features.elector.mapper;

import org.mapstruct.Mapper;

import com.empresa.app.features.elector.dto.ElectorDto;
import com.empresa.app.features.elector.entity.Elector;

@Mapper(componentModel = "spring")
public interface ElectorMapper {
    ElectorDto toDto(Elector elector);

}
