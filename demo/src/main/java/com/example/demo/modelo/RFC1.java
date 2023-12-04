package com.example.demo.modelo;

import java.util.List;


public class RFC1 {
    private Integer totalDineroRecolectado;
    private List<Integer> numeroHabitacion;

    public RFC1() {
        super();
    }

    public RFC1(Integer totalDineroRecolectado, List<Integer> numeroHabitacion) {
        super();
        this.totalDineroRecolectado = totalDineroRecolectado;
        this.numeroHabitacion = numeroHabitacion;
    }

    public Integer getTotalDineroRecolectado() {
        return totalDineroRecolectado;
    }

    public void setTotalDineroRecolectado(Integer totalDineroRecolectado) {
        this.totalDineroRecolectado = totalDineroRecolectado;
    }

    public List<Integer> getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(List<Integer> numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
   
    @Override
    public String toString() {
        return "ResultadoConsulta{" +
                "totalDineroRecolectado=" + totalDineroRecolectado +
                ", numeroHabitacion=" + numeroHabitacion +
                '}';
    }
    
   

	
}
