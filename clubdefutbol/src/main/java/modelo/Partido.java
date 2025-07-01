/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author PCLino
 */
public class Partido {
   
   private String nombrerival;
   private LocalDateTime fechapartido;
   private int golesvisitante;
   private int goleslocal;
   private ArrayList<Jugador> jugadores;
   
    public Partido(String nombrerival, LocalDateTime  fechapartido, int golesvisitante, int goleslocal, ArrayList<Jugador> jugadores) {
        this.nombrerival = nombrerival;
        this.fechapartido = fechapartido;
        this.golesvisitante = golesvisitante;
        this.goleslocal = goleslocal;
        this.jugadores = jugadores;
    }

    public LocalDateTime getFechapartido() {
        return fechapartido;
    }
    public void setFechapartido(LocalDateTime fechapartido) {
        this.fechapartido = fechapartido;
    }

    public String getNombrerival() {
        return nombrerival;
    }
    public void setNombrerival(String nombrerival) {
        this.nombrerival = nombrerival;
    }

    public int getGolesvisitante() {
        return golesvisitante;
    }
    public void setGolesvisitante(int golesvisitante) {
        this.golesvisitante = golesvisitante;
    }

    public int getGoleslocal() {
        return goleslocal;
    }
    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}