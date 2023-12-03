package com.example.demo.modelo;

import java.util.List;


public class habitaciones {

	private int numero;
	private List<String> dotacion;
	private tipohabi tipohabi;

	public habitaciones(int numero, List<String> dotacion, tipohabi tipohabi) {
		super();
		this.numero = numero;
		this.dotacion = dotacion;
		this.tipohabi = tipohabi;
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

	public tipohabi gettipohabi() {
		return tipohabi;
	}

	public void settipohabi(tipohabi tipohabi) {
		this.tipohabi = tipohabi;
	}

}
