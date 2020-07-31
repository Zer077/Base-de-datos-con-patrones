/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Acciones;
import modelo.Cursos;
import vista.Vista;

/**
 *
 * @author usuario
 */
public class VerAlumnosCurso implements Action {

    @Override
    public void Action(Acciones Acciones, Vista vista) {
        try {

            Cursos c = Acciones.buscaCurso(vista.buscarPorID());
            vista.verCurso(c);

            //cuidado
            vista.inicio();

        } catch (Exception e) {
        }

    }

}
