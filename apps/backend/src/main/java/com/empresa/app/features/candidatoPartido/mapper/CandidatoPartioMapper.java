package com.empresa.app.features.candidatoPartido.mapper;

import com.empresa.app.features.candidatoPartido.dto.CandidatoPartidoDto;
import com.empresa.app.features.candidatoPartido.entity.CandidatoPartido;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidatoPartioMapper {


    CandidatoPartidoDto toDto(CandidatoPartido candidatoPartido);
}
