package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Profesor;

public class MensajeDAO {
    private static final String SQL_SELECT = "SELECT TM.ID_MENSAJE, TM.ID_PROFESOR, TP.NOMBRES, TP.APELLIDOS, TM.ID_APODERADO, TA.NOMBRES, TA.APELLIDOS, TM.MENSAJE, TN.ARCHIVO FROM TB_MENSAJES TM INNER JOIN TB_PROFESORES TP ON TM.ID_PROFESOR=TP.ID_PROFESOR INNER JOIN TB_APODERADO TA ON TA.ID_APODERADO = TM.ID_APODERADO ";

    private static final String SQL_SELECT_BY_ID = "SELECT TM.ID_MENSAJE, TM.ID_PROFESOR, TP.NOMBRES, TP.APELLIDOS, TM.ID_APODERADO, TA.NOMBRES, TA.APELLIDOS, TM.MENSAJE, TN.ARCHIVO FROM TB_MENSAJES TM INNER JOIN TB_PROFESORES TP ON TM.ID_PROFESOR=TP.ID_PROFESOR INNER JOIN TB_APODERADO TA ON TA.ID_APODERADO = TM.ID_APODERADO WHERE TM.ID_MENSAJE = ?;";

    private static final String SQL_INSERT = "INSERT INTO TB_MENSAJES(ID_PROFESOR, ID_PROFESOR, ID_APODERADO, MENSAJE, ARCHIVO) VALUES(?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_MENSAJES SET MENSAJE=?, ARCHIVO=? WHERE ID_APODERADO=?";

    private static final String SQL_DELETE = "DELETE FROM TB_MENSAJES WHERE ID_PROFESOR=?";

    /* INICIO METODO LISTAR PROFESORES */
    public List<Profesor> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Profesor profesor = null;
        List<Profesor> profesores = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id_profesor = rs.getInt("ID_PROFESOR");
                String nombres = rs.getString("NOMBRE");
                String apellidos = rs.getString("APELLIDOS");
                String dni = rs.getString("DNI");
                String genero = rs.getString("GENERO");
                String email = rs.getString("EMAIL");
                String telefono = rs.getString("TELEFONO");
                String celular = rs.getString("CELULAR");
                String direccion = rs.getString("DIRECCION");
                Double sueldo = rs.getDouble("SUELDO");

                profesor = new Profesor(id_profesor, nombres, apellidos, dni, genero, email, telefono, celular, direccion, sueldo);
                profesores.add(profesor);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return profesores;
    } /* FIN METODO LISTAR PROFESORES */

    /* INICIO METODO ENCONTRAR PROFESOR */
    public Profesor encontrar(Profesor profesor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, profesor.getIdProfesor());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            String nombres = rs.getString("NOMBRE");
            String apellidos = rs.getString("APELLIDOS");
            String dni = rs.getString("DNI");
            String genero = rs.getString("GENERO");
            String email = rs.getString("EMAIL");
            String telefono = rs.getString("TELEFONO");
            String celular = rs.getString("CELULAR");
            String direccion = rs.getString("DIRECCION");
            Double sueldo = rs.getDouble("SUELDO");

            profesor.setNombre(nombres);
            profesor.setApellido(apellidos);
            profesor.setDni(dni);
            profesor.setGenero(genero);
            profesor.setEmail(email);
            profesor.setTelefono(telefono);
            profesor.setCelular(celular);
            profesor.setDireccion(direccion);
            profesor.setSueldo(sueldo);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return profesor;
    } /* FIN METODO ENCONTRAR PROFESOR */

    /* INICIO METODO INSERTAR PROFESOR */
    public int insertar(Profesor profesor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, profesor.getNombre());
            stmt.setString(2, profesor.getApellido());
            stmt.setString(3, profesor.getDni());
            stmt.setString(4, profesor.getGenero());
            stmt.setString(5, profesor.getEmail());
            stmt.setString(6, profesor.getTelefono());
            stmt.setString(7, profesor.getCelular());
            stmt.setString(8, profesor.getDireccion());
            stmt.setDouble(9, profesor.getSueldo());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR PROFESOR */

    /* INICIO METODO ACTUALIZAR PROFESOR */
    public int actualizar(Profesor profesor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, profesor.getNombre());
            stmt.setString(2, profesor.getApellido());
            stmt.setString(3, profesor.getDni());
            stmt.setString(4, profesor.getGenero());
            stmt.setString(5, profesor.getEmail());
            stmt.setString(6, profesor.getTelefono());
            stmt.setString(7, profesor.getCelular());
            stmt.setString(8, profesor.getDireccion());
            stmt.setDouble(9, profesor.getSueldo());
            stmt.setInt(10, profesor.getIdProfesor());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR PROFESOR */

    /* INICIO METODO ELIMINAR PROFESOR */
    public int eliminar(Profesor profesor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, profesor.getIdProfesor());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR PROFESOR */
}
