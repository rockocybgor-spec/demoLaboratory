package com.empresa.app.features.boleta.dto;

public class BoletaCustomDto{

    private String folioBoletaDto;
    private byte[] fotoBoletaDto;
    private String dCasillaDto;
    private String encabezadoDto;
    private String entidaFederativaDto;
    private Integer circunscripcionPlurinominalDto;
    private Integer distritoElectoralDto;
    private Integer municipioDelegacionDto;
    private Boolean nulidadDto;
    private String dCandidatoPartidoDto;

    public BoletaCustomDto() {
    }

    public BoletaCustomDto(String folioBoletaDto, byte[] fotoBoletaDto, String dCasillaDto, String encabezadoDto, String entidaFederativaDto, Integer circunscripcionPlurinominalDto, Integer distritoElectoralDto, Integer municipioDelegacionDto, Boolean nulidadDto, String dCandidatoPartidoDto){
        this.folioBoletaDto = folioBoletaDto;
        this.fotoBoletaDto = fotoBoletaDto;
        this.dCasillaDto = dCasillaDto;
        this.encabezadoDto = encabezadoDto;
        this.entidaFederativaDto = entidaFederativaDto;
        this.circunscripcionPlurinominalDto = circunscripcionPlurinominalDto;
        this.distritoElectoralDto = distritoElectoralDto;
        this.municipioDelegacionDto = municipioDelegacionDto;
        this.nulidadDto = nulidadDto;
        this.dCandidatoPartidoDto = dCandidatoPartidoDto;
    }

    public String BoletaCustomDtoToString(){
        return "BoletaCustomDto [folioBoletaDto=" + folioBoletaDto + ", fotoBoletaDto=" + fotoBoletaDto + ", dCasillaDto=" + dCasillaDto
                + ", encabezadoDto=" + encabezadoDto + ", entidaFederativaDto=" + entidaFederativaDto
                + ", circunscripcionPlurinominalDto=" + circunscripcionPlurinominalDto + ", distritoElectoralDto="
                + distritoElectoralDto + ", municipioDelegacionDto=" + municipioDelegacionDto + ", nulidadDto=" + nulidadDto
                + ", dCandidatoPartidoDto=" + dCandidatoPartidoDto + "]";
    }
}

