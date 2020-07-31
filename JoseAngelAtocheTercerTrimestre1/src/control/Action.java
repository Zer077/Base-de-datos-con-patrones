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
public interface Action {

    /**
     *
     * @param Acciones
     * @param modelo
     * @param vista
     */
    public void Action(Acciones Acciones, Vista vista);

}
