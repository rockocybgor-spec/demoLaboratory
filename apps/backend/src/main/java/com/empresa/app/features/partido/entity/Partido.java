package com.empresa.app.features.partido.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "PARTIDO",
    uniqueConstraints = @UniqueConstraint( columnNames = "iduPartido")
)
@Getter
@Setter 
public class Partido implements Serializable {

@Id
@NotBlank
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name = "iduPartido")
private String iduPartido;

@Column (name = "nombrePartido")
private String nombrePartido;

@Column (name = "siglas")
private String siglas;

@Lob
@Column (name = "emblema", columnDefinition = "BLOB")
private byte[] emblema;
/*
// GETTERS SETTERS
public String getIduPartido() {
    return iduPartido;
}

public void setIduPartido(String iduPartido) {
    this.iduPartido = iduPartido;
}

public String getNombrePartido() {
    return nombrePartido;
}

public void setNombrePartido(String nombrePartido) {
    this.nombrePartido = nombrePartido;
}

public String getSiglas() {
    return siglas;
}

public void setSiglas(String siglas) {
    this.siglas = siglas;
}

public byte[] getEmpblema() {
    return emblema;
}

public void setEmpblema(byte[] empblema) {
    this.emblema = empblema;
}
*/
public String PartidoToString() {
    return "Partido [iduPartido=" + iduPartido + ", nombrePartido=" + nombrePartido + ", siglas=" + siglas
            + ", emblema=" + emblema + "]";
}

public Partido(String iduPartido, String nombrePartido, String siglas, byte[] emblema) {
    this.iduPartido = iduPartido;
    this.nombrePartido = nombrePartido;
    this.siglas = siglas;
    this.emblema = emblema;
}

}

