/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCLino
 */
public class Tecnico extends Persona {  

    private String puesto;
    private String especialidad;
    
    public Tecnico(String dni, String nombrecompleto,Nomina nomina, int telefono,String puesto, String especialidad) {
        super(dni,nombrecompleto,nomina,telefono);
        this.puesto = puesto;
        this.especialidad = especialidad;
    }
    
     public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostratInformacion() {
        
    }
}
    