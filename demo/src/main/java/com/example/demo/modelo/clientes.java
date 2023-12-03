package com.example.demo.modelo;


public class clientes {

    private int _id;
	private String tipoid;
    private String nombre;
    private String email;
    

    public clientes(String nombre, String tipoid, String email) {
        super();
        this.nombre = nombre;
        this.tipoid = tipoid;
        this.email = email;
    }

    public clientes() {
        super();
    }

	public int get_Id() {
		return _id;
	}

	public void set_Id(int _id) {
		this._id = _id;
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
