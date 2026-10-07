package com.empresa.app.features.votosPorCandidato.dto;

public class VotosPorCandidatoDto {
    private String idCandidato;
    private String dCandidato;
    private String dPartido;
    private Integer votos;

    public VotosPorCandidatoDto(String idCandidato, String dCandidato, String dPartido, Integer votos) {
        this.idCandidato = idCandidato;
        this.dCandidato = dCandidato;
        this.dPartido = dPartido;
        this.votos = votos;
    }

    public String VotosPorCandidatoDtoToString() {
        return "VotosPorCandidatoDto [idCandidato=" + idCandidato + ", dCandidato=" + dCandidato + ", dPartido="
                + dPartido + ", votos=" + votos + "]";
    }
}
