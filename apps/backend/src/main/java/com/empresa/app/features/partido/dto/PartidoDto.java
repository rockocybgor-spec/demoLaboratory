package com.empresa.app.features.partido.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class PartidoDto {
    private String iduPartido;
    private String nombrePartido;
    private String siglas;
    private byte[] emblema;

    public PartidoDto(String iduPartido, String nombrePartido, String siglas, byte[] emblema) {
        this.iduPartido = iduPartido;
        this.nombrePartido = nombrePartido;
        this.siglas = siglas;
        this.emblema = emblema;
    }
}
