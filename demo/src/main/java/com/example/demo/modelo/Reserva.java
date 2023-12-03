package com.example.demo.modelo;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Document(collection = "reservas")
public class Reserva {
    //_id
    @Id
    private ObjectId id;

    private Date inicio;
    private Date fin;
    private Integer diasreserva;
    private Boolean checkin;
    private Boolean checkout;
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Consumo> consumos;



    public Reserva(Date inicio, Date fin, List<Habitacion> habitacion, List<Cliente> cliente, List<Consumo> consumos) {
        super();
        this.inicio = inicio;
        this.fin = fin;
        this.habitaciones = habitacion;
        this.clientes =cliente;
        this.consumos = consumos;
    }

    public Reserva() {
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

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumo> consumos) {
        this.consumos = consumos;
    }

   

}
