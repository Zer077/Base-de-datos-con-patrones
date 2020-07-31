/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Acciones;
import modelo.Alumnos;
import vista.Vista;

/**
 *
 * @author usuario
 */
public class VerTodosAlumnos implements Action {

    @Override
    public void Action(Acciones Acciones, Vista vista) {
        ArrayList<Alumnos> alumnos = Acciones.verAlumnos();
        for (int i = 0; i < alumnos.size(); i++) {
            vista.verAlumno(alumnos.get(i));
            System.out.println("---------------------------------");
        }

    }

}
