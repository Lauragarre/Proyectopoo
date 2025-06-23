/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author PCLino
 */
public class Concepto {
    private String codigo;
    private String descripcion;
    private double importe;

    public Concepto(String codigo, String descripcion, double importe) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public void agregarConceptoNomina(String dniEmpleado, Concepto concepto){
        
    }
    public List<Concepto> obtenerConceptosNomina(String dniEmpleado){
        
        return null;
        
    }

}