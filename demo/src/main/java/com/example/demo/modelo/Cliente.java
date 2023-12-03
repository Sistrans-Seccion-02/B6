package com.example.demo.modelo;


public class Cliente {

    private int id;
	private String tipoid;
    private String nombre;
    private String email;
    

    public Cliente(String nombre, String tipoid, String email) {
        super();
        this.nombre = nombre;
        this.tipoid = tipoid;
        this.email = email;
    }

    public Cliente() {
        super();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoid() {
		return tipoid;
	}

	public void setTipoid(String tipoid) {
		this.tipoid = tipoid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
