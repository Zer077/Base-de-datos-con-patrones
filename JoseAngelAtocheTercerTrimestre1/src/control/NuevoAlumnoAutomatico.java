/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Acciones;
import modelo.Alumnos;
import vista.Vista;

/**
 *
 * @author usuario
 */
public class NuevoAlumnoAutomatico implements Action {

    @Override
    public void Action(Acciones Acciones, Vista vista) {
        int id = 47425714;
        for (int i = 0; i < 5; i++) {

            Alumnos a = new Alumnos(id, "ejemplo", "ejemplo", 1);

            Acciones.insertarAlumno(a);
            id++;
        }
        vista.inicio();

    }

}
