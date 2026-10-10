package com.empresa.app.features.elector.mapper;

import com.empresa.app.features.elector.dto.ElectorDto;
import com.empresa.app.features.elector.entity.Elector;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T18:17:26-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class ElectorMapperImpl implements ElectorMapper {

    @Override
    public ElectorDto toDto(Elector elector) {
        if ( elector == null ) {
            return null;
        }

        ElectorDto electorDto = new ElectorDto();

        electorDto.setClaveElector( elector.getClaveElector() );
        electorDto.setNombres( elector.getNombres() );
        electorDto.setApellidoM( elector.getApellidoM() );
        electorDto.setApellidoP( elector.getApellidoP() );
        byte[] fotoCredencial = elector.getFotoCredencial();
        if ( fotoCredencial != null ) {
            electorDto.setFotoCredencial( Arrays.copyOf( fotoCredencial, fotoCredencial.length ) );
        }
        electorDto.setHaVotado( elector.getHaVotado() );

        return electorDto;
    }
}
