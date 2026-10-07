package com.empresa.app.features.boleta.mapper;

import com.empresa.app.features.boleta.dto.BoletaCustomDto;
import com.empresa.app.features.boleta.dto.BoletaDefaultDto;
import com.empresa.app.features.boleta.entity.Boleta;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoletaMapper {
    
    BoletaDefaultDto boletaToBoletaDefaultDto(Boleta boleta);
    BoletaCustomDto boletaToBoletaCustomDto(Boleta boleta);
}