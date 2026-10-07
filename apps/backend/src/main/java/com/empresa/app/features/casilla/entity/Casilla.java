package com.empresa.app.features.casilla.entity;
// jakarta.persistence.* es el estándar JPA vigente (Jakarta EE 10/11).
// Desde Spring Boot 3.x en adelante (incluida la línea 4.1.0 actual) se usa
// este paquete y NO javax.persistence, que quedó descontinuado.
import jakarta.persistence.*;

// jakarta.validation.constraints permite validar datos ANTES de que lleguen
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "CASILLA",
    uniqueConstraints = @UniqueConstraint(columnNames = "FolioActaEscrutinio")
)
@Getter 
@Setter
public class Casilla implements Serializable {

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="folioActaEscrutinio")
    private String folioActaEscrutinio;

    @Column(name="seccion")
    private Integer seccion;

    @Lob
    @Column (name="fotoActaCasilla", columnDefinition = "BLOB")
    private byte[] fotoActaCasilla;
    @Lob
    @Column(name="fotoConstanciaClausura", columnDefinition = "BLOB")
    private byte[] fotoConstanciaClausura;
    @Lob
    @Column(name="fotoCartelResultados", columnDefinition = "BLOB")
    private byte[] fotoCartelResultados;

    @Column(name="horaClausura")
    private LocalDateTime horaClausura;

    @Column(name="direccion")
    private String direccion;

    @Column(name="tipo")
    private String tipo;

    @Column(name="DFuncionarioPresidente")
    private String dFuncionarioPresidente;

    @Column(name="DFuncionarioSecretario")
    private String dFuncionarioSecretario;

    @Column(name="DCapturista")
    private String dCapturista;

    @Column(name="DConsejeroDistrital")
    private String dConsejeroDistrital;
    @Lob
    @Column(name= "fotoRemisionPaqueteElectoral", columnDefinition = "BLOB")
    private byte[] fotoRemisionPaqueteElectoral;

    @Column (name = "motivoCambioDomicilio")
    private String motivoCambioDomicilio;

    @Lob
    @Column (name = "fotoActaInstalacion", columnDefinition = "BLOB")
    private byte[] fotoActaInstalacion;

    @Column (name = "numeroBoletasSobrantes")
    private Integer numeroBoletasSobrantes;

    @Column (name = "votantesTotales")
    private Integer votantesTotales;

    @Column (name = "votosNulosAutomatizados")
    private Integer votosNulosAutomatizados;

    @Column (name = "votosNulosCapturados")
    private Integer votosNulosCapturados;
    
    @Column (name = "horaInicioInstalacion")
    private LocalDateTime horaInicioInstalacion;


    public Casilla(String folioActaEscrutinio, Integer seccion, byte[] fotoActaCasilla, byte[] fotoConstanciaClausura, byte[] fotoCartelResultados, LocalDateTime horaClausura, String direccion, String tipo, String dFuncionarioPresidente, String dFuncionarioSecretario, String dCapturista, String dConsejeroDistrital, byte[] fotoRemisionPaqueteElectoral, String motivoCambioDomicilio, byte[] fotoActaInstalacion, Integer numeroBoletasSobrantes, Integer votantesTotales, Integer votosNulosAutomatizados, Integer votosNulosCapturados, LocalDateTime horaInicioInstalacion) {
        this.folioActaEscrutinio = folioActaEscrutinio;
        this.seccion = seccion;
        this.fotoActaCasilla = fotoActaCasilla;
        this.fotoConstanciaClausura = fotoConstanciaClausura;
        this.fotoCartelResultados = fotoCartelResultados;
        this.horaClausura = horaClausura;
        this.direccion = direccion;
        this.tipo = tipo;
        this.dFuncionarioPresidente = dFuncionarioPresidente;
        this.dFuncionarioSecretario = dFuncionarioSecretario;
        this.dCapturista = dCapturista;
        this.dConsejeroDistrital = dConsejeroDistrital;
        this.fotoRemisionPaqueteElectoral = fotoRemisionPaqueteElectoral;
        this.motivoCambioDomicilio = motivoCambioDomicilio;
        this.fotoActaInstalacion = fotoActaInstalacion;
        this.numeroBoletasSobrantes = numeroBoletasSobrantes;
        this.votantesTotales = votantesTotales;
        this.votosNulosAutomatizados = votosNulosAutomatizados;
        this.votosNulosCapturados = votosNulosCapturados;
        this.horaInicioInstalacion = horaInicioInstalacion;
    }

    public String CasillaToString() {
        return "Casilla [folioActaEscrutinio=" + folioActaEscrutinio + ", seccion=" + seccion + ", fotoActaCasilla="
                + fotoActaCasilla + ", fotoConstanciaClausura=" + fotoConstanciaClausura + ", fotoCartelResultados="
                + fotoCartelResultados + ", horaClausura=" + horaClausura + ", direccion=" + direccion + ", tipo="
                + tipo + ", dFuncionarioPresidente=" + dFuncionarioPresidente + ", dFuncionarioSecretario="
                + dFuncionarioSecretario + ", dCapturista=" + dCapturista + ", dConsejeroDistrital="
                + dConsejeroDistrital + ", fotoRemisionPaqueteElectoral=" + fotoRemisionPaqueteElectoral
                + ", motivoCambioDomicilio=" + motivoCambioDomicilio + ", fotoActaInstalacion=" + fotoActaInstalacion
                + ", numeroBoletasSobrantes=" + numeroBoletasSobrantes + ", votantesTotales=" + votantesTotales
                + ", votosNulosAutomatizados=" + votosNulosAutomatizados + ", votosNulosCapturados="
                + votosNulosCapturados + ", horaInicioInstalacion=" + horaInicioInstalacion
                ;
    }
    
    
    public String getFolioActaEscrutinio() {
        return folioActaEscrutinio;
    }


    public String getMotivoCambioDomicilio() {
        return motivoCambioDomicilio;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    public byte[] getFotoActaCasilla() {
        return fotoActaCasilla;
    }

    public void setFotoActaCasilla(byte[] fotoActaCasilla) {
        this.fotoActaCasilla = fotoActaCasilla;
    }

    public byte[] getFotoConstanciaClausura() {
        return fotoConstanciaClausura;
    }

    public void setFotoConstanciaClausura(byte[] fotoConstanciaClausura) {
        this.fotoConstanciaClausura = fotoConstanciaClausura;
    }

    public byte[] getFotoCartelResultados() {
        return fotoCartelResultados;
    }

    public void setFotoCartelResultados(byte[] fotoCartelResultados) {
        this.fotoCartelResultados = fotoCartelResultados;
    }

    public LocalDateTime getHoraClausura() {
        return horaClausura;
    }

    public void setHoraClausura(LocalDateTime horaClausura) {
        this.horaClausura = horaClausura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getdFuncionarioPresidente() {
        return dFuncionarioPresidente;
    }

    public void setdFuncionarioPresidente(String dFuncionarioPresidente) {
        this.dFuncionarioPresidente = dFuncionarioPresidente;
    }

    public String getdFuncionarioSecretario() {
        return dFuncionarioSecretario;
    }

    public void setdFuncionarioSecretario(String dFuncionarioSecretario) {
        this.dFuncionarioSecretario = dFuncionarioSecretario;
    }

    public String getdCapturista() {
        return dCapturista;
    }

    public void setdCapturista(String dCapturista) {
        this.dCapturista = dCapturista;
    }

    public String getdConsejeroDistrital() {
        return dConsejeroDistrital;
    }

    public void setdConsejeroDistrital(String dConsejeroDistrital) {
        this.dConsejeroDistrital = dConsejeroDistrital;
    }

    public byte[] getFotoRemisionPaqueteElectoral() {
        return fotoRemisionPaqueteElectoral;
    }

    public void setFotoRemisionPaqueteElectoral(byte[] fotoRemisionPaqueteElectoral) {
        this.fotoRemisionPaqueteElectoral = fotoRemisionPaqueteElectoral;
    }


    public void setFolioActaEscrutinio(String folioActaEscrutinio) {
        this.folioActaEscrutinio = folioActaEscrutinio;
    }


    public void setMotivoCambioDomicilio(String motivoCambioDomicilio) {
        this.motivoCambioDomicilio = motivoCambioDomicilio;
    }


    public byte[] getFotoActaInstalacion() {
        return fotoActaInstalacion;
    }


    public void setFotoActaInstalacion(byte[] fotoActaInstalacion) {
        this.fotoActaInstalacion = fotoActaInstalacion;
    }


    public Integer getNumeroBoletasSobrantes() {
        return numeroBoletasSobrantes;
    }


    public void setNumeroBoletasSobrantes(Integer numeroBoletasSobrantes) {
        this.numeroBoletasSobrantes = numeroBoletasSobrantes;
    }


    public Integer getVotantesTotales() {
        return votantesTotales;
    }


    public void setVotantesTotales(Integer votantesTotales) {
        this.votantesTotales = votantesTotales;
    }


    public Integer getVotosNulosAutomatizados() {
        return votosNulosAutomatizados;
    }


    public void setVotosNulosAutomatizados(Integer votosNulosAutomatizados) {
        this.votosNulosAutomatizados = votosNulosAutomatizados;
    }


    public Integer getVotosNulosCapturados() {
        return votosNulosCapturados;
    }


    public void setVotosNulosCapturados(Integer votosNulosCapturados) {
        this.votosNulosCapturados = votosNulosCapturados;
    }


    public LocalDateTime getHoraInicioInstalacion() {
        return horaInicioInstalacion;
    }


    public void setHoraInicioInstalacion(LocalDateTime horaInicioInstalacion) {
        this.horaInicioInstalacion = horaInicioInstalacion;
    }

    

}