package co.edu.unicauca.asae.core.base_pdm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlanMejoramiento
 */
@Entity
@Table(name="planes_de_mejoramiento")
public class PlanMejoramiento {

    @Id
    private String idPlanMejoramiento;

    @Column(name="nombre_plan")
    private String nombre;
    @Column(name="fecha_inicio")
    private Date fechaInicio;
    @Column(name="fecha_fin")
    private Date fechaFin;
    @Column(name="path_soporte")
    private String pathSoporte;
    @Column(name="prorroga")
    private boolean prorroga;
    @Column(name="estado_plan")
    private String estado;

    @Column(name="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;


    public String getIdPlanMejoramiento() {
        return idPlanMejoramiento;
    }

    public void setIdPlanMejoramiento(String idPlanMejoramiento) {
        this.idPlanMejoramiento = idPlanMejoramiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPathSoporte() {
        return pathSoporte;
    }

    public void setPathSoporte(String pathSoporte) {
        this.pathSoporte = pathSoporte;
    }

    public boolean isProrroga() {
        return prorroga;
    }

    public void setProrroga(boolean prorroga) {
        this.prorroga = prorroga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}