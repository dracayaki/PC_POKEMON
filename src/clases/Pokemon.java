package clases;

import java.sql.*;

public class Pokemon{
    String url= "jdbc:mysql://localhost:3306/proyectoprogramacion";
    String usuario="root";
    String password = "7645";

    public int ID;
    public int num_pokedex;
    public String Nombre;
    public String habilidad;
    public int nivel;
    public String tipo1;
    public String tipo2;
    public String objeto;
    public int HP;
    public int ataque;
    public int defensa;
    public int ataqueEspecial;
    public int defensaEspecial;
    public int velocidad;
    public String mov1;
    public String mov2;
    public int id_Caja;
    public boolean estaEnEquipo;

    public Pokemon(int id_pokemon){
        this.ID = id_pokemon;
    }

    }
}
