/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;

/**
 *
 * @author PCLino
 */
public class PersonaFactory {
   public static Persona crearPersona(String tipo, Map<String, String> datos) {
    String nombrecompleto = datos.get("nombrecompleto");
    String dni = datos.get("dni");
    Nomina nomina = null; 
    int telefono = Integer.parseInt(datos.get("telefono"));
    int edad = Integer.parseInt(datos.get("edad"));

    switch (tipo.toLowerCase()) {
        case "jugador":
            int valorMercado = Integer.parseInt(datos.get("valormercado"));
            boolean estadoFisico = Boolean.parseBoolean(datos.get("estadofisico"));
            return new Jugador(dni, nombrecompleto, nomina, telefono, edad, valorMercado, estadoFisico);

        case "directivo":
            String cargo = datos.get("cargo");
           return new Directivo(dni, nombrecompleto, nomina, telefono, cargo);

        case "tecnico":
            String puesto = datos.get("puesto");
            String especialidad = datos.get("especialidad");
            return new Tecnico(dni, nombrecompleto,nomina, telefono,puesto, especialidad);

        default:
            throw new IllegalArgumentException("Tipo de persona no reconocido: " + tipo);
    }
}

}
