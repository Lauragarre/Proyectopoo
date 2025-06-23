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
public class Partido {
   private int codigo;
   private static int ultimoCodigo=0;
   private String nombrerival;
   private int telefono;
   //private date fechapartido;
   private int golesvisitante;
   private int goleslocal;
   private Jugador jugadores;
   
    public Partido(int codigo, String nombrerival, int telefono, int golesvisitante, int goleslocal, Jugador jugadores) {
        this.codigo = codigo;
        this.nombrerival = nombrerival;
        this.telefono = telefono;
        this.golesvisitante = golesvisitante;
        this.goleslocal = goleslocal;
        this.jugadores = jugadores;
    }
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public static void setUltimoCodigo(int ultimoCodigo) {
        Partido.ultimoCodigo = ultimoCodigo;
    }

    public String getNombrerival() {
        return nombrerival;
    }

    public void setNombrerival(String nombrerival) {
        this.nombrerival = nombrerival;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    public Jugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugadores) {
        this.jugadores = jugadores;
    }
    public void registrarPartido(Partido partido){
        
    }
    public List<Partido> listarPartidos(){
        
       return null;
        
    }

}