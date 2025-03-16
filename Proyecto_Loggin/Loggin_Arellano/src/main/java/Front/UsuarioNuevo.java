/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import Back.Backend;
import Back.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class UsuarioNuevo extends javax.swing.JFrame {

   
    /**
     * Creates new form Login
     */
    public UsuarioNuevo() {
        initComponents();
        this.setTitle("Nuevo usuario");
         this.setResizable(false); // Evita que la ventana se pueda redimensionar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreUsuario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contra = new javax.swing.JPasswordField();
        ConfirmaContra = new javax.swing.JPasswordField();
        agregar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(71, 100, 104));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreUsuario.setFont(new java.awt.Font("Segoe UI Black", 2, 22)); // NOI18N
        NombreUsuario.setBorder(null);
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(71, 100, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Confirmar contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        Contra.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        Contra.setBorder(null);
        Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraActionPerformed(evt);
            }
        });
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 30));

        ConfirmaContra.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        ConfirmaContra.setBorder(null);
        ConfirmaContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaContraActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 220, 30));

        agregar.setBackground(new java.awt.Color(0, 204, 0));
        agregar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        agregar.setText("Registrarse");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void ConfirmaContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmaContraActionPerformed

    private void ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
// Verificar que no haya campos vacíos
    if (NombreUsuario.getText().isEmpty() || Contra.getText().isEmpty() || ConfirmaContra.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si hay campos vacíos
    }

    // Validar nombre
    if (!isValidName(NombreUsuario.getText())) {
        JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras y espacios.", "Error", JOptionPane.WARNING_MESSAGE);
        NombreUsuario.setText(""); // Limpiar el campo del nombre
        return; // Salir del método si el nombre no es válido
    }

    // Comprobar que las contraseñas coinciden
    if (!Contra.getText().equals(ConfirmaContra.getText())) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.WARNING_MESSAGE);
        ConfirmaContra.setText(""); // Limpiar la confirmación de contraseña
        return; // Salir del método si las contraseñas no coinciden
    }
    Backend back = new Backend();   Usuario usuario = new Usuario(NombreUsuario.getText(), Contra.getText());
    back.crearUsuario(usuario);
    LogginPantalla loggin = new LogginPantalla();
    loggin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        LogginPantalla v = new LogginPantalla();
        v.setVisible(true);
        dispose();

    }//GEN-LAST:event_salirActionPerformed
// Validar nombre
private boolean isValidName(String name) {
    String nameRegex = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";
    return name != null && name.matches(nameRegex);
}

// Validar contraseña
private boolean isValidPassword(String password) {
    String passwordRegex = "^[a-zA-Z0-9]{6,}$";
    return password != null && password.matches(passwordRegex);
}

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new UsuarioNuevo().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmaContra;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
