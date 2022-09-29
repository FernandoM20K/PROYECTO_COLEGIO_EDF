package Controllers;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import Data.SedeDAO;
import Entidades.Sede;

@WebServlet("/ServletControladorSede")
public class ServletControladorSede extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "editar": 
                    //this.editarCliente(request, response);
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
        List<Sede> sedes = new SedeDAO().listar();
        System.out.println("sedes" + sedes);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("sedes", sedes);
        response.sendRedirect("admin/sedes.jsp");
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }


    /*private void editarCliente(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //RECUPERAR EL ID CLIENTE
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        Sede cliente = new SedeDAO().encontrar(new Sede(idCliente));
        request.setAttribute("cliente", cliente);
        String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }*/

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String accion = request.getParameter("accion");
        if(accion != null) {
            switch(accion) {
                case "insertar": 
                    //this.insertarCliente(request, response);
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
}
