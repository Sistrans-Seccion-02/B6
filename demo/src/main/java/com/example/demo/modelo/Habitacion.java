package com.example.demo.modelo;

import java.util.List;

public class Habitacion {

	
    private int numero;
	private List<String> dotacion;
    private List<TipoHabitacion> tipo;
    

    public Habitacion(int numero, List<String> dotacion, List<TipoHabitacion> tipo) {
        super();
        this.numero = numero;
		this.dotacion = dotacion;
        this.tipo = tipo;
    }

    public Habitacion() {
        super();
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<String> getDotacion() {
		return dotacion;
	}

	public void setDotacion(List<String> dotacion) {
		this.dotacion = dotacion;
	}

	public List<TipoHabitacion> getTipo() {
		return tipo;
	}

	public void setTipo(List<TipoHabitacion> tipo) {
		this.tipo = tipo;
	}

	
	
}
