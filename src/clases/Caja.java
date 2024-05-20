package clases;

import java.sql.*;
import java.util.ArrayList;

public class Caja {


    String url= "jdbc:mysql://localhost:3306/proyectoprogramacion";
    String usuario="root";
    String password = "7645";

    public ArrayList<Pokemon> caja = new ArrayList<>();
    public int long_max = 30;
    public   int ID_CAJA;
    public   String NOMBRE;
    public int CAPACIDAD;

    public Caja(int ID_CAJA) {
        this.ID_CAJA = ID_CAJA;
    }


    public String getNombreCaja(){
        String nombre = "";

        return nombre;
    }
}
