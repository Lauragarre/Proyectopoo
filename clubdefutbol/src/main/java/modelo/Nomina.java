/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author PCLino
 */
public class Nomina {
    private int mes;
    private int ano;
    private ArrayList<ConceptoNomina> conceptos;

    public Nomina(int mes, int ano, ArrayList<ConceptoNomina> conceptos) {
        this.mes = mes;
        this.ano = ano;
        this.conceptos = conceptos;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<ConceptoNomina> getConceptos() {
        return conceptos;
    }
    public void setConceptos(ArrayList<ConceptoNomina> concepto) {
        this.conceptos = concepto;
    }
}