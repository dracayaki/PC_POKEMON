package clases;

import java.sql.*;
import java.util.ArrayList;

public class CajaDAO {

    private static Connection conectarBBDD() {
        String url= "jdbc:mysql://localhost:3306/proyectoprogramacion";
        String usuario="root";
        String password = "7645";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public ArrayList<Pokemon> listaCaja(int ID_CAJA){
        boolean resultado = existeCaja(ID_CAJA);
        ArrayList<Pokemon> cajaPok = new ArrayList<>();
        if (resultado){
            Connection con = conectarBBDD();
            String sql = "select * from caja where id_proyecto = ?";
        }
        return cajaPok;
    }

    public boolean existeCaja(int ID_CAJA){
        Boolean existe = false;
        Connection con = conectarBBDD();

        String sql = "SELECT * FROM cajas WHERE id_caja = ? ";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, ID_CAJA);

            ResultSet rs = sentencia.executeQuery();
            if (!rs.next()) {
                System.out.println("Lo siento, no existe una caja con ese id");
            } else {
                System.out.println(" Esa caja si existe.");
                existe = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return existe;
    }
}
