package com.empresa.app.features.partido.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.partido.dto.PartidoDto;
import com.empresa.app.features.partido.entity.Partido;

@Mapper(componentModel = "spring")
public interface PartidoMapper {
 
    PartidoDto toDto(Partido partidoDto);
    }
