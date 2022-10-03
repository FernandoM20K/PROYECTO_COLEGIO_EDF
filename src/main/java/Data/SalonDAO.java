package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Entidades.Salon;

public class SalonDAO {
    private static final String SQL_SELECT = "SELECT TSA.ID_SALON, TSA.ID_SEDE, TSE.NOMBRE, TSA.GRADO, TSA.SECCION, TSA.NRO_MAX FROM TB_SALONES TSA INNER JOIN TB_SEDES TSE ON TSA.ID_SEDE=TSE.ID_SEDE";

    private static final String SQL_SELECT_BY_ID = "SELECT ID_SALON, ID_SEDE, GRADO, SECCION, NRO_MAX FROM TB_SALONES WHERE ID_SALONES = ?";

    private static final String SQL_INSERT = "INSERT INTO TB_SALONES(ID_SEDE, GRADO, SECCION, NRO_MAX) VALUES(?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE TB_SALONES SET GRADO=?, SECCION=?, NRO_MAX=? WHERE ID_SALON=?";

    private static final String SQL_DELETE = "DELETE FROM TB_SALONES WHERE ID_SALON=?";

    /* INICIO METODO LISTAR SALONES */
    public List<Salon> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Salon salon = null;
        List<Salon> salones = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int idSalon = rs.getInt(1);
                int idSede = rs.getInt(2);
                String nombreSede = rs.getString(3);
                String grado = rs.getString(4);
                String seccion = rs.getString(5);
                int nroMax = rs.getInt(6);

                salon = new Salon(idSalon, idSede, nombreSede, grado, seccion, nroMax);
                salones.add(salon);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return salones;
    } /* FIN METODO LISTAR SALONES */

    /* INICIO METODO ENCONTRAR SALON */
    public Salon encontrar(Salon salon) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, salon.getIdSalon());
            rs = stmt.executeQuery();
            rs.next(); //NOS POSICIONAMOS EN EL PRIMER REGISTRO

            int idSede = rs.getInt("ID_SEDE");
            String grado = rs.getString("GRADO");
            String seccion = rs.getString("SECCION");
            int nroMax = rs.getInt("NRO_MAX");

            salon.setIdSede(idSede);
            salon.setGrado(grado);
            salon.setSeccion(seccion);
            salon.setNroMax(nroMax);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return salon;
    } /* FIN METODO ENCONTRAR SALON */

    /* INICIO METODO INSERTAR SALON */
    public int insertar(Salon salon) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, salon.getIdSede());
            stmt.setString(2, salon.getGrado());
            stmt.setString(3, salon.getSeccion());
            stmt.setInt(4, salon.getNroMax());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO INSERTAR SALON */

    /* INICIO METODO ACTUALIZAR SALON */
    public int actualizar(Salon salon) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, salon.getGrado());
            stmt.setString(2, salon.getSeccion());
            stmt.setInt(3, salon.getNroMax());
            stmt.setInt(4, salon.getIdSalon());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ACTUALIZAR SALON */

    /* INICIO METODO ELIMINAR SALON */
    public int eliminar(Salon salon) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, salon.getIdSalon());

            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    } /* FIN METODO ELIMINAR SALON */
}

/****************************************************************************/
/* SALONDAO COMPLETADO CON EXITO - VERSION FINAL DEL ARCHIVO DE EL PROYECTO */
/****************************************************************************/