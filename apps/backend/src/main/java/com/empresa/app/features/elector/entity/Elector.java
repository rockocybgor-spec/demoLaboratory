package com.empresa.app.features.elector.entity;

import java.io.Serializable;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "ELECTOR")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TIPO_ELECTOR", discriminatorType = DiscriminatorType.STRING)
@Getter 
@Setter 
public abstract class Elector implements Serializable {

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "claveElector")
    private String claveElector;

    @Column (name = "dActaEscrutinio")
    private String dActaEscrutinio;

    @Column (name = "nombres")
    private String nombres;

    @Column (name = "apellidoM")
    private String apellidoM;

    @Column (name = "ApellidoP")
    private String apellidoP;

    @Lob
    @Column (name = "fotoCredencial", columnDefinition = "BLOB")
    private byte[] fotoCredencial;

    @Column (name = "haVotado")
    private Boolean haVotado;

    public String getClaveElector() {
        return claveElector;
    }

    public String ElectorToString(){
        return "Elector [claveElector=" + claveElector + ", dActaEscrutinio=" + dActaEscrutinio + ", nombres=" + nombres
                + ", apellidoM=" + apellidoM + ", apellidoP=" + apellidoP + ", fotoCredencial=" + fotoCredencial
                + ", haVotado=" + haVotado + "]";
    }


/*//GETTERS SETTERS
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

    public Elector(Integer idElector, String dElector) {
        this.claveElector = dElector;
    }
   */
}