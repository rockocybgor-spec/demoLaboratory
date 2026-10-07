package com.empresa.app.features.funcionarioCasilla.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.funcionarioCasilla.dto.FuncionarioCasillaDto;
import com.empresa.app.features.funcionarioCasilla.entity.FuncionarioCasilla;


@Mapper(componentModel = "spring")
public interface FuncionarioCasillaMapper {
    FuncionarioCasillaDto toDto(FuncionarioCasilla funcionarioCasilla);
}
