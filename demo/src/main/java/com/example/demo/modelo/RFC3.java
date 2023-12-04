package com.example.demo.modelo;

import java.util.Date;
import java.util.List;

public class RFC3 {
    private List<String> cliente;
    private Date fechaConsumo;
    private String servicio;
    private String descripcionServicio;
    private int costoServicio;
    private boolean pagado;
    
    public RFC3() {
        super();
    }

    public RFC3(List<String> cliente, Date fechaConsumo, String servicio, String descripcionServicio, int costoServicio,
            boolean pagado) {
        super();
        this.cliente = cliente;
        this.fechaConsumo = fechaConsumo;
        this.servicio = servicio;
        this.descripcionServicio = descripcionServicio;
        this.costoServicio = costoServicio;
        this.pagado = pagado;
    }

    public List<String> getCliente() {
        return cliente;
    }

    public void setCliente(List<String> cliente) {
        this.cliente = cliente;
    }

    public Date getFechaConsumo() {
        return fechaConsumo;
    }

    public void setFechaConsumo(Date fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    
    

}
