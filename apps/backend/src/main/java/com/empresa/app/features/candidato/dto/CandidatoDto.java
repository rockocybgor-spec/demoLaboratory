package com.empresa.app.features.candidato.dto;

public class CandidatoDto {

    private  String tipoCandidaturaDto;
    private  String entidadDto;
    private  String gradoAcademicoDto;
    private  String dElectorDto;

    public CandidatoDto(String tipoCandidaturaDto, String entidadDto, String gradoAcademicoDto, String dElectorDto) {
        this.tipoCandidaturaDto = tipoCandidaturaDto;
        this.entidadDto = entidadDto;
        this.gradoAcademicoDto = gradoAcademicoDto;
        this.dElectorDto = dElectorDto;
    }

    public String CandidatoDtoToString() {
        return "CandidatoDto [tipoCandidaturaDto=" + tipoCandidaturaDto + ", entidadDto=" + entidadDto
                + ", gradoAcademicoDto=" + gradoAcademicoDto + ", dElectorDto=" + dElectorDto + "]";
    }
    
}
