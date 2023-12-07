/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkgfinal;

/**
 *
 * @author Kalaney
 */
public class Facturas {
    private String cuenta;
    private String descripcion;
    private String participante;
    private String quienPago;
    private int montoTotal;
    private String moneda;

    public Facturas(String cuenta, String descripcion, String participante, String quienPago, int montoTotal, String moneda) {
        this.cuenta = cuenta;
        this.descripcion = descripcion;
        this.participante = participante;
        this.quienPago = quienPago;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(String quienPago) {
        this.quienPago = quienPago;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
}
  