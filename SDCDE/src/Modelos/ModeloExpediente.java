/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexiones.Conexion;
import Vistas.VistaExpediente;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloExpediente {

    public ArrayList<PdfDoc> Listar_PdfDoc() {
        ArrayList<PdfDoc> list = new ArrayList<PdfDoc>();
        Conexion con = new Conexion();
        /*
        String sql = "SELECT tipo_doc, archivo_doc FROM Documentos "
                + "WHERE id_expediente in(SELECT id_expediente FROM Expediente"
                + "WHERE rfc in(SELECT rfc FROM Empleado WHERE rfc = 1))";
        */
        String sql = "SELECT tipo_doc, archivo_doc FROM Documentos "
                + "WHERE id_expediente IN(SELECT id_expediente FROM Expediente "
                + "WHERE rfc IN(SELECT rfc FROM Empleado WHERE rfc = 1))";
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            ps = con.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfDoc doc = new PdfDoc();
                doc.setNombrepdf(rs.getString("tipo_doc"));
                doc.setArchivopdf(rs.getBytes("archivo_doc"));
                list.add(doc);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }

    public void agregarDoc(PdfDoc doc) {
        Conexion con = new Conexion();
        String sql = "INSERT INTO Documentos (tipo_doc, archivo_doc, id_expediente) "
                + "VALUES(?, ?, ?)";
        PreparedStatement ps = null;
        try {
            System.out.println(doc.getArchivopdf());
            System.out.println(doc.getIdExpediente());
            System.out.println(doc.getNombrepdf());
            
            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, doc.getNombrepdf());
            ps.setBytes(2, doc.getArchivopdf());
            ps.setInt(3, doc.getIdExpediente());
            //System.out.println("Entro");
            
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                con.desconectar();
            } catch (Exception ex) {
            }
        }
    }
/*Metodo Eliminar*/
    public void eliminarPdf(PdfDoc doc) {
        Conexion con = new Conexion();
        String sql = "DELETE FROM Documentos WHERE tipo_doc = ? AND id_expediente = ?;";
        PreparedStatement ps = null;
        try {
            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, doc.getNombrepdf());
            //ps.setInt(1, doc.getNombrepdf());
            ps.setInt(2, doc.getIdExpediente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                con.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutarArchivoPdf(String nombrePdf) {

        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = con.getConnection().prepareStatement("SELECT archivo_doc FROM Documentos WHERE tipo_doc = ?;");
            ps.setString(1, nombrePdf);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            con.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

}