package clases;

import java.sql.*;
import clases.Pokemon;

public class PokemonDAO {
    String url= "jdbc:mysql://localhost:3306/proyectoprogramacion";
    String usuario="root";
    String password = "7645";

    public PokemonDAO() {
        super();
    }
    public int getNum_pokedex() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                num_pokedex = res.getInt("NUM_POKEDEX");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }

        return num_pokedex;
    }

    public String getNombre() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                Nombre = res.getNString("NOMBRE");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return Nombre;
    }

    public String getHabilidad() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT hab.NOMBRE as HABILIDAD FROM pokemon pok LEFT JOIN habilidades hab ON pok.ID_HABILIDAD = hab.ID_HABILIDAD WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                habilidad = res.getNString("HABILIDAD");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return habilidad;
    }

    public int getNivel() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                nivel = res.getInt("NIVEL");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }

        return nivel;
    }

    public void setNivel(int nivel) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            if(nivel > 100){
                nivel = 100;
            }
            String sen = "UPDATE pokemon SET NIVEL = " + nivel + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            statement = con.prepareStatement(sen);
            statement.executeUpdate();

        }catch(SQLException e) {
            System.out.print(e);
        }
    }

    public String getTipo1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                tipo1 = res.getNString("TIPO1");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return tipo1;
    }

    public String getTipo2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                tipo2 = res.getNString("TIPO2");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return tipo2;
    }

    public String getObjeto(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT obj.NOMBRE as NOMBRE FROM pokemon pok LEFT JOIN objetos obj ON pok.OBJETO = obj.ID_OBJETO WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                objeto = res.getNString("NOMBRE");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return objeto;
    }
    public void setId_objeto(int id_objeto) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "UPDATE pokemon SET OBJETO = " + id_objeto + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            statement = con.prepareStatement(sen);
            statement.executeUpdate();

        }catch(SQLException e) {
            System.out.print(e);
        }
    }

    public int getHP() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                HP = res.getInt("HP");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return HP;
    }

    public int getAtaque() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                ataque = res.getInt("ATAQUE");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return ataque;
    }

    public int getDefensa() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                defensa = res.getInt("DEFENSA");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return defensa;
    }

    public int getAtaqueEspecial() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                ataqueEspecial = res.getInt("ATAQUE_ESPECIAL");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                defensaEspecial = res.getInt("DEFENSA_ESPECIAL");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return defensaEspecial;
    }

    public int getVelocidad() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                velocidad = res.getInt("VELOCIDAD");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return velocidad;
    }

    public String getMov1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT mov.DESCRIPCION as NOMBRE FROM pokemon pok LEFT JOIN movimientos mov ON pok.MOV1 = mov.ID_MOVIMIENTO WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                mov1 = res.getNString("NOMBRE");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return mov1;
    }

    public void setMov1(int mov1) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "UPDATE pokemon SET MOV1 = " + mov1 + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            statement = con.prepareStatement(sen);
            statement.executeUpdate();

        }catch(SQLException e) {
            System.out.print(e);
        }
    }

    public String getMov2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT mov.DESCRIPCION as NOMBRE FROM pokemon pok LEFT JOIN movimientos mov ON pok.MOV2 = mov.ID_MOVIMIENTO WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                mov2 = res.getNString("NOMBRE");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return mov2;
    }

    public void setMov2(int mov2) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "UPDATE pokemon SET MOV2 = " + mov2 + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            statement = con.prepareStatement(sen);
            statement.executeUpdate();

        }catch(SQLException e) {
            System.out.print(e);
        }
    }

    public int getId_Caja() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                id_Caja = res.getInt("ID_CAJA");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return id_Caja;
    }

    public void setId_Caja(int id_Caja) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "UPDATE pokemon SET ID_CAJA = " + id_Caja + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            statement = con.prepareStatement(sen);
            statement.executeUpdate();

        }catch(SQLException e) {
            System.out.print(e);
        }
    }

    public boolean isEstaEnEquipo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            String sen = "SELECT * FROM pokemon WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sen);
            while (res.next()) {
                estaEnEquipo = res.getBoolean("EQUIPO");
            }

        }catch(SQLException e) {
            System.out.print(e);
        }
        return estaEnEquipo;
    }

    public void setEstaEnEquipo(boolean estaEnEquipo) {
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e);
        }
        try {
            int cantidad = 0;
            String consulta = "SELECT COUNT(*) AS CONTEO FROM equipo";
            String sen = "UPDATE pokemon SET EQUIPO = " + estaEnEquipo + " WHERE ID_POKEMON = " + ID;
            Connection con = DriverManager.getConnection(url, usuario, password);
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consulta);
            while (res.next()) {
                cantidad = res.getInt("CONTEO");
            }
            if (cantidad < 6) {
                statement = con.prepareStatement(sen);
                statement.executeUpdate();
                System.out.print(getNombre() + " ha sido añadido a el equipo\n");
            } else {
                System.out.print("Ya hay 6 pokemon en el equipo\n");
            }

        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}