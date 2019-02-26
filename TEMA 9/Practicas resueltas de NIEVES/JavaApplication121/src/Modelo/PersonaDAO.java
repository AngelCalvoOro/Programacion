/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

public class PersonaDAO {
    
    private Connection con;

    public PersonaDAO(Connection con) {
        this.con = con;
    }
    
    
    
    public void darAlta(Persona p)
    {
        try
        {
        Statement sentencia =con.createStatement();
        
        //int n= sentencia.executeUpdate("INSERT INTO personas VALUES ('Pepe',12);");
        
        /*String s="INSERT INTO personas VALUES ('" + p.getNombre() + "'," + p.getNro()+ ");";
        int n= sentencia.executeUpdate(s);*/
        
        String plantilla = "insert into personas values (?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getNro());
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass() + e.getMessage());
        }
    
}
    
public String consultar(String nombre)
{
    try
    {
     String plantilla = "select * from personas where nombre = ?;";
     PreparedStatement ps = con.prepareStatement(plantilla);
     ps.setString(1,nombre);
     ResultSet resultado = ps.executeQuery();
     if (resultado.next())
         // Hay datos
         return resultado.getString("nombre") + resultado.getInt(2);
         // return resultado.getString(1) + resultado.getInt("edad");
     else
         // Cero filas seleccionadas
         return "No hay datos";
    }
    catch(Exception e)
    {
        return null;
    }
}
}
