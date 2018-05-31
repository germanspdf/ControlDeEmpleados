/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

public class PdfDoc {
    /*Todo los atributos*/
    String tipo_doc;
    byte[] archivo_doc;
    int id_expediente;
    
    public PdfDoc() {
    }

    /*Todo los codigos get*/
    
    public int getIdExpediente() {
        return id_expediente;
    }
    public String getNombrepdf() {
        return tipo_doc;
    }

    public byte[] getArchivopdf() {
        return archivo_doc;
    }


    /*Todo los codigos set*/
    
    public void setNombrepdf(String nombrepdf) {
        this.tipo_doc = nombrepdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivo_doc = archivopdf;
    }
    public void setIdExpediente(int id_expediente) {
        this.id_expediente = id_expediente;
    }
    

}
