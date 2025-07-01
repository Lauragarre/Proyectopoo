/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Persona;
import modelo.Jugador;
import modelo.Tecnico;
import modelo.Directivo;

import java.util.*;
import java.util.stream.Collectors;
import modelo.PersonaFactory;

/**
 * Repositorio de personas del club. Funciona como una base de datos en memoria.
 */
public class PersonaRepository {
    private Map<String, Persona> personasRegistradas;
    private PersonaFactory personaFactory;

    public PersonaRepository() {
        this.personasRegistradas = new HashMap<>();
    }

    /**
     * Comprueba si una persona existe en el sistema.
     */
    boolean existe(String dni) {
        return personasRegistradas.containsKey(dni);
    }

    /**
     * Agrega una persona al repositorio.
     */
    public void agregarPersona(Persona persona) {
        personasRegistradas.put(persona.getDni(), persona); 
    }

    /**
     * Obtiene una persona concreta por su DNI.
     */
    public Persona obtenerPersonaPorDni(String dni) {
        return personasRegistradas.get(dni);
    }

    /**
     * Lista todas las personas activas (no eliminadas).
     */
    public List<Persona> listarPersonasActivas() {
        return personasRegistradas.values().stream()
                .filter(p -> !p.isEliminado())
                .collect(Collectors.toList());
    }

    /**
     * Lista todas las personas eliminadas.
     */
    public List<Persona> listarPersonasEliminadas() {
        return personasRegistradas.values().stream()
                .filter(Persona::isEliminado)
                .collect(Collectors.toList());
    }

    /**
     * Marca como eliminada una persona (baja lógica).
     */
    public void eliminarPersona(String dni) {
        Persona p = personasRegistradas.get(dni);
        if (p != null && !p.isEliminado()) {
            p.marcarEliminado(); // Este método debe estar en la clase Persona
        }
    }
    
    /**
     * Devuelve todos los jugadores activos.
     * @return 
     */
    public List<Jugador> obtenerJugadores() {
        return listarPersonasActivas().stream()
                .filter(p -> p instanceof Jugador)
                .map(p -> (Jugador) p)
                .collect(Collectors.toList());
    }

    /**
     * Devuelve todos los técnicos activos.
     * @return 
     */
    public List<Tecnico> obtenerTecnicos() {
        return listarPersonasActivas().stream()
                .filter(p -> p instanceof Tecnico)
                .map(p -> (Tecnico) p)
                .collect(Collectors.toList());
    }

    /**
     * Devuelve todos los directivos activos.
     * @return 
     */
    public List<Directivo> obtenerDirectivos() {
        return listarPersonasActivas().stream()
                .filter(p -> p instanceof Directivo)
                .map(p -> (Directivo) p)
                .collect(Collectors.toList());
    }

    /**
     * Devuelve el mapa completo de personas (si necesitas exportarlo).
     * @return 
     */
    public Map<String, Persona> getPersonasRegistradas() {
        return personasRegistradas;
    }
    
    public void actualizarPersona(Persona persona) {
    personasRegistradas.put(persona.getDni(), persona);
    }

}
