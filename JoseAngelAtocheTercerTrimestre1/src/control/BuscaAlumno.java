/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Acciones;
import vista.Vista;

/**
 *
 * @author jose
 */
public class BuscaAlumno implements Action {

    @Override
    public void Action(Acciones Acciones, Vista vista) {

        vista.verAlumno(Acciones.buscaAlumno(vista.buscarPorID()));
        // vista.inicio();

    }

}
