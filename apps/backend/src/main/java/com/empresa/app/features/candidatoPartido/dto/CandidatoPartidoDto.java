package com.empresa.app.features.candidatoPartido.dto;


public class CandidatoPartidoDto {
   private String idCandidatoPartido;
   private String dCandidato;
   private String dPartido;


    public CandidatoPartidoDto() {
    }

    public CandidatoPartidoDto(String idCandidatoPartido, String dCandidato, String dPartido){
        this.idCandidatoPartido = idCandidatoPartido;
        this.dCandidato = dCandidato;
        this.dPartido = dPartido;       
    }

    public String CandidatoPartidoDtoToString(){
        return "CandidatoPartidoDto [idCandidatoPartido=" + idCandidatoPartido + ", dCandidato=" + dCandidato
                + ", dPartido=" + dPartido + "]";
    }

}

