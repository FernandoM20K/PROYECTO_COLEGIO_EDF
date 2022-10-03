package Controllers;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import Data.CursoDAO;
import Data.EstudianteDAO;
import Data.ProfesorDAO;
import Data.SedeDAO;
import Entidades.Curso;
import Entidades.Estudiante;
import Entidades.Profesor;
import Entidades.Sede;

@WebServlet("/ServletControladorEstudiante")
public class ServletControladorEstudiante extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "editar": 
                    this.editarEstudiante(request, response);
                    break;
                case "eliminar":
                    this.eliminarEstudiante(request, response);
                    break;
                case "agregarRegistro":
                    this.agregarRegistro(request, response);
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
                    this.insertarEstudiante(request, response);
                    break;
                case "modificar":
                    this.modificarEstudiante(request, response);
                    break;
                default: 
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        List<Estudiante> estudiantes = new EstudianteDAO().listar();
        System.out.println("estudiantes" + estudiantes);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalEstudiantes", estudiantes.size());
        sesion.setAttribute("estudiantes", estudiantes);
        response.sendRedirect("admin/estudiantes.jsp");
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }

    private void agregarRegistro(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        List<Sede> sedes = new SedeDAO().listar();
        System.out.println("sedes" + sedes);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("sedes", sedes);

        List<Curso> cursos = new CursoDAO().listar();
        System.out.println("cursos" + cursos);
        sesion.setAttribute("cursos", cursos);

        //response.sendRedirect("admin/agregarSalon.jsp");
        request.getRequestDispatcher("admin/AgregarProfesor.jsp").forward(request, response);
    }

    private void editarEstudiante(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAR EL ID PROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
        Profesor profesor = new ProfesorDAO().encontrar(new Profesor(idProfesor));
        request.setAttribute("profesor", profesor);
        String jspEditar = "admin/editarProfesor.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }


    private void insertarEstudiante(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
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
        int idSede = Integer.parseInt(request.getParameter("idSede"));
        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

        //CRREAMOS EL OBJETO PROFESOR (MODELO)
        Profesor profesor = new Profesor(nombre, apellido, dni, genero, email, telefono, celular, direccion, sueldo, idSede, idCurso);
        //INSERTAR EN LA BASE DE DATOS
        int registrosModificados = new ProfesorDAO().insertar(profesor);
        System.out.println("Registros Modificados"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
    }

    private void modificarEstudiante(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
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
        int idSede = Integer.parseInt(request.getParameter("idSede"));
        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

        //CREAMOS EL OBJETO PROFESOR (MODELO)
        Profesor profesor = new Profesor(idProfesor, nombre, apellido, dni, genero, email, telefono, celular, direccion, sueldo, idSede, idCurso);

        //MODIFICAR EL OBJETO EN LA BASE DE DATOS
        int registrosModificados = new ProfesorDAO().actualizar(profesor);
        System.out.println("Registros Modificados"+ registrosModificados);

        //REDIRIGIMOS HACIA LA ACCION POR DEFAULT
        this.accionDefault(request, response);
    }

    private void eliminarEstudiante(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
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
