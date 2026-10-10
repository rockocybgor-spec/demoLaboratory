package com.empresa.app.features.casilla.mapper;

import com.empresa.app.features.casilla.dto.CasillaDto;
import com.empresa.app.features.casilla.entity.Casilla;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T18:17:26-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class CasillaMapperImpl implements CasillaMapper {

    @Override
    public CasillaDto toDto(Casilla casilla) {
        if ( casilla == null ) {
            return null;
        }

        String idCasilla = null;
        String dCasilla = null;
        String dDistritoElectoral = null;
        String dMunicipioDelegacion = null;

        CasillaDto casillaDto = new CasillaDto( idCasilla, dCasilla, dDistritoElectoral, dMunicipioDelegacion );

        return casillaDto;
    }
}
