/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Alumnos;
import modelo.Acciones;
import vista.Vista;

/**
 *
 * @author jose
 */
public class BuscaCurso implements Action {

    @Override
    public void Action(Acciones Acciones, Vista vista) {

        vista.verCurso(Acciones.buscaCurso(vista.buscarPorID()));
        vista.inicio();

    }

}
