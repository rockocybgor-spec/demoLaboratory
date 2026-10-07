package com.empresa.app.features.candidatoPartido.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "CANDIDATOPARTIDO",
    uniqueConstraints = @UniqueConstraint (columnNames = "idCandidatoPartido")
)
@Getter 
@Setter 
@NoArgsConstructor 
public class CandidatoPartido implements Serializable {
    //IdVirtual
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String idCandidatoPartido;

    @Column (name = "dCandidato")
    private String dCandidato;

    @Column (name = "dPartido")
    private String dPartido;
/*
    public String getIdCandidatoPartido() {
        return idCandidatoPartido;
    }

    public void setIdCandidatoPartido(String idCandidatoPartido) {
        this.idCandidatoPartido = idCandidatoPartido;
    }

    public String getdCandidato() {
        return dCandidato;
    }

    public void setdCandidato(String dCandidato) {
        this.dCandidato = dCandidato;
    }

    public String getdPartido() {
        return dPartido;
    }

    public void setdPartido(String dPartido) {
        this.dPartido = dPartido;
    }

*/
    public CandidatoPartido(String idCandidatoPartido, String dCandidato, String dPartido) {
        this.idCandidatoPartido = idCandidatoPartido;
        this.dCandidato = dCandidato;
        this.dPartido = dPartido;
    }
    public String CandidatoPartidoToString() {
        return "CandidatoPartido [idCandidatoPartido=" + idCandidatoPartido + ", dCandidato=" + dCandidato
                + ", dPartido=" + dPartido + "]";
    }

}