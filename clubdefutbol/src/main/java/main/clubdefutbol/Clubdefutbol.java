/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.clubdefutbol;

import controlador.PersonaRepository;
import controlador.PersonaService;
import vista.GestionPersonal;
import vista.Menu;

/**
 *
 * @author PCLino
 */
public class Clubdefutbol {

    public static void main(String[] args) {
        PersonaRepository repo = new PersonaRepository();
        PersonaService service = new PersonaService(repo);

        Menu gui = new Menu(service);
        gui.setVisible(true);
    }
}
