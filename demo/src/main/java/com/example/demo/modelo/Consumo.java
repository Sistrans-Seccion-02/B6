package com.example.demo.modelo;

import java.util.Date;
import java.util.List;

public class Consumo {

    private Date fecha;
    private String pagado;
    private List<Servicio> servicio;

    public Consumo(Date fecha, String pagado, List<Servicio> servicio) {
		super();
        this.fecha = fecha;
		this.pagado = pagado;
		this.servicio = servicio;
	}

	public Consumo() {
        super();
    }

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPagado() {
		return pagado;
	}

	public void setPagado(String pagado) {
		this.pagado = pagado;
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	
}
