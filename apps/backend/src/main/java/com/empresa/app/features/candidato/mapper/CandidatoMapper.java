package com.empresa.app.features.candidato.mapper;

import org.mapstruct.Mapper;

import com.empresa.app.features.candidato.dto.CandidatoDto;
import com.empresa.app.features.candidato.entity.Candidato;

@Mapper(componentModel = "spring")
public interface CandidatoMapper {
        
    CandidatoDto aDto(Candidato candidato);
}
