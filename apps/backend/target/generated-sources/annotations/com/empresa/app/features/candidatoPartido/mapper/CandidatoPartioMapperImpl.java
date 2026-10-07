package com.empresa.app.features.candidatoPartido.mapper;

import com.empresa.app.features.candidatoPartido.dto.CandidatoPartidoDto;
import com.empresa.app.features.candidatoPartido.entity.CandidatoPartido;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-07T10:56:46-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class CandidatoPartioMapperImpl implements CandidatoPartioMapper {

    @Override
    public CandidatoPartidoDto toDto(CandidatoPartido candidatoPartido) {
        if ( candidatoPartido == null ) {
            return null;
        }

        CandidatoPartidoDto candidatoPartidoDto = new CandidatoPartidoDto();

        return candidatoPartidoDto;
    }
}
