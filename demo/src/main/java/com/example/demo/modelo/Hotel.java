package com.example.demo.modelo;


import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "hotel")
public class Hotel{
   @Id
    private ObjectId _id;

    
    private Date inicio;
    private Date fin;
    private Integer diasreserva;
    private Boolean checkin;
    private Boolean checkout;

    // Lista de habitaciones embebidas en el documento principal
    private List<HabitacionesEmbedded> habitaciones;
    private List<ClientesEmbedded> clientes;
    private List<ConsumosEmbedded> consumos;


    public Hotel(){
        //Constructor vacio para el uso de Spring
        super();
    }




    public Hotel(Date inicio, Date fin, Integer diasreserva, Boolean checkin, Boolean checkout,
            List<HabitacionesEmbedded> habitaciones, List<ClientesEmbedded> clientes, List<ConsumosEmbedded> consumos) {
        super();
        this.inicio = inicio;
        this.fin = fin;
        this.diasreserva = diasreserva;
        this.checkin = checkin;
        this.checkout = checkout;
        habitaciones = habitaciones;
        clientes = clientes;
        consumos = consumos;
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


    /*

    public List<HabitacionesEmbedded> getHabitaciones() {
        return habitaciones;
    }




    public void setHabitaciones(List<HabitacionesEmbedded> habitaciones) {
        this.habitaciones = habitaciones;
    }




    public List<ClientesEmbedded> getClientes() {
        return clientes;
    }




    public void setClientes(List<ClientesEmbedded> clientes) {
        this.clientes = clientes;
    }




    public List<ConsumosEmbedded> getConsumos() {
        return consumos;
    }




    public void setConsumos(List<ConsumosEmbedded> consumos) {
        this.consumos = consumos;
    }

    public void addCliente(ClientesEmbedded cliente){
        this.clientes.add(cliente);
    }

    public void addHabitacion(HabitacionesEmbedded habi){
        this.habitaciones.add(habi);
    }

    public void addConsumo(ConsumosEmbedded consum){
        this.consumos.add(consum);
    }

    */
    


    
}
