package com.example.demo.modelo;

public class ClientesEmbedded {
    private Integer _id;
    private String tipoid;
    private String nombre;
    private String email;

    public ClientesEmbedded() {
    }

    public ClientesEmbedded(Integer _id, String tipoid, String nombre, String email) {
        this._id = _id;
        this.tipoid = tipoid;
        this.nombre = nombre;
        this.email = email;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
