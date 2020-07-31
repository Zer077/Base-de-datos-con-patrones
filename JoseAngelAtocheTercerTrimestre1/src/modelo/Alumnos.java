/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author enrique
 */
public class Alumnos {

    private Integer idAlumno;
    private String nombre;
    private String observaciones;
    private int curso;

    /**
     * @return the titulo
     */
    public Alumnos() {
    }

    public Alumnos(int i, String nombre, String observaciones, int id) {
        this.idAlumno = i;
        this.curso = id;
        this.nombre = nombre;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the titulo to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the autor
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the autor to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the idLibro
     */
    public Integer getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idLibro to set
     */
    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    /**
     * @return the socio
     */
    public int getCurso() {
        return curso;
    }

    /**
     * @param curso the socio to set
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }

}
