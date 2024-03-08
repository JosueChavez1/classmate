package org.utl.coyotech.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Coyotech
 */
public class Plan {
    
    private int idPlan;
    private String nombrePlan;
    private double precioPlan;
    private int capacidad;
    private String descripcion;
    private int estatus;

    public Plan() {
    }

    public Plan(String nombrePlan, double precioPlan, int capacidad, String descripcion, int estatus) {
        this.nombrePlan = nombrePlan;
        this.precioPlan = precioPlan;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public Plan(int idPlan, String nombrePlan, double precioPlan, int capacidad, String descripcion, int estatus) {
        this.idPlan = idPlan;
        this.nombrePlan = nombrePlan;
        this.precioPlan = precioPlan;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecioPlan() {
        return precioPlan;
    }

    public void setPrecioPlan(double precioPlan) {
        this.precioPlan = precioPlan;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plan{");
        sb.append("idPlan=").append(idPlan);
        sb.append(", nombrePlan=").append(nombrePlan);
        sb.append(", precioPlan=").append(precioPlan);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estatus=").append(estatus);
        sb.append('}');
        return sb.toString();
    }

   
    
}
