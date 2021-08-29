/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_desktop;

import br.edu.ifnmg.logicaAplicacao.Usuario;
import br.edu.ifnmg.logicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.awt.Frame;
import javax.persistence.NoResultException;

/**
 *
 * @author gabriel
 */
public class Login extends javax.swing.JFrame {
    UsuarioRepositorio usuarioRepositorio;

    /**
     * Creates new form Login
     */
    public Login() {
        usuarioRepositorio = RepositorioFactory.getUsuarioRepositorio();
        initComponents();
        //Centralizando a tela        
        this.setLocationRelativeTo(null);
        this.setTitle("LOGIN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        psswdSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(96, 16, 16));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 510, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 520));

        jPanel3.setBackground(new java.awt.Color(244, 188, 188));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 30, 30)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 37));

        lblEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(62, 14, 14));
        lblEmail.setText("Email");
        jPanel3.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        lblSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(62, 14, 14));
        lblSenha.setText("Senha");
        jPanel3.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 59, 59));
        jLabel3.setText("LOGIN");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        psswdSenha.setBackground(new java.awt.Color(255, 255, 255));
        psswdSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        psswdSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 30, 30)));
        psswdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswdSenhaActionPerformed(evt);
            }
        });
        psswdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psswdSenhaKeyPressed(evt);
            }
        });
        jPanel3.add(psswdSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 290, 35));

        jButton1.setBackground(new java.awt.Color(102, 16, 16));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 134, 33));

        lblError.setBackground(new java.awt.Color(160, 63, 65));
        lblError.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 63, 65));
        jPanel3.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 455, -1, -1));

        jLabel2.setBackground(new java.awt.Color(160, 63, 65));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 400, 519));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed

    }//GEN-LAST:event_jPanel3KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.logar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void psswdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psswdSenhaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            this.logar();
        }
    }//GEN-LAST:event_psswdSenhaKeyPressed

    private void psswdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswdSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psswdSenhaActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            psswdSenha.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void logar(){
        Usuario user;
        
        try{
            user = usuarioRepositorio.Autenticar(txtEmail.getText(), String.valueOf(psswdSenha.getPassword()));
        }catch(NoResultException ex){
            user = null;
        }
        
        if(user != null){
            TelaPrincipal telaPrincipal = new TelaPrincipal(user);
            this.setVisible(false);
            telaPrincipal.setVisible(true);
        }else{
            psswdSenha.selectAll();
            lblError.setText("Usuário e/ou senha inválidos!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField psswdSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
