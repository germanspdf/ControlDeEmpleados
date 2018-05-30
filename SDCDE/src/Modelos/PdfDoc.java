/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author German
 */
public class PdfDoc {
    /*Todo los atributos*/
    String tipo_doc;
    byte[] archivo_doc;

    public PdfDoc() {
    }

    /*Todo los codigos get*/
    

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

}
