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
                    this.insertarProfesor(request, response);
                    break;
                case "modificar":
                    this.modificarProfesor(request, response);
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


    private void editarProfesor(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAR EL ID PROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
        Profesor profesor = new ProfesorDAO().encontrar(new Profesor(idProfesor));
        request.setAttribute("profesor", profesor);
        String jspEditar = "admin/editarProfesor.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }


    private void insertarProfesor(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAMOS LOS VALORES DEL FORMULARIO AGREGARPROFESOR
        String nombre = request.getParameter("nombresProfesor");
        String apellido = request.getParameter("apellidosProfesor");
        String dni = request.getParameter("dniProfesor");
        String direccion = request.getParameter("direccionProfesor");
        String email = request.getParameter("emailProfesor");
        String genero = request.getParameter("generoProfesor");
        String telefono = request.getParameter("telefonoProfesor");
        String celular = request.getParameter("celularProfesor");
        Double sueldo = Double.parseDouble(request.getParameter("sueldoProfesor"));

        //CRREAMOS EL OBJETO PROFESOR (MODELO)
        Profesor profesor = new Profesor(nombre, apellido, dni, genero, email, telefono, celular, direccion, sueldo);
        //INSERTAR EN LA BASE DE DATOS
        int registrosModificados = new ProfesorDAO().insertar(profesor);
        System.out.println("Registros Modificados"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
    }

    private void modificarProfesor(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAMOS LOS VALORES DEL FORMULARIO AGREGARPROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
        String nombre = request.getParameter("nombresProfesor");
        String apellido = request.getParameter("apellidosProfesor");
        String dni = request.getParameter("dniProfesor");
        String direccion = request.getParameter("direccionProfesor");
        String email = request.getParameter("emailProfesor");
        String genero = request.getParameter("generoProfesor");
        String telefono = request.getParameter("telefonoProfesor");
        String celular = request.getParameter("celularProfesor");
        Double sueldo = Double.parseDouble(request.getParameter("sueldoProfesor"));

        //CRREAMOS EL OBJETO PROFESOR (MODELO)
        Profesor profesor = new Profesor(idProfesor, nombre, apellido, dni, genero, email, telefono, celular, direccion, sueldo);

        //MODIFICAR EL OBJETO EN LA BASE DE DATOS
        int registrosModificados = new ProfesorDAO().actualizar(profesor);
        System.out.println("Registros Modificados"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
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
