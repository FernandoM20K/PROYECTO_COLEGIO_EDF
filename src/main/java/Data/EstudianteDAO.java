package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Estudiante;

public class EstudianteDAO {
    private static final String SQL_SELECT = "SELECT ID_ESTUDIANTE, NOMBRES, APELLIDOS, DNI, GENERO, DIRECCION, FECHA_INGRESO, FECHA_RETIRO ID_SALON FROM TB_ESTUDIANTES";

    private static final String SQL_SELECT_BY_ID = "SELECT ID_ESTUDIANTE, NOMBRES, APELLIDOS, DNI, GENERO, DIRECCION, FECHA_INGRESO, FECHA_RETIRO ID_SALON FROM TB_ESTUDIANTES WHERE ID_CURSO = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_ESTUDIANTES(NOMBRES, APELLIDOS, DNI, GENERO, EMAIL, TELEFONO, CELULAR, DIRECCION, ID_SALON) VALUES(?,?,?,?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_ESTUDIANTES SET NOMBRES=?, APELLIDOS=? DNI=?, GENERO=?, EMAIL=?, TELEFONO=?, CELULAR=?, DIRECCION=?, ID_SALON=? WHERE ID_ESTUDIANTE=?";

    private static final String SQL_DELETE = "DELETE FROM TB_ESTUDIANTES WHERE ID_ESTUDIANTE=?";

    /* INICIO METODO LISTAR ESTUDIANTES */
    public List<Estudiante> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Estudiante estudiante = null;
        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int idEstudiante = rs.getInt("ID_ESTUDIANTE");
                String nombres = rs.getString("NOMBRES");
                String apellidos = rs.getString("APELLIDOS");
                String dni = rs.getString("DNI");
                String genero = rs.getString("GENERO");
                String direccion = rs.getString("DIRECCION");
                String fechaIngreso = rs.getString("FECHA_INGRESO");
                String fechaRetiro = rs.getString("FECHA_RETIRO");
                int idSalon = rs.getInt("ID_SALON");

                estudiante = new Estudiante(idEstudiante, nombres, apellidos, dni, genero, direccion, fechaIngreso, fechaRetiro, idSalon);
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return estudiantes;
    } /* FIN METODO LISTAR ESTUDIANTES */

    /* INICIO METODO ENCONTRAR ESTUDIANTES */
    public Estudiante encontrar(Estudiante estudiante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, estudiante.getIdEstudiante());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            String nombres = rs.getString("NOMBRES");
            String apellidos = rs.getString("APELLIDOS");
            String dni = rs.getString("DNI");
            String genero = rs.getString("GENERO");
            String direccion = rs.getString("DIRECCION");
            String fechaIngreso = rs.getString("FECHA_INGRESO");
            String fechaRetiro = rs.getString("FECHA_RETIRO");
            int idSalon = rs.getInt("ID_SALON");

            estudiante.setNombres(nombres); 
            estudiante.setApellidos(apellidos);
            estudiante.setDni(dni);
            estudiante.setGenero(genero);
            estudiante.setDireccion(direccion);
            estudiante.setFechaIngreso(fechaIngreso);
            estudiante.setFechaRetiro(fechaRetiro);
            estudiante.setIdSalon(idSalon);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return estudiante;
    } /* FIN METODO ENCONTRAR ESTUDIANTES */

    /* INICIO METODO INSERTAR ESTUDIANTE */
    public int insertar(Estudiante estudiante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, estudiante.getNombres());
            stmt.setString(2, estudiante.getApellidos());
            stmt.setString(3, estudiante.getDni());
            stmt.setString(4, estudiante.getGenero());
            stmt.setString(5, estudiante.getDireccion());
            stmt.setString(6, estudiante.getFechaIngreso());
            stmt.setString(7, estudiante.getFechaRetiro());
            stmt.setInt(8, estudiante.getIdSalon());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR ESTUDIANTE */

    /* INICIO METODO ACTUALIZAR ESTUDIANTE */
    public int actualizar(Estudiante estudiante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, estudiante.getNombres());
            stmt.setString(2, estudiante.getApellidos());
            stmt.setString(3, estudiante.getDni());
            stmt.setString(4, estudiante.getGenero());
            stmt.setString(5, estudiante.getDireccion());
            stmt.setString(6, estudiante.getFechaIngreso());
            stmt.setString(7, estudiante.getFechaRetiro());
            stmt.setInt(8, estudiante.getIdSalon());
            stmt.setInt(9, estudiante.getIdEstudiante());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR ESTUDIANTE */

    /* INICIO METODO ELIMINAR ESTUDIANTE */
    public int eliminar(Estudiante estudiante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, estudiante.getIdEstudiante());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR ESTUDIANTE */
}
