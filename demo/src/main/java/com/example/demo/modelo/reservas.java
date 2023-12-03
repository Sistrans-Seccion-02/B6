package com.example.demo.modelo;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Document(collection = "hotel")
public class reservas {
    //_id
    @Id
    private ObjectId id;

    private Date inicio;
    private Date fin;
    private Integer diasreserva;
    private Boolean checkin;
    private Boolean checkout;
    private List<habitaciones> habitaciones;
    private List<clientes> clientes;
    private List<consumos> consumos;



    public reservas(Date inicio, Date fin, List<habitaciones> habitacion, List<clientes> cliente, List<consumos> consumos) {
        super();
        this.inicio = inicio;
        this.fin = fin;
        this.habitaciones = habitacion;
        this.clientes =cliente;
        this.consumos = consumos;
    }

    public reservas() {
        super();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Integer getDiasreserva() {
        return diasreserva;
    }

    public void setDiasreserva(Integer diasreserva) {
        this.diasreserva = diasreserva;
    }

    public Boolean getCheckin() {
        return checkin;
    }

    public void setCheckin(Boolean checkin) {
        this.checkin = checkin;
    }

    public Boolean getCheckout() {
        return checkout;
    }

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }

    public List<habitaciones> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<habitaciones> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<clientes> clientes) {
        this.clientes = clientes;
    }

    public List<consumos> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<consumos> consumos) {
        this.consumos = consumos;
    }

   

}
