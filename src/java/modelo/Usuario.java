package modelo;


import control.TipoUsusario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    private String genero;
    private String facultad;
    private boolean becado;
    private String estado;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String correo, String clave, String nombre, String apellido, String genero, String facultad, boolean becado, String estado, String tipo) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.facultad = facultad;
        this.estado = estado;
        this.becado = becado;
        this.tipo = tipo;
    }
    

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getFacultad() {
        return facultad;
    }

    public boolean isEstado() {
        return becado;
    }

    public String getBecado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setEstado(boolean estado) {
        this.becado = becado;
    }

    public void setBecado(String becado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
