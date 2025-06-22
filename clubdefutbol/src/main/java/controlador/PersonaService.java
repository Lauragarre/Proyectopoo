/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Directivo;
import modelo.Jugador;
import modelo.Persona;
import modelo.Tecnico;

/**
 *
 * @author PCLino
 */
/**
 * Servicio para gestionar las operaciones de alta, baja, modificación y consulta de personal.
 */
    public class PersonaService {

    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    /**
     * Registra una nueva persona si el DNI no existe.
     */
    public boolean registrarPersona(Persona persona) {
        if (personaRepository.existe(persona.getDni())) {
            return false; // Ya existe
        }
        personaRepository.agregarPersona(persona);
        return true;
    }
  
    

    /**
     * Obtiene una persona por su DNI.
     */
    public Persona obtenerPersona(String dni) {
        return personaRepository.obtenerPersonaPorDni(dni);
    }
    public boolean exitePersona(String dni)
    {
        if(personaRepository.existe(dni))
        {
            return false;
        }
        return true;
    }
    /**
     * Elimina (lógicamente) una persona por su DNI.
     */
    
    
    public void eliminarPersona(String dni) {
        personaRepository.eliminarPersona(dni);
    }

    /**
     * Modifica nombre y teléfono de una persona.
     */
    public boolean modificarPersona(String dni, String nuevoNombre, int nuevoTelefono) {
        return personaRepository.modificarPersona(dni, nuevoNombre, nuevoTelefono);
    }

    /**
     * Lista todas las personas activas.
     */
    public List<Persona> listarActivos() {
        return personaRepository.listarPersonasActivas();
    }

    /**
     * Lista todas las personas eliminadas.
     */
    public List<Persona> listarEliminados() {
        return personaRepository.listarPersonasEliminadas();
    }

    /**
     * Lista los jugadores activos.
     */
    public List<Jugador> listarJugadores() {
        return personaRepository.obtenerJugadores();
    }

    /**
     * Lista los técnicos activos.
     */
    public List<Tecnico> listarTecnicos() {
        return personaRepository.obtenerTecnicos();
    }

    /**
     * Lista los directivos activos.
     */
    public List<Directivo> listarDirectivos() {
        return personaRepository.obtenerDirectivos();
    }
}
