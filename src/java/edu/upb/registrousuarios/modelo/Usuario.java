/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.registrousuarios.modelo;

/**
 *
 * @author CharliePC
 */
public class Usuario {
    
    private String userName;
    private String userPassword;
    private String userProgram;
    private String userCorreoInst;
    private String usergen;
    private String userEstado;
    private String userBeca;
    private String UserType;

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserCorreoInst(String userCorreoInst) {
        this.userCorreoInst = userCorreoInst;
    }

    public void setUsergen(String usergen) {
        this.usergen = usergen;
    }

    public void setUserEstado(String userEstado) {
        this.userEstado = userEstado;
    }

    public void setUserBeca(String userBeca) {
        this.userBeca = userBeca;
    }

    public String getUserCorreoInst() {
        return userCorreoInst;
    }

    public String getUsergen() {
        return usergen;
    }

    public String getUserEstado() {
        return userEstado;
    }

    public String getUserBeca() {
        return userBeca;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserProgram() {
        return userProgram;
    }

    public void setUserProgram(String userProgram) {
        this.userProgram = userProgram;
    }
    
    
}
