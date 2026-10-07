package com.empresa.app.features.partido.mapper;

import com.empresa.app.features.partido.dto.PartidoDto;
import com.empresa.app.features.partido.entity.Partido;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-07T10:56:46-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class PartidoMapperImpl implements PartidoMapper {

    @Override
    public PartidoDto toDto(Partido partidoDto) {
        if ( partidoDto == null ) {
            return null;
        }

        String iduPartido = null;
        String nombrePartido = null;
        String siglas = null;
        byte[] emblema = null;

        iduPartido = partidoDto.getIduPartido();
        nombrePartido = partidoDto.getNombrePartido();
        siglas = partidoDto.getSiglas();
        byte[] emblema1 = partidoDto.getEmblema();
        if ( emblema1 != null ) {
            emblema = Arrays.copyOf( emblema1, emblema1.length );
        }

        PartidoDto partidoDto1 = new PartidoDto( iduPartido, nombrePartido, siglas, emblema );

        return partidoDto1;
    }
}
