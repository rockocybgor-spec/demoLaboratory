package com.empresa.app.features.votosPorPartido.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.votosPorPartido.dto.VotosPorPartidoDto;

@Mapper(componentModel = "spring")
public interface VotosPorPartidoMapper {
    VotosPorPartidoDto toDto(String idPartido, String dPartido, Integer votos);
}
