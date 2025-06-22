/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCLino
 */
public class PersonaFactory {
    public static Persona crearPersona(String tipo, String nombrecompleto, String dni,Nomina nomina, int telefono,int edad, int valormercado, boolean estadofisico, String cargo, String puesto, String especialidad) {
        switch (tipo.toLowerCase()) {
            case "jugador":
                return new Jugador(dni,nombrecompleto,nomina,telefono,edad,valormercado,estadofisico);
            case "directivo":
                return new Directivo(dni,nombrecompleto,nomina,telefono,cargo);
            case "tecnico":
                return new Tecnico(dni,nombrecompleto,nomina,telefono,puesto,especialidad);
            default:
                throw new IllegalArgumentException("Error con el tipo de persona insertado");
        }
    }
}
