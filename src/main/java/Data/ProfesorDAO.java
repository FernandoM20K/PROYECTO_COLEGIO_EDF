package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Profesor;

public class ProfesorDAO {
    private static final String SQL_SELECT = "SELECT TP.ID_PROFESOR, TP.NOMBRE, TP.APELLIDOS, TP.DNI, TP.GENERO, TP.EMAIL, TP.TELEFONO, TP.CELULAR, TP.DIRECCION, TP.SUELDO, TS.ID_SEDE, TS.NOMBRE, TC.ID_CURSO, TC.NOMBRE FROM TB_PROFESORES TP INNER JOIN TB_SEDES TS ON TP.ID_SEDE=TS.ID_SEDE INNER JOIN TB_CURSOS TC ON TP.ID_CURSO=TC.ID_CURSO";

    private static final String SQL_SELECT_BY_ID = "ELECT TP.ID_PROFESOR, TP.NOMBRE, TP.APELLIDOS, TP.DNI, TP.GENERO, TP.EMAIL, TP.TELEFONO, TP.CELULAR, TP.DIRECCION, TP.SUELDO, TS.ID_SEDE, TS.NOMBRE, TC.ID_CURSO, TC.NOMBRE FROM TB_PROFESORES TP INNER JOIN TB_SEDES TS ON TP.ID_SEDE=TS.ID_SEDE INNER JOIN TB_CURSOS TC ON TP.ID_CURSO=TC.ID_CURSO WHERE TP.ID_PROFESOR = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_PROFESORES(NOMBRE, APELLIDOS, DNI, GENERO, EMAIL, TELEFONO, CELULAR, DIRECCION, SUELDO, ID_SEDE, ID_CURSO) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_PROFESORES SET NOMBRE=?, APELLIDOS=?, DNI=?, GENERO=?, EMAIL=?, TELEFONO=?, CELULAR=?, DIRECCION=?, SUELDO=?, ID_SEDE=?, ID_CURSO=? WHERE ID_PROFESOR=?";

    private static final String SQL_DELETE = "DELETE FROM TB_PROFESORES WHERE ID_PROFESOR=?";

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
                int id_profesor = rs.getInt(1);
                String nombres = rs.getString(2);
                String apellidos = rs.getString(3);
                String dni = rs.getString(4);
                String genero = rs.getString(5);
                String email = rs.getString(6);
                String telefono = rs.getString(7);
                String celular = rs.getString(8);
                String direccion = rs.getString(9);
                Double sueldo = rs.getDouble(10);
                int idSede = rs.getInt(11);
                String nombreSede = rs.getString(12);
                int idCurso = rs.getInt(13);
                String nombreCurso = rs.getString(14);

                profesor = new Profesor(id_profesor, nombres, apellidos, dni, genero, email, telefono, celular, direccion, sueldo, idSede, nombreSede, idCurso, nombreCurso);
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
            int idSede = rs.getInt("ID_SEDE");
            int idCurso = rs.getInt("ID_CURSO");

            profesor.setNombre(nombres);
            profesor.setApellido(apellidos);
            profesor.setDni(dni);
            profesor.setGenero(genero);
            profesor.setEmail(email);
            profesor.setTelefono(telefono);
            profesor.setCelular(celular);
            profesor.setDireccion(direccion);
            profesor.setSueldo(sueldo);
            profesor.setIdSede(idSede);
            profesor.setIdCurso(idCurso);

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
            stmt.setInt(10, profesor.getIdSede());
            stmt.setInt(11, profesor.getIdCurso());

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
            stmt.setInt(10, profesor.getIdSede());
            stmt.setInt(11, profesor.getIdCurso());
            stmt.setInt(12, profesor.getIdProfesor());

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

/****************************************************************************************/
/* PROFESORDAO COMPLETADO CON EXITO - PUEDEN SURGIR CAMBIOS MIENTRAS EL PROYECTO AVANCE */
/****************************************************************************************/
