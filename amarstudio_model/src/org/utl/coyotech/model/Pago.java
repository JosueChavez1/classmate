
package org.utl.coyotech.model;

/**
 *
 * @author Coyotech
 */
public class Pago {
    
    private int idPago;
    private String fechaPago;
    private double monto;
    private int estatus;
    private Alumno alumno;

    public Pago() {
    }

    public Pago(String fechaPago, double monto, int estatus, Alumno alumno) {
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.estatus = estatus;
        this.alumno = alumno;
    }

    public Pago(int idPago, String fechaPago, double monto, int estatus, Alumno alumno) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.estatus = estatus;
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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
        sb.append("Pago{");
        sb.append("idPago=").append(idPago);
        sb.append(", fechaPago=").append(fechaPago);
        sb.append(", monto=").append(monto);
        sb.append(", estatus=").append(estatus);
        sb.append(", alumno=").append(alumno);
        sb.append('}');
        return sb.toString();
    }

}
