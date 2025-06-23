/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author PCLino
 */
public class Factura {
    private int id;
    private Cliente cliente;
    private double importe;
    private LocalDate fecha;
    
    public Factura(int id, Cliente cliente, double importe, LocalDate fecha) {
        this.id = id;
        this.cliente = cliente;
        this.importe = importe;
        this.fecha = fecha;
    }
    
    public void registrarCliente(Cliente cliente){
        
    }
    public void generarFactura(Factura factura){
        
    }
    public List<Factura> listarFacturas(){
        
        return null;
        
    }

}
