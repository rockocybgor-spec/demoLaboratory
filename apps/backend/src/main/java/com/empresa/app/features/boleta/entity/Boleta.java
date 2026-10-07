package com.empresa.app.features.boleta.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "BOLETA",
    uniqueConstraints = @UniqueConstraint (columnNames = "folioBoleta")
)
@Getter
@Setter 
@NoArgsConstructor 
public class Boleta implements Serializable {

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="folioBoleta")
    private String folioBoleta;
    @Lob
    @Column (name ="fotoBoleta", columnDefinition = "BLOB")
    private byte[] fotoBoleta;

    @Column (name = "dCasilla")
    private String dCasilla;

    @Column (name="encabezado")
    private String encabezado;

    @Column (name = "entidadFederativa")
    private String entidaFederativa;

    @Column (name = "circunscripcionPlurinominal")
    private Integer circunscripcionPlurinominal;

    @Column (name = "distritoElectoral")
    private Integer distritoElectoral;

    @Column (name = "municipioDelegacion")
    private Integer municipioDelegacion;

    @Column (name = "nulidad")
    private Boolean nulidad;

    @Column (name = "dCandidato")
    private String dCandidatoPartido;


public Boleta(Integer circunscripcionPlurinominal, String dCandidato, String dCasilla, Integer distritoElectoral, String encabezado, String entidaFederativa, String folioBoleta, byte[] fotoBoleta, Integer municipioDelegacion, Boolean nulidad){
    this.circunscripcionPlurinominal = circunscripcionPlurinominal;
    this.dCandidatoPartido = dCandidato;
    this.dCasilla = dCasilla;
    this.distritoElectoral = distritoElectoral;
    this.encabezado = encabezado;
    this.entidaFederativa = entidaFederativa;
    this.folioBoleta = folioBoleta;
    this.fotoBoleta = fotoBoleta;
    this.municipioDelegacion = municipioDelegacion;
    this.nulidad = nulidad;
}

public String toString() {
    return "Boleta [folioBoleta=" + folioBoleta + ", fotoBoleta=" + fotoBoleta + ", dCasilla=" + dCasilla
            + ", encabezado=" + encabezado + ", entidaFederativa=" + entidaFederativa
            + ", circunscripcionPlurinominal=" + circunscripcionPlurinominal + ", distritoElectoral="
            + distritoElectoral + ", municipioDelegacion=" + municipioDelegacion + ", nulidad=" + nulidad
            + ", dCandidatoPartido=" + dCandidatoPartido + "]";
}

}