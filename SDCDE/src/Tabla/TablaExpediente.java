package Tabla;

import Modelos.ModeloExpediente;//DAO.PdfDAO
import Modelos.PdfDoc;//VO.PdfVO
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TablaExpediente {

    ModeloExpediente me = null;

    public void visualizar_Pdf(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Tipo Pdf");
        dt.addColumn("Documento");

        ImageIcon icono = null;
        if (get_Image("/imagenes/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/imagenes/32pdf.png"));
        }

        me = new ModeloExpediente();
        PdfDoc doc = new PdfDoc();
        ArrayList<PdfDoc> list = me.Listar_PdfDoc();
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[2];
                doc = list.get(i);
                fila[0] = doc.getNombrepdf();
                if (doc.getArchivopdf() != null) {
                    fila[1] = new JButton(icono);
                } else {
                    fila[1] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
