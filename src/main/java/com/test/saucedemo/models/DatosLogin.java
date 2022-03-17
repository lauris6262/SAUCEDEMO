package com.test.saucedemo.models;

public class DatosLogin {


    private String usuario;
    private String clave;

    public DatosLogin() {

    }



    public DatosLogin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

}
