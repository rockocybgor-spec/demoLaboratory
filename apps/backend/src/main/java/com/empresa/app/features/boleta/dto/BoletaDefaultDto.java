package com.empresa.app.features.boleta.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class BoletaDefaultDto{

    private String folioBoleta;
    private byte[] fotoBoleta;
    private String dCasilla;
    private String encabezado;
    private String entidaFederativa;
    private Integer circunscripcionPlurinominal;
    private Integer distritoElectoral;
    private Integer municipioDelegacion;
    private Boolean nulidad;
    private String dCandidatoPartido;

    public BoletaDefaultDto() {
    }
    
    public BoletaDefaultDto(String folioBoleta, byte[] fotoBoleta, String dCasilla, String encabezado, String entidaFederativa, Integer circunscripcionPlurinominal, Integer distritoElectoral, Integer municipioDelegacion, Boolean nulidad, String dCandidatoPartido){
        this.folioBoleta = folioBoleta;
        this.fotoBoleta = fotoBoleta;
        this.dCasilla = dCasilla;
        this.encabezado = encabezado;
        this.entidaFederativa = entidaFederativa;
        this.circunscripcionPlurinominal = circunscripcionPlurinominal;
        this.distritoElectoral = distritoElectoral;
        this.municipioDelegacion = municipioDelegacion;
        this.nulidad = nulidad;
        this.dCandidatoPartido = dCandidatoPartido;
    }
    public String BoletaDefaultDtoToString(){
        return "BoletaDefaultDto [folioBoleta=" + folioBoleta + ", fotoBoleta=" + fotoBoleta + ", dCasilla=" + dCasilla
                + ", encabezado=" + encabezado + ", entidaFederativa=" + entidaFederativa
                + ", circunscripcionPlurinominal=" + circunscripcionPlurinominal + ", distritoElectoral="
                + distritoElectoral + ", municipioDelegacion=" + municipioDelegacion + ", nulidad=" + nulidad
                + ", dCandidatoPartido=" + dCandidatoPartido + "]";
    }
/*
    public String getFolioBoleta() {
        return folioBoleta;
    }
    public void setFolioBoleta(String folioBoleta) {
        this.folioBoleta = folioBoleta;
    }
    public byte[] getFotoBoleta() {
        return fotoBoleta;  
    }
    public void setFotoBoleta(byte[] fotoBoleta) {
        this.fotoBoleta = fotoBoleta;
    }
    public String getdCasilla() {
        return dCasilla;    
    }   
    public void setdCasilla(String dCasilla) {
        this.dCasilla = dCasilla;
    }
    public String getEncabezado() {
        return encabezado;
    }   
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }
    public String getEntidaFederativa() {
        return entidaFederativa;
    }
    public void setEntidaFederativa(String entidaFederativa) {
        this.entidaFederativa = entidaFederativa;
    }
    public Integer getCircunscripcionPlurinominal() {
        return circunscripcionPlurinominal;
    }
    public void setCircunscripcionPlurinominal(Integer circunscripcionPlurinominal) {
        this.circunscripcionPlurinominal = circunscripcionPlurinominal;
    }
    public Integer getDistritoElectoral() {
        return distritoElectoral;
    }
    public void setDistritoElectoral(Integer distritoElectoral) {
        this.distritoElectoral = distritoElectoral;
    }
    public Integer getMunicipioDelegacion() {
        return municipioDelegacion;
    }
    public void setMunicipioDelegacion(Integer municipioDelegacion) {
        this.municipioDelegacion = municipioDelegacion;
    }
    public Boolean getNulidad() {
        return nulidad;
    }
    public void setNulidad(Boolean nulidad) {
        this.nulidad = nulidad;
    }
    public String getdCandidatoPartido() {
        return dCandidatoPartido;   
    }
    public void setdCandidatoPartido(String dCandidatoPartido) {
        this.dCandidatoPartido = dCandidatoPartido;
    }   
*/
}