package com.empresa.app.features.casilla.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.casilla.dto.CasillaDto;
import com.empresa.app.features.casilla.entity.Casilla;

@Mapper(componentModel = "spring")
public interface CasillaMapper {

    CasillaDto toDto(Casilla casilla);
}
