package com.empresa.app.features.representantePartido.dto;

public class RepresentantePartidoDto {
    private String idElector;
    private String dCasilla;
    private String dPartido;
    private Boolean confirma;
    private String protesta;
    private String dElector;

    public RepresentantePartidoDto(String idElector, String dCasilla, String dPartido, Boolean confirma, String protesta, String dElector) {
        this.idElector = idElector;
        this.dCasilla = dCasilla;
        this.dPartido = dPartido;
        this.confirma = confirma;
        this.protesta = protesta;
        this.dElector = dElector;
    }

    public String RepresentantePartidoToString() {
        return "RepresentantePartido [idElector=" + idElector + ", dCasilla=" + dCasilla + ", dPartido=" + dPartido
                + ", confirma=" + confirma + ", protesta=" + protesta + ", dElector=" + dElector + "]";
    }
}
