package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Curso;

public class CursoDAO {
    private static final String SQL_SELECT = "SELECT ID_CURSO, NOMBRE_CURSO, HORAS_ACADEMICAS FROM TB_CURSOS";

    private static final String SQL_SELECT_BY_ID = "SELECT ID_CURSO, NOMBRE_CURSO, HORAS_ACADEMICAS FROM TB_CURSOS WHERE ID_CURSO = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_CURSOS(NOMBRE_CURSO, HORAS_ACADEMICAS) VALUES(?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_CURSOS SET NOMBRE_CURSO=?, HORAS_ACADEMICAS=? WHERE ID_CURSO=?";

    private static final String SQL_DELETE = "DELETE FROM TB_CURSOS WHERE ID_CURSO=?";

    /* INICIO METODO LISTAR CURSOS */
    public List<Curso> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Curso curso = null;
        List<Curso> cursos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int idCurso = rs.getInt("ID_CURSO");
                String nombre = rs.getString("NOMBRE_CURSO");
                int horasAcademicas = rs.getInt("HORAS_ACADEMICAS");

                curso = new Curso(idCurso, nombre, horasAcademicas);
                cursos.add(curso);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return cursos;
    } /* FIN METODO LISTAR CURSOS */

    /* INICIO METODO ENCONTRAR CURSOS */
    public Curso encontrar(Curso curso) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, curso.getIdCurso());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            String nombre = rs.getString("NOMBRE_CURSO");
            int horasAcademicas = rs.getInt("HORAS_ACADEMICAS");

            curso.setNombreCurso(nombre);
            curso.setHorasAcademicas(horasAcademicas);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return curso;
    } /* FIN METODO ENCONTRAR CURSOS */

    /* INICIO METODO INSERTAR CURSO */
    public int insertar(Curso curso) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, curso.getNombreCurso());
            stmt.setInt(2, curso.getHorasAcademicas());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR CURSO */

    /* INICIO METODO ACTUALIZAR CURSO */
    public int actualizar(Curso curso) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, curso.getNombreCurso());
            stmt.setInt(2, curso.getHorasAcademicas());
            stmt.setInt(3, curso.getIdCurso());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR CURSO */

    /* INICIO METODO ELIMINAR CLIENTE */
    public int eliminar(Curso curso) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, curso.getIdCurso());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR CLIENTE */
}

/*************************************************************************************/
/* CURSODAO COMPLETADO CON EXITO - PUEDEN SURGIR CAMBIOS MIENTRAS EL PROYECTO AVANCE */
/*************************************************************************************/
