/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Cursos implements Serializable {

    private Integer id;
    private String nombre;
    private String observaciones;
    private ArrayList<Alumnos> ListaAlumnos = new ArrayList();

    /**
     * @return the nombre
     */
    public Cursos() {
    }

    public Cursos(Integer id, String nombre, String obser) {
        this.nombre = nombre;
        this.id = id;
        this.observaciones = obser;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the l
     */
    public ArrayList<Alumnos> getListaAlumnos() {
        return ListaAlumnos;
    }

    /**
     * @param ListaAlumnos the l to set
     */
    public void setListaAlumnos(ArrayList<Alumnos> ListaAlumnos) {
        this.ListaAlumnos = ListaAlumnos;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
