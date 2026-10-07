package com.empresa.app.features.candidato.mapper;

import com.empresa.app.features.candidato.dto.CandidatoDto;
import com.empresa.app.features.candidato.entity.Candidato;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-07T10:56:46-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class CandidatoMapperImpl implements CandidatoMapper {

    @Override
    public CandidatoDto aDto(Candidato candidato) {
        if ( candidato == null ) {
            return null;
        }

        String tipoCandidaturaDto = null;
        String entidadDto = null;
        String gradoAcademicoDto = null;
        String dElectorDto = null;

        CandidatoDto candidatoDto = new CandidatoDto( tipoCandidaturaDto, entidadDto, gradoAcademicoDto, dElectorDto );

        return candidatoDto;
    }
}
