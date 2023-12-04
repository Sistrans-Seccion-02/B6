package com.example.demo.modelo;

import java.util.List;


public class RFC1 {
    private List<Integer> _id;
    private Integer totalDineroRecolectado;
    

    public RFC1() {
        
    }

    public RFC1(Integer totalDineroRecolectado, List<Integer> _id) {
        
        this.totalDineroRecolectado = totalDineroRecolectado;
        this._id = _id;
    }

    public Integer getTotalDineroRecolectado() {
        return totalDineroRecolectado;
    }

    public void setTotalDineroRecolectado(Integer totalDineroRecolectado) {
        this.totalDineroRecolectado = totalDineroRecolectado;
    }

    public List<Integer> get_id() {
        return _id;
    }

    public void set_id(List<Integer> _id) {
        this._id = _id;
    }
   
    
    
   

	
}
