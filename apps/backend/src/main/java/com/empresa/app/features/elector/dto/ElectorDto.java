package com.empresa.app.features.elector.dto;

public class ElectorDto {
    private String claveElector;
    private String dActaEscrutinio;
    private String nombres;
    private String apellidoM;
    private String apellidoP;
    private byte[] fotoCredencial;
    private Boolean haVotado;

    public ElectorDto(String claveElector, String dActaEscrutinio, String nombres, String apellidoM, String apellidoP,
            byte[] fotoCredencial, Boolean haVotado) {
        this.claveElector = claveElector;
        this.dActaEscrutinio = dActaEscrutinio;
        this.nombres = nombres;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.fotoCredencial = fotoCredencial;
        this.haVotado = haVotado;
    }

    public String ElectorDtoToString() {
        return "ElectorDto [claveElector=" + claveElector + ", dActaEscrutinio=" + dActaEscrutinio + ", nombres="
                + nombres + ", apellidoM=" + apellidoM + ", apellidoP=" + apellidoP + ", fotoCredencial="
                + fotoCredencial + ", haVotado=" + haVotado + "]";
    }

    public ElectorDto() {
    }

    public String getClaveElector() {
        return claveElector;
    }

    public void setClaveElector(String claveElector) {
        this.claveElector = claveElector;
    }

    public String getdActaEscrutinio() {
        return dActaEscrutinio;
    }

    public void setdActaEscrutinio(String dActaEscrutinio) {
        this.dActaEscrutinio = dActaEscrutinio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public byte[] getFotoCredencial() {
        return fotoCredencial;
    }

    public void setFotoCredencial(byte[] fotoCredencial) {
        this.fotoCredencial = fotoCredencial;
    }

    public Boolean getHaVotado() {
        return haVotado;
    }

    public void setHaVotado(Boolean haVotado) {
        this.haVotado = haVotado;
    }
}
