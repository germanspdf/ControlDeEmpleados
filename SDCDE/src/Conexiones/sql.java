/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sql {
     public int autoIncrementar(String sql) {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        try {
            ps = con.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo" + ex.getMessage());
            id = 1;
        } finally {
            try {
                ps.close();
                rs.close();
                con.desconectar();
            } catch (Exception ex) {
            }
        }
        return id;
    }
}
