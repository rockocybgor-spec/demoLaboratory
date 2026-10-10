package com.empresa.app.features.boleta.mapper;

import com.empresa.app.features.boleta.dto.BoletaCustomDto;
import com.empresa.app.features.boleta.dto.BoletaDefaultDto;
import com.empresa.app.features.boleta.entity.Boleta;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T18:17:26-0600",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Arch Linux)"
)
@Component
public class BoletaMapperImpl implements BoletaMapper {

    @Override
    public BoletaDefaultDto boletaToBoletaDefaultDto(Boleta boleta) {
        if ( boleta == null ) {
            return null;
        }

        BoletaDefaultDto boletaDefaultDto = new BoletaDefaultDto();

        boletaDefaultDto.setFolioBoleta( boleta.getFolioBoleta() );
        byte[] fotoBoleta = boleta.getFotoBoleta();
        if ( fotoBoleta != null ) {
            boletaDefaultDto.setFotoBoleta( Arrays.copyOf( fotoBoleta, fotoBoleta.length ) );
        }
        boletaDefaultDto.setDCasilla( boleta.getDCasilla() );
        boletaDefaultDto.setEncabezado( boleta.getEncabezado() );
        boletaDefaultDto.setEntidaFederativa( boleta.getEntidaFederativa() );
        boletaDefaultDto.setCircunscripcionPlurinominal( boleta.getCircunscripcionPlurinominal() );
        boletaDefaultDto.setDistritoElectoral( boleta.getDistritoElectoral() );
        boletaDefaultDto.setMunicipioDelegacion( boleta.getMunicipioDelegacion() );
        boletaDefaultDto.setNulidad( boleta.getNulidad() );
        boletaDefaultDto.setDCandidatoPartido( boleta.getDCandidatoPartido() );

        return boletaDefaultDto;
    }

    @Override
    public BoletaCustomDto boletaToBoletaCustomDto(Boleta boleta) {
        if ( boleta == null ) {
            return null;
        }

        BoletaCustomDto boletaCustomDto = new BoletaCustomDto();

        return boletaCustomDto;
    }
}
