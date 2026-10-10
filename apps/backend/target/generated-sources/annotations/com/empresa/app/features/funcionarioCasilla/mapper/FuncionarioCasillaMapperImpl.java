package com.empresa.app.features.funcionarioCasilla.mapper;

import com.empresa.app.features.funcionarioCasilla.dto.FuncionarioCasillaDto;
import com.empresa.app.features.funcionarioCasilla.entity.FuncionarioCasilla;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T18:17:26-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class FuncionarioCasillaMapperImpl implements FuncionarioCasillaMapper {

    @Override
    public FuncionarioCasillaDto toDto(FuncionarioCasilla funcionarioCasilla) {
        if ( funcionarioCasilla == null ) {
            return null;
        }

        String dCasilla = null;
        Boolean confirma = null;

        dCasilla = funcionarioCasilla.getdCasilla();
        confirma = funcionarioCasilla.getConfirma();

        String idElector = null;
        String dElector = null;

        FuncionarioCasillaDto funcionarioCasillaDto = new FuncionarioCasillaDto( idElector, dCasilla, confirma, dElector );

        return funcionarioCasillaDto;
    }
}
