package com.empresa.app.features.votosPorPartido.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "VOTOSPORPARTIDO",
    uniqueConstraints = @UniqueConstraint (columnNames = "folioActaEscrutinio")
)
public class VotosPorPartido implements Serializable{


    @Id
    @NotBlank
    @Column(name="dCasilla")
    private String dCasilla;
    @Column(name = "dPartido")
    private String dPartido;
    @Column (name = "conteoCaptura")
    private Integer conteoCaptura;
    @Column (name = "conteoAutimatizado")
    private Integer conteoAutomatizado;
    
    public String getdCasilla() {
        return dCasilla;
    }
    public void setdCasilla(String dCasilla) {
        this.dCasilla = dCasilla;
    }
    
    public String getdPartido() {
        return dPartido;
    }
    public void setdPartido(String dPartido) {
        this.dPartido = dPartido;
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
