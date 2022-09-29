package Controllers;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import Data.ProfesorDAO;
import Entidades.Profesor;

@WebServlet("/ServletControladorProfesor")
public class ServletControladorProfesor extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "editar": 
                    this.editarCliente(request, response);
                    break;
                case "eliminar":
                    //this.eliminarCliente(request, response);
                    break;
                default: 
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        List<Profesor> profesores = new ProfesorDAO().listar();
        System.out.println("profesores" + profesores);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalProfesores", profesores.size());
        sesion.setAttribute("profesores", profesores);
        response.sendRedirect("admin/profesores.jsp");
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }


    private void editarCliente(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAR EL ID PROFESOR
        int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
        Profesor profesor = new ProfesorDAO().encontrar(new Profesor(idProfesor));
        request.setAttribute("profesor", profesor);
        String jspEditar = "admin/editarProfesor.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "insertar": 
                    this.insertarCliente(request, response);
                    break;
                case "modificar":
                    //this.modificarCliente(request, response);
                    break;
                default: 
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAMOS LOS VALORES DEL FORMULARIO agregarCliente
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
}
