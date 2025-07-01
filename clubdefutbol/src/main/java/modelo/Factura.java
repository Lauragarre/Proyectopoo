/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author PCLino
 */
public class Factura {
    private String codigo; // ej FJ0001
    private double cantidad; // ej 50.000,00€
    private LocalDate fecha;
    private ClienteFactura cliente;
    
    public Factura(String codigo, double cantidad, LocalDate fecha, ClienteFactura cliente) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public ClienteFactura getCliente() {
        return cliente;
    }
    public void setCliente(ClienteFactura cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
