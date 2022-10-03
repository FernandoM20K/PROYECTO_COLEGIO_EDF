package Controllers;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import Data.CursoDAO;
import Data.ProfesorDAO;
import Entidades.Curso;
import Entidades.Profesor;

@WebServlet("/ServletControladorCurso")
public class ServletControladorCurso extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "editar": 
                    this.editarProfesor(request, response);
                    break;
                case "eliminar":
                    this.eliminarProfesor(request, response);
                    break;
                default: 
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "insertar": 
                    this.insertarCurso(request, response);
                    break;
                case "modificar":
                    //this.modificarProfesor(request, response);
                    break;
                default: 
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        List<Curso> cursos = new CursoDAO().listar();
        System.out.println("cursos" + cursos);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalCursos", cursos.size());
        sesion.setAttribute("cursos", cursos);
        response.sendRedirect("admin/cursos.jsp");
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }

    private void insertarCurso(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAMOS LOS VALORES DEL FORMULARIO AGREGARCURSO
        String nombre = request.getParameter("nombre");
        int horasAcademicas = Integer.parseInt(request.getParameter("horasAcademicas"));

        //CRREAMOS EL OBJETO CURSO (MODELO)
        Curso curso = new Curso(nombre, horasAcademicas);
        //INSERTAR EN LA BASE DE DATOS
        int registrosModificados = new CursoDAO().insertar(curso);
        System.out.println("Registros Modificados"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
    }


    private void editarProfesor(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAR EL ID PROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
        Profesor profesor = new ProfesorDAO().encontrar(new Profesor(idProfesor));
        request.setAttribute("profesor", profesor);
        String jspEditar = "admin/editarProfesor.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    private void eliminarProfesor(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAMOS LOS VALORES DEL FORMULARIO AGREGARPROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));

        //CREAMOS EL OBJETO PROFESOR (MODELO)
        Profesor profesor = new Profesor(idProfesor);

        //ELIMINAR EL OBJETO EN LA BASE DE DATOS
        int registrosModificados = new ProfesorDAO().eliminar(profesor);
        System.out.println("Registro Eliminado"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
    }
}
