package com.empresa.app.features.funcionarioCasilla.dto;

public class FuncionarioCasillaDto {
    private String dElector;
    private String dCasilla;
    private Boolean confirma;

    public FuncionarioCasillaDto(String idElector, String dCasilla, Boolean confirma, String dElector) {
        this.dElector = idElector;
        this.dCasilla = dCasilla;
        this.confirma = confirma;
    }

    public String FuncionarioCasillaDtoToString() {
        return "FuncionarioCasillaDto [dElector=" + dElector + ", dCasilla=" + dCasilla + ", confirma=" + confirma
                +  "]";
    }
}
