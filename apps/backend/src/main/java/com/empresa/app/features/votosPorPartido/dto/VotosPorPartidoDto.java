package com.empresa.app.features.votosPorPartido.dto;

public class VotosPorPartidoDto {
    private String idPartido;
    private String dPartido;
    private Integer votos;

    public VotosPorPartidoDto(String idPartido, String dPartido, Integer votos) {
        this.idPartido = idPartido;
        this.dPartido = dPartido;
        this.votos = votos;
    }

    public String VotosPorPartidoDtoToString() {
        return "VotosPorPartidoDto [idPartido=" + idPartido + ", dPartido=" + dPartido + ", votos=" + votos + "]";
    }
}
