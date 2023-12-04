package com.example.demo.modelo;

public class mostrarServ {
    
    private String _id;
    private String descripcion;
    private int costo;
    private int totalConsumos;

    public mostrarServ() {
        super();
    }

    public mostrarServ(String _id, String descripcion, int costo, int totalConsumos) {
        super();
        this._id = _id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.totalConsumos = totalConsumos;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTotalConsumos() {
        return totalConsumos;
    }

    public void setTotalConsumos(int totalConsumos) {
        this.totalConsumos = totalConsumos;
    }

    
    


        
    }
    
