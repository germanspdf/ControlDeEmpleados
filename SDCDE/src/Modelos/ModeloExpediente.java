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
    /*
    public ArrayList<PdfDoc> Listar_PdfDoc(){
        ArrayList<PdfDoc> list = new ArrayList<PdfDoc>();
        Conexion con = new Conexion();
        String sql = "SELECT tipo_doc, archivo_doc FROM Documentos "
                + "WHERE id_expediente in(SELECT id_expediente FROM Expediente"
                + "WHERE rfc in(SELECT rfc FROM Empleado WHERE rfc = 1))";
        
    }
*/
}
