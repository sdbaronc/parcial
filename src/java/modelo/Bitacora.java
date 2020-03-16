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
public class Bitacora {
    private String accion;
    private String Usuario;
    private Date fecha;

    public Bitacora(String accion, String Usuario, Date fecha) {
        this.accion = accion;
        this.Usuario = Usuario;
        this.fecha = new Date();
    }

    public String getAccion() {
        return accion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
