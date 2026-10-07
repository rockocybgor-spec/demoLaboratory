package com.empresa.app.features.votosPorCandidato.entity;
import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table (name = "VOTOSPORCANDIDATO",
    uniqueConstraints = @UniqueConstraint (columnNames = "folioActaEscrutinio")
)
public class VotosPorCandidato implements Serializable{

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dActaEscrutinio")
    private String dActaEscrutinio;

    @Column (name = "dCandidato")
    private String dCandidato;
    @Column (name= "conteoCaptura")
    private Integer conteoCaptura;
    @Column (name = "conteoAutomatizado")
    private Integer conteoAutomatizado;
    
    public String getdCandidato() {
        return dCandidato;
    }
    public void setdCandidato(String dCandidato) {
        this.dCandidato = dCandidato;
    }
    public Integer getConteoCaptura() {
        return conteoCaptura;
    }
    public void setConteoCaptura(Integer conteoCaptura) {
        this.conteoCaptura = conteoCaptura;
    }
    public Integer getConteoAutomatizado() {
        return conteoAutomatizado;
    }
    public void setConteoAutomatizado(Integer conteoAutomatizado) {
        this.conteoAutomatizado = conteoAutomatizado;
    }
    
    

}