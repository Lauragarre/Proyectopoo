/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCLino
 */
public class Directivo extends Persona {

    private String cargo;
    
    public Directivo(String dni, String nombrecompleto,Nomina nomina, int telefono,String cargo) {
        super(dni,nombrecompleto,nomina,telefono);
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostratInformacion() {
        
    }
}