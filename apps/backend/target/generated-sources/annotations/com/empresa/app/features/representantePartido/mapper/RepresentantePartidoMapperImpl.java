package com.empresa.app.features.representantePartido.mapper;

import com.empresa.app.features.representantePartido.entity.RepresentantePartido;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-07T10:56:46-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class RepresentantePartidoMapperImpl implements RepresentantePartidoMapper {

    @Override
    public RepresentantePartido toDto(RepresentantePartido representantePartidoDto) {
        if ( representantePartidoDto == null ) {
            return null;
        }

        RepresentantePartido representantePartido = new RepresentantePartido();

        representantePartido.setClaveElector( representantePartidoDto.getClaveElector() );
        representantePartido.setDActaEscrutinio( representantePartidoDto.getDActaEscrutinio() );
        representantePartido.setNombres( representantePartidoDto.getNombres() );
        representantePartido.setApellidoM( representantePartidoDto.getApellidoM() );
        representantePartido.setApellidoP( representantePartidoDto.getApellidoP() );
        byte[] fotoCredencial = representantePartidoDto.getFotoCredencial();
        if ( fotoCredencial != null ) {
            representantePartido.setFotoCredencial( Arrays.copyOf( fotoCredencial, fotoCredencial.length ) );
        }
        representantePartido.setHaVotado( representantePartidoDto.getHaVotado() );
        representantePartido.setdCasilla( representantePartidoDto.getdCasilla() );
        representantePartido.setdPartido( representantePartidoDto.getdPartido() );
        representantePartido.setConfirma( representantePartidoDto.getConfirma() );
        representantePartido.setProtesta( representantePartidoDto.getProtesta() );

        return representantePartido;
    }
}
