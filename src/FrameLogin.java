import javax.swing.JOptionPane;
import java.util.HashMap;

public class FrameLogin extends javax.swing.JFrame {

    private static HashMap<String, Usuario> usuariosSistema = null;
    private static Usuario usuarioValidado = null;
    
    
    
        
    public FrameLogin() {
        if (usuariosSistema == null){
        usuariosSistema = new HashMap<String, Usuario>();
        }
        
        initComponents();
    }
    
    public static void agregarUsuario (Usuario user) {
        FrameLogin.usuariosSistema.put(user.getNombreUsuario(), user);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        etiquetaNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        etiquetaDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        etiquetaUsuario2 = new javax.swing.JLabel();
        txtUsuario2 = new javax.swing.JTextField();
        etiquetaContraseña2 = new javax.swing.JLabel();
        btnIngresarUsuario = new javax.swing.JButton();
        txtContraseña2 = new javax.swing.JPasswordField();
        etiquetaUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();

        jDialog1.setTitle("Registro de Usuario");
        jDialog1.setBounds(new java.awt.Rectangle(450, 200, 0, 0));
        jDialog1.setLocation(new java.awt.Point(450, 200));
        jDialog1.setMinimumSize(new java.awt.Dimension(500, 390));
        jDialog1.setSize(new java.awt.Dimension(500, 390));

        etiquetaNombre.setText("Nombre");

        etiquetaApellido.setText("Apellido");

        etiquetaDocumento.setText("Documento");

        etiquetaUsuario2.setText("Usuario");

        etiquetaContraseña2.setText("Contraseña");

        btnIngresarUsuario.setText("Aceptar");
        btnIngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaApellido)
                    .addComponent(etiquetaDocumento)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaUsuario2)
                    .addComponent(etiquetaContraseña2)
                    .addComponent(txtUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtContraseña2))
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnIngresarUsuario)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaUsuario2))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellido)
                    .addComponent(etiquetaContraseña2))
                .addGap(29, 29, 29)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(etiquetaDocumento)
                .addGap(35, 35, 35)
                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(btnIngresarUsuario)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema gestor de pedidos");
        setBounds(new java.awt.Rectangle(450, 200, 0, 0));

        etiquetaUsuario.setText("Usuario");

        txtUsuario.setName(""); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        etiquetaContraseña.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.setName(""); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(etiquetaUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(etiquetaContraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(txtContraseña)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(etiquetaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoUsuario)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    String usuario = txtUsuario.getText();      
    usuarioValidado = usuariosSistema.get(usuario);                           

    if (!(usuarioValidado == null)){          
        char clave[]=txtContraseña.getPassword();
        String Contraseña = new String(clave);
              if(Contraseña.equals(usuarioValidado.obtenerContraseña())){              
                    JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                    + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);                 
                FrameSolicitudes.setUser(usuarioValidado);
                //  System.out.println(usuarioValidado.getNombreUsuario());
                FrameSolicitudes f = new FrameSolicitudes ();          
                f.setVisible(true); 
                this.dispose();
                }
   }else {
          JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
          + "Por favor ingrese un usuario y/o contraseña correctos",  
          "Acceso denegado", JOptionPane.ERROR_MESSAGE);         
    }
    
    
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        jDialog1.setVisible(true);
        jDialog1.setResizable(false);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnIngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuarioActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int documento = Integer.parseInt(txtDocumento.getText());
        String usuario = txtUsuario2.getText();
        char clave[] = txtContraseña2.getPassword();
        String contraseña = new String(clave);
        
        Usuario usuarioNuevo = new Usuario(nombre,apellido,documento,usuario,contraseña);   
      
        usuariosSistema.put(usuario, usuarioNuevo);
      
        jDialog1.dispose();
      
    }//GEN-LAST:event_btnIngresarUsuarioActionPerformed

   
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }
    
    
    // ZONA DE VARIABLES
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresarUsuario;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaContraseña2;
    private javax.swing.JLabel etiquetaDocumento;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel etiquetaUsuario2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario2;
    // End of variables declaration//GEN-END:variables

    

}


 
     

