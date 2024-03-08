/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.coyotech.model;

/**
 *
 * @author Coyotech
 */
public class Clase {
    
    private int idClase;
    private String nombreClase;
    private String día;
    private String horaInicio;
    private String horaFin;
    private int estatus;
    private Plan plan;
    
        public Clase() {
    }

    public Clase(String nombreClase, String día, String horaInicio, String horaFin, int estatus, Plan plan) {
        this.nombreClase = nombreClase;
        this.día = día;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estatus = estatus;
        this.plan = plan;
    }

    public Clase(int idClase, String nombreClase, String día, String horaInicio, String horaFin, int estatus, Plan plan) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.día = día;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estatus = estatus;
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getDía() {
        return día;
    }

    public void setDía(String día) {
        this.día = día;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clase{");
        sb.append("idClase=").append(idClase);
        sb.append(", nombreClase=").append(nombreClase);
        sb.append(", d\u00eda=").append(día);
        sb.append(", horaInicio=").append(horaInicio);
        sb.append(", horaFin=").append(horaFin);
        sb.append(", estatus=").append(estatus);
        sb.append(", plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
