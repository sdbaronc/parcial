package modelo;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Solicitud {
    private String descripcion;
    private String prioridad ;
    private String usuario;
    private Date fecha;

    public Solicitud(String descripcion, String prioridad, String usuario, Date fecha) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.fecha = new Date();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
