/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCLino
 */
public class Nomina extends Persona {
    private String mes;
    private String ano;
    private Concepto concepto;

    public Nomina(String mes, String ano, Concepto concepto, String dni, String nombrecompleto,Nomina nomina, int telefono) {
        super(dni, nombrecompleto,nomina,telefono);
        this.mes = mes;
        this.ano = ano;
        this.concepto = concepto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }
    
    

    @Override
    public void mostratInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}