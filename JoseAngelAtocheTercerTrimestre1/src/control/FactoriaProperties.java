/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author jose
 */
public class FactoriaProperties {

    public FactoriaProperties() {
    }

    public Action getAction(String nombre) {

        try {
            ResourceBundle rb = ResourceBundle.getBundle("control.Properties");
            String nombreClase = rb.getString(nombre);
            return (Action) Class.forName(nombreClase).newInstance();

        } catch (Exception e) {
            return null;
        }

    }

}
