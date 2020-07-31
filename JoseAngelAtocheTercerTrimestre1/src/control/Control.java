/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.*;
import vista.*;

/**
 *
 * @author jose
 */
public class Control {

    Acciones acciones;
    Vista vista;
    FactoriaProperties FactoriaProperties = new FactoriaProperties();

    public Control(String user, String pass) {
        vista = new Vista(this);
        acciones = new Acciones(this, "BD_alumnos", user, pass);

    }

    public void SeleccionEjercicio(int c) {

        switch (c) {

            case 2:
                FactoriaProperties.getAction("verAlumnosCurso").Action(acciones, vista);
                break;
            case 3:
                FactoriaProperties.getAction("NuevoAlumnoAutomatico").Action(acciones, vista);
                break;
            case 4:
                FactoriaProperties.getAction("buscar").Action(acciones, vista);
                FactoriaProperties.getAction("editar").Action(acciones, vista);
                break;
            case 5:
                FactoriaProperties.getAction("VerTodosAlumnos").Action(acciones, vista);
                FactoriaProperties.getAction("borrar").Action(acciones, vista);

                break;
            default:
                break;

        }

    }

    public void inicio() {
        vista.inicio();

    }

}
