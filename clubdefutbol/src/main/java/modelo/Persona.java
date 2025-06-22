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
/**Persona es una clase estracta que hará de enlace entre todas las clases que herenden de ella como: Jugador,Directivo y Técnico**/
public abstract class Persona {
    private String dni;
    private String nombrecompleto;
    private Nomina nomina;
    private int telefono;
    private boolean eliminado;
    private LocalDate fechaEliminacion;

    public Persona(String dni, String nombrecompleto, Nomina nomina, int telefono) {
        this.dni = dni;
        this.nombrecompleto = nombrecompleto;
        this.nomina = nomina;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void marcarEliminado() {
    this.eliminado = true;
    this.fechaEliminacion = LocalDate.now();
    }

    public boolean isEliminado() {
    return eliminado;
    }

    
    
    public abstract void mostratInformacion();
    
}