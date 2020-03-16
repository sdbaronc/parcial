package controller;


import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class controlador {

    /**
     * Creates a new instance of control
     */private String correo;
    private String clave;
    private Usuario UsA;
    private List<Usuario> listUsuarios; 

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public controlador() {
        listUsuarios=new ArrayList<>();
        listUsuarios.add(new Usuario("sergio123", "123", "sergio", "baron", "masculino", "sistemas", false, "a", "estudiante" ));
        listUsuarios.add(new Usuario("andrea234", "234", "andrea", "baron", "femenino", "psicologia", false, "i", "administrativo" ));
        listUsuarios.add(new Usuario("henry345", "345", "henry", "suarez", "masculino", "derecho", true, "a", "estudiante" ));
        listUsuarios.add(new Usuario("silvia456", "456", "silvia", "coy", "femenino", "industrial", false, "i", "administrativo" ));
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public Usuario getUsA() {
        return UsA;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setUsA(Usuario UsA) {
        this.UsA = UsA;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    
    public void login(){
        
    }
    
}
