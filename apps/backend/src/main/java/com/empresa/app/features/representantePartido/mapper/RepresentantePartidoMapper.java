package com.empresa.app.features.representantePartido.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.representantePartido.entity.RepresentantePartido;

@Mapper(componentModel = "spring")
public interface RepresentantePartidoMapper {
    RepresentantePartido toDto(RepresentantePartido representantePartidoDto);   
}
