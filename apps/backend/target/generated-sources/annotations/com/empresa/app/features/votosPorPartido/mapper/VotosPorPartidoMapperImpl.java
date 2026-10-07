package com.empresa.app.features.votosPorPartido.mapper;

import com.empresa.app.features.votosPorPartido.dto.VotosPorPartidoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-07T10:56:46-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class VotosPorPartidoMapperImpl implements VotosPorPartidoMapper {

    @Override
    public VotosPorPartidoDto toDto(String idPartido, String dPartido, Integer votos) {
        if ( idPartido == null && dPartido == null && votos == null ) {
            return null;
        }

        String idPartido1 = null;
        idPartido1 = idPartido;
        String dPartido1 = null;
        dPartido1 = dPartido;
        Integer votos1 = null;
        votos1 = votos;

        VotosPorPartidoDto votosPorPartidoDto = new VotosPorPartidoDto( idPartido1, dPartido1, votos1 );

        return votosPorPartidoDto;
    }
}
