package com.empresa.app.features.votosPorCandidato.mapper;

import com.empresa.app.features.votosPorCandidato.dto.VotosPorCandidatoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T18:17:26-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class VotosPorCandidatoMapperImpl implements VotosPorCandidatoMapper {

    @Override
    public VotosPorCandidatoDto toDto(String idCandidato, String dCandidato, String dPartido, Integer votos) {
        if ( idCandidato == null && dCandidato == null && dPartido == null && votos == null ) {
            return null;
        }

        String idCandidato1 = null;
        idCandidato1 = idCandidato;
        String dCandidato1 = null;
        dCandidato1 = dCandidato;
        String dPartido1 = null;
        dPartido1 = dPartido;
        Integer votos1 = null;
        votos1 = votos;

        VotosPorCandidatoDto votosPorCandidatoDto = new VotosPorCandidatoDto( idCandidato1, dCandidato1, dPartido1, votos1 );

        return votosPorCandidatoDto;
    }
}
