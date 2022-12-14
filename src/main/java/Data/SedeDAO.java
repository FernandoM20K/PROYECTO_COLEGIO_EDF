package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Sede;

public class SedeDAO {
    private static final String SQL_SELECT = "SELECT ID_SEDE, NOMBRE, DIRECCION, TELEFONO FROM TB_SEDES";

    private static final String SQL_SELECT_BY_ID = "SELECT ID_SEDE, NOMBRE, DIRECCION, TELEFONO FROM TB_SEDES WHERE ID_SEDE = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_SEDES(NOMBRE, DIRECCION, TELEFONO) VALUES(?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_SEDES SET NOMBRE=?, DIRECCION=?, TELEFONO=? WHERE ID_SEDE=?";

    private static final String SQL_DELETE = "DELETE FROM TB_SEDES WHERE ID_SEDE=?";

    /* INICIO METODO LISTAR SEDES */
    public List<Sede> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Sede sede = null;
        List<Sede> sedes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id_sede = rs.getInt("ID_SEDE");
                String nombre = rs.getString("NOMBRE");
                String direccion = rs.getString("DIRECCION");
                String telefono = rs.getString("TELEFONO");

                sede = new Sede(id_sede, nombre, direccion, telefono);
                sedes.add(sede);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return sedes;
    } /* FIN METODO LISTAR SEDES */

    /* INICIO METODO ENCONTRAR SEDES */
    public Sede encontrar(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, sede.getIdSede());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            String nombre = rs.getString("NOMBRE");
            String direccion = rs.getString("DIRECCION");
            String telefono = rs.getString("TELEFONO");

            sede.setNombre(nombre);
            sede.setDireccion(direccion);
            sede.setTelefono(telefono);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return sede;
    } /* FIN METODO ENCONTRAR SEDES */

    /* INICIO METODO INSERTAR SEDE */
    public int insertar(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, sede.getNombre());
            stmt.setString(2, sede.getDireccion());
            stmt.setString(3, sede.getTelefono());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR SEDE */

    /* INICIO METODO ACTUALIZAR SEDE */
    public int actualizar(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, sede.getNombre());
            stmt.setString(2, sede.getDireccion());
            stmt.setString(3, sede.getTelefono());
            stmt.setInt(4, sede.getIdSede());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR SEDE */

    /* INICIO METODO ELIMINAR SEDE */
    public int eliminar(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, sede.getIdSede());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR SEDE */
}

/************************************************************************************/
/* SEDEDAO COMPLETADO CON EXITO - PUEDEN SURGIR CAMBIOS MIENTRAS EL PROYECTO AVANCE */
/************************************************************************************/