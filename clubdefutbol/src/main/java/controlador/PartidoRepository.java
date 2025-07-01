/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;
import modelo.Partido;

/**
 *
 * @author victorrcarrionn
 */
public class PartidoRepository {
    
    private ArrayList<Partido> partidos;
    
    boolean registrarPartido(String nombrerival, LocalDateTime fechapartido, int golesvisitante, int goleslocal, ArrayList<Jugador> jugadores) {
        Partido nuevo = new Partido(nombrerival, fechapartido, golesvisitante, goleslocal, jugadores);
        if(this.partidos.contains(nuevo)) return false;
        
        this.partidos.add(nuevo);
        return true;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
    
}
