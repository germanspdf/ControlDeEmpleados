package Vistas;


import Vistas.VistaExpediente;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {
    static String rfc;
    static ResultSet res;
    
    public MenuPrincipal() {
        initComponents();
        noVisible();
        Conexiones.Conexion.getConnection();
    }
    public void noVisible(){
        tablaExpediente_panel.setVisible(false);
        formaAlta_panel.setVisible(false);
        formaBaja_panel.setVisible(false);
        mostrarPlazas_panel.setVisible(false);
        mostrarPresupuesto_panel.setVisible(false);
    }
    
    public void cargarTabla(){
        DefaultTableModel tm = (DefaultTableModel) tablaEmpleados.getModel();
        tm.setRowCount(0);
        res = Conexiones.Conexion.Consulta("SELECT * FROM Empleado");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                v.add(res.getString(11));
                v.add(res.getString(12));
                v.add(res.getString(13));
                v.add(res.getString(14));
                v.add(res.getString(15));
                v.add(res.getInt(16));
                tm.addRow(v);
                tablaEmpleados.setModel(tm);
            }
        }catch(SQLException e){
            
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_panel = new javax.swing.JPanel();
        menu_panel = new javax.swing.JPanel();
        expediente_panel = new javax.swing.JPanel();
        titulo_lbl = new javax.swing.JLabel();
        icono1_lbl = new javax.swing.JLabel();
        darDeAlta_panel = new javax.swing.JPanel();
        titulo1_lbl = new javax.swing.JLabel();
        icono2_lbl = new javax.swing.JLabel();
        darDeBaja_panel = new javax.swing.JPanel();
        titulo_lbl4 = new javax.swing.JLabel();
        icono1_lbl4 = new javax.swing.JLabel();
        plazas_panel = new javax.swing.JPanel();
        titulo_lbl3 = new javax.swing.JLabel();
        icono1_lbl3 = new javax.swing.JLabel();
        calcularPresupuesto_panel = new javax.swing.JPanel();
        titulo_lbl6 = new javax.swing.JLabel();
        icono1_lbl6 = new javax.swing.JLabel();
        titulo_panel = new javax.swing.JPanel();
        titulo_lbl7 = new javax.swing.JLabel();
        opcionActual_panel = new javax.swing.JPanel();
        opcionActual_label = new javax.swing.JLabel();
        contenido_panel = new javax.swing.JPanel();
        tablaExpediente_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        formaAlta_panel = new javax.swing.JPanel();
        formaBaja_panel = new javax.swing.JPanel();
        mostrarPlazas_panel = new javax.swing.JPanel();
        mostrarPresupuesto_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(1000, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        bg_panel.setBackground(new java.awt.Color(255, 255, 255));
        bg_panel.setPreferredSize(new java.awt.Dimension(800, 600));

        menu_panel.setBackground(new java.awt.Color(18, 124, 98));

        expediente_panel.setBackground(new java.awt.Color(29, 175, 140));
        expediente_panel.setPreferredSize(new java.awt.Dimension(288, 49));
        expediente_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expediente_panelMouseClicked(evt);
            }
        });

        titulo_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lbl.setText("Consultar expediente");

        icono1_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ereader-40.png"))); // NOI18N

        javax.swing.GroupLayout expediente_panelLayout = new javax.swing.GroupLayout(expediente_panel);
        expediente_panel.setLayout(expediente_panelLayout);
        expediente_panelLayout.setHorizontalGroup(
            expediente_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expediente_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono1_lbl)
                .addGap(27, 27, 27)
                .addComponent(titulo_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        expediente_panelLayout.setVerticalGroup(
            expediente_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expediente_panelLayout.createSequentialGroup()
                .addComponent(icono1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, expediente_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        darDeAlta_panel.setBackground(new java.awt.Color(29, 175, 140));
        darDeAlta_panel.setPreferredSize(new java.awt.Dimension(288, 49));
        darDeAlta_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darDeAlta_panelMouseClicked(evt);
            }
        });

        titulo1_lbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titulo1_lbl.setForeground(new java.awt.Color(255, 255, 255));
        titulo1_lbl.setText("Dar De Alta Empleado");

        icono2_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-user-male-40.png"))); // NOI18N

        javax.swing.GroupLayout darDeAlta_panelLayout = new javax.swing.GroupLayout(darDeAlta_panel);
        darDeAlta_panel.setLayout(darDeAlta_panelLayout);
        darDeAlta_panelLayout.setHorizontalGroup(
            darDeAlta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darDeAlta_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono2_lbl)
                .addGap(27, 27, 27)
                .addComponent(titulo1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        darDeAlta_panelLayout.setVerticalGroup(
            darDeAlta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darDeAlta_panelLayout.createSequentialGroup()
                .addComponent(icono2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(titulo1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        darDeBaja_panel.setBackground(new java.awt.Color(29, 175, 140));
        darDeBaja_panel.setPreferredSize(new java.awt.Dimension(288, 49));
        darDeBaja_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darDeBaja_panelMouseClicked(evt);
            }
        });

        titulo_lbl4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titulo_lbl4.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lbl4.setText("Dar De Baja Empleado ");

        icono1_lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cancel-40.png"))); // NOI18N

        javax.swing.GroupLayout darDeBaja_panelLayout = new javax.swing.GroupLayout(darDeBaja_panel);
        darDeBaja_panel.setLayout(darDeBaja_panelLayout);
        darDeBaja_panelLayout.setHorizontalGroup(
            darDeBaja_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darDeBaja_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono1_lbl4)
                .addGap(27, 27, 27)
                .addComponent(titulo_lbl4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        darDeBaja_panelLayout.setVerticalGroup(
            darDeBaja_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darDeBaja_panelLayout.createSequentialGroup()
                .addComponent(icono1_lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darDeBaja_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        plazas_panel.setBackground(new java.awt.Color(29, 175, 140));
        plazas_panel.setPreferredSize(new java.awt.Dimension(288, 49));
        plazas_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plazas_panelMouseClicked(evt);
            }
        });

        titulo_lbl3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titulo_lbl3.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lbl3.setText("Consultar Plazas Disponibles ");

        icono1_lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-briefcase-40.png"))); // NOI18N

        javax.swing.GroupLayout plazas_panelLayout = new javax.swing.GroupLayout(plazas_panel);
        plazas_panel.setLayout(plazas_panelLayout);
        plazas_panelLayout.setHorizontalGroup(
            plazas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plazas_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono1_lbl3)
                .addGap(27, 27, 27)
                .addComponent(titulo_lbl3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        plazas_panelLayout.setVerticalGroup(
            plazas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plazas_panelLayout.createSequentialGroup()
                .addComponent(icono1_lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plazas_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        calcularPresupuesto_panel.setBackground(new java.awt.Color(29, 175, 140));
        calcularPresupuesto_panel.setPreferredSize(new java.awt.Dimension(288, 49));
        calcularPresupuesto_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularPresupuesto_panelMouseClicked(evt);
            }
        });

        titulo_lbl6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titulo_lbl6.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lbl6.setText("Calcular Presupuesto");

        icono1_lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-calculator-40.png"))); // NOI18N

        javax.swing.GroupLayout calcularPresupuesto_panelLayout = new javax.swing.GroupLayout(calcularPresupuesto_panel);
        calcularPresupuesto_panel.setLayout(calcularPresupuesto_panelLayout);
        calcularPresupuesto_panelLayout.setHorizontalGroup(
            calcularPresupuesto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcularPresupuesto_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono1_lbl6)
                .addGap(27, 27, 27)
                .addComponent(titulo_lbl6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        calcularPresupuesto_panelLayout.setVerticalGroup(
            calcularPresupuesto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcularPresupuesto_panelLayout.createSequentialGroup()
                .addComponent(icono1_lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calcularPresupuesto_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo_panel.setBackground(new java.awt.Color(18, 124, 98));
        titulo_panel.setPreferredSize(new java.awt.Dimension(288, 122));

        titulo_lbl7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo_lbl7.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lbl7.setText("Sistema de Control de Empleados");

        javax.swing.GroupLayout titulo_panelLayout = new javax.swing.GroupLayout(titulo_panel);
        titulo_panel.setLayout(titulo_panelLayout);
        titulo_panelLayout.setHorizontalGroup(
            titulo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titulo_panelLayout.setVerticalGroup(
            titulo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titulo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(expediente_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
            .addComponent(titulo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
            .addComponent(darDeAlta_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calcularPresupuesto_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(darDeBaja_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(plazas_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(titulo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expediente_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(darDeAlta_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(darDeBaja_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(plazas_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(calcularPresupuesto_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        opcionActual_panel.setBackground(new java.awt.Color(128, 214, 193));
        opcionActual_panel.setPreferredSize(new java.awt.Dimension(700, 100));

        opcionActual_label.setFont(new java.awt.Font("Berlin Sans FB", 1, 26)); // NOI18N
        opcionActual_label.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout opcionActual_panelLayout = new javax.swing.GroupLayout(opcionActual_panel);
        opcionActual_panel.setLayout(opcionActual_panelLayout);
        opcionActual_panelLayout.setHorizontalGroup(
            opcionActual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionActual_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionActual_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        opcionActual_panelLayout.setVerticalGroup(
            opcionActual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionActual_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(opcionActual_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tablaExpediente_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaExpediente_panelMouseClicked(evt);
            }
        });

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RFC", "Nombre", "Apellido P", "Apellido M", "CURP", "NSS", "Domicilio", "Sexo", "Tipo Empleado", "Correo", "Telefono Celular", "Municipio", "Fecha Ingreso", "Fecha Egreso", "id Puesto", "Estatus"
            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout tablaExpediente_panelLayout = new javax.swing.GroupLayout(tablaExpediente_panel);
        tablaExpediente_panel.setLayout(tablaExpediente_panelLayout);
        tablaExpediente_panelLayout.setHorizontalGroup(
            tablaExpediente_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        tablaExpediente_panelLayout.setVerticalGroup(
            tablaExpediente_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaExpediente_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        formaAlta_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formaAlta_panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formaAlta_panelLayout = new javax.swing.GroupLayout(formaAlta_panel);
        formaAlta_panel.setLayout(formaAlta_panelLayout);
        formaAlta_panelLayout.setHorizontalGroup(
            formaAlta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        formaAlta_panelLayout.setVerticalGroup(
            formaAlta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formaBaja_panelLayout = new javax.swing.GroupLayout(formaBaja_panel);
        formaBaja_panel.setLayout(formaBaja_panelLayout);
        formaBaja_panelLayout.setHorizontalGroup(
            formaBaja_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        formaBaja_panelLayout.setVerticalGroup(
            formaBaja_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mostrarPlazas_panelLayout = new javax.swing.GroupLayout(mostrarPlazas_panel);
        mostrarPlazas_panel.setLayout(mostrarPlazas_panelLayout);
        mostrarPlazas_panelLayout.setHorizontalGroup(
            mostrarPlazas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        mostrarPlazas_panelLayout.setVerticalGroup(
            mostrarPlazas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mostrarPresupuesto_panelLayout = new javax.swing.GroupLayout(mostrarPresupuesto_panel);
        mostrarPresupuesto_panel.setLayout(mostrarPresupuesto_panelLayout);
        mostrarPresupuesto_panelLayout.setHorizontalGroup(
            mostrarPresupuesto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        mostrarPresupuesto_panelLayout.setVerticalGroup(
            mostrarPresupuesto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenido_panelLayout = new javax.swing.GroupLayout(contenido_panel);
        contenido_panel.setLayout(contenido_panelLayout);
        contenido_panelLayout.setHorizontalGroup(
            contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaExpediente_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(formaAlta_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(formaBaja_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mostrarPlazas_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mostrarPresupuesto_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenido_panelLayout.setVerticalGroup(
            contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaExpediente_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(formaAlta_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(formaBaja_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mostrarPlazas_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mostrarPresupuesto_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg_panelLayout = new javax.swing.GroupLayout(bg_panel);
        bg_panel.setLayout(bg_panelLayout);
        bg_panelLayout.setHorizontalGroup(
            bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionActual_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addComponent(contenido_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bg_panelLayout.setVerticalGroup(
            bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(opcionActual_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenido_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expediente_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expediente_panelMouseClicked
        // TODO add your handling code here:
        noVisible();
        tablaExpediente_panel.setVisible(true);
        opcionActual_label.setText("Consulta de Expediente");        
        cargarTabla();
    }//GEN-LAST:event_expediente_panelMouseClicked

    private void darDeAlta_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeAlta_panelMouseClicked
        // TODO add your handling code here:
        noVisible();
        formaAlta_panel.setVisible(true);
        formaAlta_panel.setBackground(Color.green);
        opcionActual_label.setText("Formato de Alta");
    }//GEN-LAST:event_darDeAlta_panelMouseClicked

    private void tablaExpediente_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaExpediente_panelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaExpediente_panelMouseClicked

    private void formaAlta_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formaAlta_panelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formaAlta_panelMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void darDeBaja_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBaja_panelMouseClicked
        // TODO add your handling code here:
        opcionActual_label.setText("Dar de Baja a ____________");
    }//GEN-LAST:event_darDeBaja_panelMouseClicked

    private void plazas_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plazas_panelMouseClicked
        // TODO add your handling code here:
        opcionActual_label.setText("Plazas Disponibles");
    }//GEN-LAST:event_plazas_panelMouseClicked

    private void calcularPresupuesto_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularPresupuesto_panelMouseClicked
        // TODO add your handling code here:
        opcionActual_label.setText("Presupuesto disponible para contratacion");
    }//GEN-LAST:event_calcularPresupuesto_panelMouseClicked

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        
        //System.out.println(tablaEmpleados.columnAtPoint(evt.getPoint()));
        int row = tablaEmpleados.getSelectedRow();
        int col = 0;
        rfc = tablaEmpleados.getModel().getValueAt(row, col)+"";
        VistaExpediente ve = new VistaExpediente();
        ve.setVisible(true);
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_panel;
    private javax.swing.JPanel calcularPresupuesto_panel;
    private javax.swing.JPanel contenido_panel;
    private javax.swing.JPanel darDeAlta_panel;
    private javax.swing.JPanel darDeBaja_panel;
    private javax.swing.JPanel expediente_panel;
    private javax.swing.JPanel formaAlta_panel;
    private javax.swing.JPanel formaBaja_panel;
    private javax.swing.JLabel icono1_lbl;
    private javax.swing.JLabel icono1_lbl3;
    private javax.swing.JLabel icono1_lbl4;
    private javax.swing.JLabel icono1_lbl6;
    private javax.swing.JLabel icono2_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JPanel mostrarPlazas_panel;
    private javax.swing.JPanel mostrarPresupuesto_panel;
    private javax.swing.JLabel opcionActual_label;
    private javax.swing.JPanel opcionActual_panel;
    private javax.swing.JPanel plazas_panel;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JPanel tablaExpediente_panel;
    private javax.swing.JLabel titulo1_lbl;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel titulo_lbl3;
    private javax.swing.JLabel titulo_lbl4;
    private javax.swing.JLabel titulo_lbl6;
    private javax.swing.JLabel titulo_lbl7;
    private javax.swing.JPanel titulo_panel;
    // End of variables declaration//GEN-END:variables
}
