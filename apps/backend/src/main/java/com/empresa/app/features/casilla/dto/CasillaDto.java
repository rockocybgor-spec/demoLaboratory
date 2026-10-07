package com.empresa.app.features.casilla.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CasillaDto {
    private String idCasilla;
    private String dCasilla;
    private String dDistritoElectoral;
    private String dMunicipioDelegacion;

    public CasillaDto(String idCasilla, String dCasilla, String dDistritoElectoral, String dMunicipioDelegacion) {
        this.idCasilla = idCasilla;
        this.dCasilla = dCasilla;
        this.dDistritoElectoral = dDistritoElectoral;
        this.dMunicipioDelegacion = dMunicipioDelegacion;
    }

    public String CasillaDtoToString() {
        return "CasillaDto [idCasilla=" + idCasilla + ", dCasilla=" + dCasilla + ", dDistritoElectoral="
                + dDistritoElectoral + ", dMunicipioDelegacion=" + dMunicipioDelegacion + "]";
    }
}
