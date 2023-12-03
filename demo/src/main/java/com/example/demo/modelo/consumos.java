package com.example.demo.modelo;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class consumos {

	@Id
	private ObjectId id;

    private Date fecha;
    private Boolean pagado;
    private servicio servicio;

    public consumos(Date fecha, Boolean pagado, servicio servicio) {
		super();
        this.fecha = fecha;
		this.pagado = pagado;
		this.servicio = servicio;
	}

	public consumos() {
        super();
    }

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getPagado() {
		return pagado;
	}

	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}

	public servicio getServicio() {
		return servicio;
	}

	public void setServicio(servicio servicio) {
		this.servicio = servicio;
	}

	
}
