package com.example.demo.modelo;

import java.util.List;

public class HabitacionesEmbedded {

    private Integer numero;
    private List<String> dotacion;
    private List<tipoHabiEmbedded> tipohabi;


    public HabitacionesEmbedded() {
        super();
    }

    
    public HabitacionesEmbedded(Integer numero, List<String> dotacion, List<tipoHabiEmbedded> tipohabi) {
        super();
        this.numero = numero;
        this.dotacion = dotacion;
        this.tipohabi = tipohabi;
    }


    public Integer getnumero() {
        return numero;
    }
    public List<String> getDotacion() {
        return dotacion;
    }
    public List<tipoHabiEmbedded> getTipohabi() {
        return tipohabi;
    }
    
    public void setnumero(Integer numero) {
        this.numero = numero;
    }
    public void setDotacion(List<String> dotacion) {
        this.dotacion = dotacion;
    }
    public void setTipohabi(List<tipoHabiEmbedded> tipohabi) {
        this.tipohabi = tipohabi;
    }

    

}
