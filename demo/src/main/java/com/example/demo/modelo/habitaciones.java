package com.example.demo.modelo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class habitaciones {

	@Id
	private ObjectId id;
    private int numero;
	private List<String> dotacion;
    private tipohabi tipo;
    

    public habitaciones(int numero, List<String> dotacion, tipohabi tipo) {
        super();
        this.numero = numero;
		this.dotacion = dotacion;
        this.tipo = tipo;
    }

    public habitaciones() {
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

	public tipohabi getTipo() {
		return tipo;
	}

	public void setTipo(tipohabi tipo) {
		this.tipo = tipo;
	}

	
	
}
