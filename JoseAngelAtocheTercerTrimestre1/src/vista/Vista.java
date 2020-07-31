/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Control;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Alumnos;
import modelo.Cursos;

/**
 *
 * @author jose
 */
public class Vista {

    private Control control;

    public Vista(Control control) {
        this.control = control;
    }

    //aquí se implementan las distintas vistas
    public void inicio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("escribe opcion");
        System.out.println("2 -  Ver Lista Alumnos por id Curso");
        System.out.println("3 - Añadir 5 alumnos automaticamente con ID DNI progresivo");
        System.out.println("4 - modifica Observaciones de un alumno");
        System.out.println("5 - borrar Alumno a elegir");
        System.out.println("9.Salir");
        try {
            Scanner sa = new Scanner(System.in);
            control.SeleccionEjercicio(sa.nextInt());
        } catch (Exception e) {
            System.out.println("Introduce un número por favor");
            inicio();
        }

    }

    public void verAlumnos(ArrayList<Alumnos> alumnos) {

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(i + 1 + ") ");
            System.out.print(alumnos.get(i).getNombre() + " ---- ");
            System.out.println(alumnos.get(i).getObservaciones());
            System.out.println(alumnos.get(i).getCurso());
        }
    }

    public Alumnos formularioALumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("id");
        int idAlumno = sc.nextInt();
        System.out.println("nombre");
        String nombre = sc.next();
        System.out.println("observaciones");
        String obs = sc.next();
        System.out.println("id Curso");
        int idCurso = sc.nextInt();
        Alumnos al = new Alumnos(idAlumno, nombre, obs, idCurso);
        return al;
    }

//    public int eliminarAlumnos(ArrayList<Alumnos> alumnos) {
//        Scanner sc = new Scanner(System.in);
//        int datos;
//        verAlumnos(alumnos);
//        System.out.println("elige un numero para borrar");
//        datos = sc.nextInt();
//        return datos;
//
//    }
    public void verAlumno(Alumnos alumno) {
        System.out.println("--------------------------------");
        System.out.println("id: " + alumno.getIdAlumno());
        System.out.println("nombre " + alumno.getNombre());
        System.out.println("observaciones: " + alumno.getObservaciones());
        System.out.println("idCurso: " + alumno.getCurso());

    }

    public int buscarPorID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id");
        int num = sc.nextInt();
        return num;

    }

    public String eliminarAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los numeros a borrar con espacios ");
        String numero = sc.next();

        return numero;

    }

    public void verCurso(Cursos c) {
        System.out.println("id: " + c.getId());
        System.out.println("nombre " + c.getNombre());
        for (int i = 0; i < c.getListaAlumnos().size(); i++) {
            System.out.println("--------------------------------");
            System.out.println("Alumno numero:" + i);
            verAlumno(c.getListaAlumnos().get(i));

        }
    }

//    public Cursos formularioCurso() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("id Curso");
//        int idSocio = sc.nextInt();
//
//        System.out.println("nombre");
//        String nombre = sc.next();
//        System.out.println("observaciones");
//        String obs = sc.next();
//
//        Cursos s = new Cursos(idSocio, nombre, obs);
//        return s;
//    }
    public Alumnos EdicionAlumnoObservaciones(Alumnos a) {
        Scanner sc = new Scanner(System.in);

        Alumnos alumno = a;
        System.out.println("observaciones");
        String obs = sc.next();
        alumno.setObservaciones(obs);

        return alumno;

    }

}
