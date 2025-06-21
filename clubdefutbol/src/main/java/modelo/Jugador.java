/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCLino
 */
public class Jugador extends Persona {
    
    private int edad;
    private int valormercado;
    private boolean estadofisico;

      public Jugador(String dni, String nombrecompleto,Nomina nomina,int telefono,int edad, int valormercado, boolean estadofisico) {
        super(dni, nombrecompleto,nomina,telefono);
        this.edad = edad;
        this.valormercado = valormercado;
        this.estadofisico = estadofisico;
    }
      
       public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getValormercado() {
        return valormercado;
    }

    public void setValormercado(int valormercado) {
        this.valormercado = valormercado;
    }

    public boolean isEstadofisico() {
        return estadofisico;
    }

    public void setEstadofisico(boolean estadofisico) {
        this.estadofisico = estadofisico;
    }

    @Override
    public void mostratInformacion() {
        
    }


    
}
