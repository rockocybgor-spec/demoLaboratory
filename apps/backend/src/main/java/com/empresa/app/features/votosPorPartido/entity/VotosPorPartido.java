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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dActaEscrutinio")
    private String dActaEscrutinio;
    @Column(name = "dPartido")
    private String dPartido;
    @Column (name = "conteoCaptura")
    private Integer conteoCaptura;
    @Column (name = "conteoAutimatizado")
    private Integer conteoAutomatizado;
    
    public String getdActaDeEscrutinio() {
        return dActaEscrutinio;
    }
    public void setDActaDeEscrutinio(String dActaEscrutinio) {
        this.dActaEscrutinio = dActaEscrutinio;
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
