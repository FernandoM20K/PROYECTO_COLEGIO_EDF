package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Apoderado;

public class ApoderadoDAO {
    private static final String SQL_SELECT = "SELECT TA.ID_APODERADO, TA.NOMBRES, TA.APELLIDOS, TA.DNI, TA.GENERO, TA.EMAIL, TA.TELEFONO, TA.CELULAR, TA.DIRECCION, TE.ID_ESTUDIANTE, TE.NOMBRES, TE.APELLIDOS FROM TB_APODERADOS TA INNER JOIN TB_ESTUDIANTES TE ON TA.ID_APODERADO = TE.ID_ESTUDIANTE";

    private static final String SQL_SELECT_BY_ID = "SELECT TA.ID_APODERADO, TA.NOMBRES, TA.APELLIDOS, TA.DNI, TA.GENERO, TA.EMAIL, TA.TELEFONO, TA.CELULAR, TA.DIRECCION, TE.ID_ESTUDIANTE, TE.NOMBRES, TE.APELLIDOS FROM TB_APODERADOS TA INNER JOIN TB_ESTUDIANTES TE ON TA.ID_APODERADO = TE.ID_ESTUDIANTE WHERE ID_APODERADO = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_PROFESORES(NOMBRES, APELLIDOS, DNI, GENERO, EMAIL, TELEFONO, CELULAR, DIRECCION, ID_ESTUDIANTE) VALUES(?,?,?,?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_PROFESORES SET NOMBRES=?, APELLIDOS=?, DNI=?, GENERO=?, EMAIL=?, TELEFONO=?, CELULAR=?, DIRECCION=?, ID_ESTUDIANTE=? WHERE ID_APODERADO=?";

    private static final String SQL_DELETE = "DELETE FROM TB_APODERADOS WHERE ID_APODERADO=?";

    /* INICIO METODO LISTAR APODERAODS */
    public List<Apoderado> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Apoderado apoderado = null;
        List<Apoderado> apoderados = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int idApoderado = rs.getInt("TA.ID_PROFESOR");
                String nombres = rs.getString("TA.NOMBRE");
                String apellidos = rs.getString("TA.APELLIDOS");
                String dni = rs.getString("TA.DNI");
                String genero = rs.getString("TA.GENERO");
                String email = rs.getString("TA.EMAIL");
                String telefono = rs.getString("TA.TELEFONO");
                String celular = rs.getString("TA.CELULAR");
                String direccion = rs.getString("TA.DIRECCION");
                int idEstudiante = rs.getInt("TE.ID_ESTUDIANTE");
                String nombreEstudiante = rs.getString("TE.NOMBRE");
                String apellidoEstudiante = rs.getString("TE.APELLIDOS");

                apoderado = new Apoderado(idApoderado, nombres, apellidos, dni, genero, email, telefono, celular, direccion, idEstudiante, nombreEstudiante, apellidoEstudiante);
                apoderados.add(apoderado);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return apoderados;
    } /* FIN METODO LISTAR APODERAODS */

    /* INICIO METODO ENCONTRAR APODERADO */
    public Apoderado encontrar(Apoderado apoderado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, apoderado.getIdApoderado());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            String nombres = rs.getString("TA.NOMBRE");
            String apellidos = rs.getString("TA.APELLIDOS");
            String dni = rs.getString("TA.DNI");
            String genero = rs.getString("TA.GENERO");
            String email = rs.getString("TA.EMAIL");
            String telefono = rs.getString("TA.TELEFONO");
            String celular = rs.getString("TA.CELULAR");
            String direccion = rs.getString("TA.DIRECCION");
            int idEstudiante = rs.getInt("TE.ID_ESTUDIANTE");
            String nombreEstudiante = rs.getString("TE.NOMBRE");
            String apellidoEstudiante = rs.getString("TE.APELLIDOS");

            apoderado.setNombre(nombres);
            apoderado.setApellidos(apellidos);
            apoderado.setDni(dni);
            apoderado.setGenero(genero);
            apoderado.setEmail(email);
            apoderado.setTelefono(telefono);
            apoderado.setCelular(celular);
            apoderado.setDireccion(direccion);
            apoderado.setIdEstudiante(idEstudiante);
            apoderado.setNombreEstudiante(nombreEstudiante);
            apoderado.setApellidoEstudiante(apellidoEstudiante);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return apoderado;
    } /* FIN METODO ENCONTRAR APODERADO */

    /* INICIO METODO INSERTAR APODERADO */
    public int insertar(Apoderado apoderado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, apoderado.getNombre());
            stmt.setString(2, apoderado.getApellidos());
            stmt.setString(3, apoderado.getDni());
            stmt.setString(4, apoderado.getGenero());
            stmt.setString(5, apoderado.getEmail());
            stmt.setString(6, apoderado.getTelefono());
            stmt.setString(7, apoderado.getCelular());
            stmt.setString(8, apoderado.getDireccion());
            stmt.setInt(9, apoderado.getIdEstudiante());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR APODERADO */

    /* INICIO METODO ACTUALIZAR APODERADO */
    public int actualizar(Apoderado apoderado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, apoderado.getNombre());
            stmt.setString(2, apoderado.getApellidos());
            stmt.setString(3, apoderado.getDni());
            stmt.setString(4, apoderado.getGenero());
            stmt.setString(5, apoderado.getEmail());
            stmt.setString(6, apoderado.getTelefono());
            stmt.setString(7, apoderado.getCelular());
            stmt.setString(8, apoderado.getDireccion());
            stmt.setInt(9, apoderado.getIdEstudiante());
            stmt.setInt(10, apoderado.getIdApoderado());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR APODERADO */

    /* INICIO METODO ELIMINAR APODERADO */
    public int eliminar(Apoderado apoderado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, apoderado.getIdApoderado());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR APODERADO */
}

/*****************************************************************************************/
/* APODERADODAO COMPLETADO CON EXITO - PUEDEN SURGIR CAMBIOS MIENTRAS EL PROYECTO AVANCE */
/*****************************************************************************************/
