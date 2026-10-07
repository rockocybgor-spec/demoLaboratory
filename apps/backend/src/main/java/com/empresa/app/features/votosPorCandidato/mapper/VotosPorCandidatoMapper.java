package com.empresa.app.features.votosPorCandidato.mapper;

import org.mapstruct.Mapper;
import com.empresa.app.features.votosPorCandidato.dto.VotosPorCandidatoDto;

@Mapper(componentModel = "spring")
public interface VotosPorCandidatoMapper {

    VotosPorCandidatoDto toDto(String idCandidato, String dCandidato, String dPartido, Integer votos);  
}
