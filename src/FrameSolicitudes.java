
import java.util.ArrayList;
import java.util.HashSet;


public class FrameSolicitudes extends javax.swing.JFrame {

    private static Usuario userLocal;
    /**
     * Creates new form FrameSolicitudes
     */
    public FrameSolicitudes() {
        
        this.setResizable(false);
        initComponents();
        // try catch? porque el usuario puede ser nulo?
        this.comboAgregarProyectos(this.userLocal);
        this.comboItemagregarTipoItem();
    }

    public static void setUser(Usuario user) {
        userLocal = user;
    }

    public Usuario getUser() {
        return userLocal;
    }
    

    public  void comboItemagregarTipoItem () {
        Sistema s = Sistema.getInstance();
        HashSet<Tipo_Item> tipoItemExistentes =s.getTipoItems_existentes();     
        for (Tipo_Item ti: tipoItemExistentes) {
            comboItems.addItem(ti.getNombre());
        }
    }
    
    public void comboAgregarProyectos (Usuario user){
        Sistema s = Sistema.getInstance();
        ArrayList <Proyecto> proyectoUsuario = s.buscar_proyecto_porUsuario(user);
        for (Proyecto p : proyectoUsuario){
            comboBoxProyectos.addItem(p.getNombre());
        }
    }
    
    public void llenarDialogItem (String desc,Tipo_Item ti, Proyecto p) {
        
        String detalleItem;
        String s = "Nombre del proyecto: " + p.getNombre() + ". Del Usuario: " + p.getUsuario().getNombreUsuario();
        String s2 = "Tipo de item: " + ti.getNombre();
        String s3 = "Descripcion del item: " + desc;    
        detalleItem= s + "\n \n" + s2 + "\n \n" + s3;
        txtaDetalleItem.setText(detalleItem);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialgNuevoProyecto = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaNombreProyecto = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        DialogItem = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        TituloItemCreado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaDetalleItem = new javax.swing.JTextArea();
        botonAceptarItem = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaSolicitudes = new javax.swing.JLabel();
        comboItems = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaProyecto = new javax.swing.JLabel();
        botonNuevoProyecto = new javax.swing.JButton();
        comboBoxProyectos = new javax.swing.JComboBox<>();

        DialgNuevoProyecto.setTitle("Nuevo Proyecto");
        DialgNuevoProyecto.setLocation(new java.awt.Point(450, 200));
        DialgNuevoProyecto.setSize(new java.awt.Dimension(355, 180));

        etiquetaTitulo2.setText("                     Nuevo Proyecto");
        etiquetaTitulo2.setToolTipText("");
        etiquetaTitulo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiquetaNombreProyecto.setText("Nombre del Proyecto :");

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiquetaNombreProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombreProyecto))
                .addGap(18, 18, 18)
                .addComponent(botonCrear)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialgNuevoProyectoLayout = new javax.swing.GroupLayout(DialgNuevoProyecto.getContentPane());
        DialgNuevoProyecto.getContentPane().setLayout(DialgNuevoProyectoLayout);
        DialgNuevoProyectoLayout.setHorizontalGroup(
            DialgNuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialgNuevoProyectoLayout.setVerticalGroup(
            DialgNuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DialogItem.setTitle("Item creado con exito");
        DialogItem.setLocation(new java.awt.Point(450, 200));
        DialogItem.setSize(new java.awt.Dimension(400, 350));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TituloItemCreado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TituloItemCreado.setText("Detalle del Item ");

        txtaDetalleItem.setEditable(false);
        txtaDetalleItem.setColumns(20);
        txtaDetalleItem.setRows(5);
        txtaDetalleItem.setAutoscrolls(false);
        txtaDetalleItem.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtaDetalleItem);

        botonAceptarItem.setText("Aceptar");
        botonAceptarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(botonAceptarItem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(TituloItemCreado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TituloItemCreado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAceptarItem)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogItemLayout = new javax.swing.GroupLayout(DialogItem.getContentPane());
        DialogItem.getContentPane().setLayout(DialogItemLayout);
        DialogItemLayout.setHorizontalGroup(
            DialogItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogItemLayout.setVerticalGroup(
            DialogItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva Solicitud");
        setBounds(new java.awt.Rectangle(450, 200, 0, 0));

        etiquetaTitulo.setText("PANEL DE SOLICITUDES");

        etiquetaSolicitudes.setText("Seleccione el tipo de solicitud");

        comboItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemsActionPerformed(evt);
            }
        });

        txtDescripción.setColumns(20);
        txtDescripción.setRows(5);
        jScrollPane1.setViewportView(txtDescripción);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etiquetaDescripcion.setText("Ingrese una descripción detallada de su solicitud");

        etiquetaProyecto.setText("Proyecto:");

        botonNuevoProyecto.setText("Nuevo Proyecto");
        botonNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProyectoActionPerformed(evt);
            }
        });

        comboBoxProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProyectosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(164, 164, 164))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(etiquetaProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonNuevoProyecto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDescripcion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboItems, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaProyecto)
                    .addComponent(botonNuevoProyecto)
                    .addComponent(comboBoxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(etiquetaSolicitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(etiquetaDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sistema s = Sistema.getInstance ();
        String string_proyecto = (String) comboBoxProyectos.getSelectedItem(); // CAST OBJECT -> STRING
        String string_tipoitem = (String) comboItems.getSelectedItem();
        
        Tipo_Item tipoItemSeleccionado= s.buscar_tipoItem(string_tipoitem);
        Proyecto proyectoSleccionado = s.buscar_proyecto(string_proyecto);
        
        proyectoSleccionado.crearItem(txtDescripción.getText() , tipoItemSeleccionado);
        
        
        DialogItem.setVisible(true);
        DialogItem.setResizable(false);  
        llenarDialogItem (txtDescripción.getText(),tipoItemSeleccionado,proyectoSleccionado);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemsActionPerformed
  
    }//GEN-LAST:event_comboItemsActionPerformed

    private void comboBoxProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProyectosActionPerformed

    }//GEN-LAST:event_comboBoxProyectosActionPerformed

    private void botonNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProyectoActionPerformed
        DialgNuevoProyecto.setVisible(true);
        DialgNuevoProyecto.setResizable(false);     
    }//GEN-LAST:event_botonNuevoProyectoActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        Sistema sis= Sistema.getInstance() ;
        String nombre= txtNombreProyecto.getText();
        sis.crear_proyecto(userLocal, nombre);
        this.comboBoxProyectos.removeAllItems();
        this.comboAgregarProyectos (userLocal);
        DialgNuevoProyecto.dispose ();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonAceptarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarItemActionPerformed
       DialogItem.dispose();
       this.dispose();
    }//GEN-LAST:event_botonAceptarItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSolicitudes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialgNuevoProyecto;
    private javax.swing.JDialog DialogItem;
    private javax.swing.JLabel TituloItemCreado;
    private javax.swing.JButton botonAceptarItem;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonNuevoProyecto;
    private javax.swing.JComboBox<String> comboBoxProyectos;
    private javax.swing.JComboBox<String> comboItems;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaNombreProyecto;
    private javax.swing.JLabel etiquetaProyecto;
    private javax.swing.JLabel etiquetaSolicitudes;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDescripción;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextArea txtaDetalleItem;
    // End of variables declaration//GEN-END:variables
}
