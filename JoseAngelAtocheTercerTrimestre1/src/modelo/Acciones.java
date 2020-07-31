/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.Control;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Acciones {
    // Esto se supone que es la base de datos de la libreria
    // consta de dos tablas, libros y usuario de libros

    private ConexionBD conexion;
    private Control controlador;

    public Acciones(Control control, String tabla, String user, String pass) {
        conexion = new ConexionBD("mysql", tabla, user, pass);
        controlador = control;
        
    }

    public boolean eliminarAlumno(int n) {

        boolean resultado = false;
        String sql = "delete from  alumnos where idAlumno= " + n;

        try {
            conexion.abrirConexion();
            resultado = conexion.ejecutarUpdate(sql);

        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

        return resultado;
    }

    public Alumnos buscaAlumno(Integer id) {
        String sql = "select * from alumnos where idAlumno='" + id + "'";

        Alumnos libro = null;
        try {
            conexion.abrirConexion();
            ResultSet resultado = conexion.ejecutarSQL(sql);

            if (conexion.numRegistros() != 0) {
                resultado.next();
                libro = new Alumnos();
                libro.setIdAlumno(resultado.getInt(1));
                libro.setNombre(resultado.getString(2));
                libro.setObservaciones(resultado.getString(3));
                libro.setCurso(resultado.getInt(4));

            }

        } catch (Exception e) {
            System.out.println("error");

        }

        return libro;

    }

    public boolean insertarAlumno(Alumnos alumno) {

        //posible error
        boolean resultado = false;
        String sql = "insert into alumnos (idAlumno,nombre, observaciones, idCurso) values (" + alumno.getIdAlumno() + ",'" + alumno.getNombre() + "','" + alumno.getObservaciones() + "','" + alumno.getCurso() + "'";
        sql += ")";
        try {
            conexion.abrirConexion();
            resultado = conexion.ejecutarUpdate(sql);

        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

        return resultado;
    }

    public boolean actualizarAlumno(Alumnos alumno) {

        //posible error
        boolean resultado = false;
        String sql = "update alumnos set observaciones='"+alumno.getObservaciones()+"'";        
        sql+=" where idAlumno="+alumno.getIdAlumno()+"";
        
        try {
        
            conexion.abrirConexion();
            resultado = conexion.ejecutarUpdate(sql);

        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

        return resultado;
    }

//    public boolean eliminarCurso(int n) {
//
//        boolean resultado = false;
//        String sql = "delete from cursos where idCurso= " + n;
//
//        try {
//            conexion.abrirConexion();
//            resultado = conexion.ejecutarUpdate(sql);
//
//        } catch (Exception e) {
//            System.out.println("error");
//            return false;
//        }
//
//        return resultado;
//    }

    public Cursos buscaCurso(Integer id) {
        String sql = "select * from cursos where idCurso='" + id + "'";
        Cursos curso = null;
        try {
            conexion.abrirConexion();
            ResultSet resultado = conexion.ejecutarSQL(sql);

            if (conexion.numRegistros() != 0) {
                resultado.next();
                curso = new Cursos();
                curso.setId(resultado.getInt(1));
                curso.setNombre(resultado.getString(2));
                curso.setListaAlumnos(buscaAlumnos(id));

            }

        } catch (Exception e) {
            System.out.println("error");

        }

        return curso;

    }

//    public boolean insertarCurso(Cursos curso) {
//
//        boolean resultado = false;
//        String sql = "insert into cursos (idCurso,nombre, observaciones) values ('" + curso.getId() + "','" + curso.getNombre() + "','" + curso.getObservaciones() + "'";
//        sql += ")";
//        try {
//            conexion.abrirConexion();
//            resultado = conexion.ejecutarUpdate(sql);
//        } catch (Exception e) {
//            System.out.println("error");
//            return false;
//        }
//
//        return resultado;
//    }

//    public boolean actualizarCurso(Cursos curso) {
//
//    
//        boolean resultado = false;
//        String sql = "update cursos set nombre='" + curso.getNombre() + "'";
//        sql += "' where idCurso=" + curso.getId();
//        try {
//            conexion.abrirConexion();
//            resultado = conexion.ejecutarUpdate(sql);
//
//        } catch (Exception e) {
//            System.out.println("error");
//            return false;
//        }
//
//        return resultado;
//    }

    public ArrayList<Alumnos> buscaAlumnos(Integer id) {
        String sql = "select * from alumnos where idCurso='" + id + "'";
        ArrayList<Alumnos> alum = new ArrayList();
        Alumnos alumno = null;
        try {
            conexion.abrirConexion();
            ResultSet resultado = conexion.ejecutarSQL(sql);

            while (resultado.next()) {
                alumno = new Alumnos();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setNombre(resultado.getString(2));
                alumno.setObservaciones(resultado.getString(3));
                alumno.setCurso(resultado.getInt(4));
                alum.add(alumno);

            }

        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e);

        }

        return alum;

    }

    public ArrayList<Alumnos> verAlumnos() {
        String sql = "select * from alumnos";
        ArrayList<Alumnos> alum = new ArrayList();
        Alumnos alumno = null;
        try {
            conexion.abrirConexion();
            ResultSet resultado = conexion.ejecutarSQL(sql);

            while (resultado.next()) {
                alumno = new Alumnos();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setNombre(resultado.getString(2));
                alumno.setObservaciones(resultado.getString(3));
                alumno.setCurso(resultado.getInt(4));
                alum.add(alumno);

            }

        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e);

        }

        return alum;

    }

    public void EliminarAlumnoArray(Cursos socio, int numeroAlumno) {

        socio.getListaAlumnos().get(numeroAlumno).setCurso(0);

        String sql = "update Alumnos set idCuro='" + 0 + "'where idAlumno='" + socio.getListaAlumnos().get(numeroAlumno).getIdAlumno() + "'";

        try {
            conexion.abrirConexion();
            conexion.ejecutarUpdate(sql);
            socio.getListaAlumnos().remove(numeroAlumno);
        } catch (Exception e) {
            System.out.println("error");

        }

    }

}
