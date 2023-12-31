package view;

import connection.MySQLConnection;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.mindrot.BCrypt;

/**
 *
 * @author ZAFL
 */
public class FramePokedex extends javax.swing.JFrame {

  Connection conn;
  MySQLConnection connDB = new MySQLConnection();

  public FramePokedex() {
    initComponents();
    setLocationRelativeTo(null);

    menuPokedex.setEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    dialogLogin = new javax.swing.JDialog();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    tfUser = new javax.swing.JTextField();
    btnLogin = new javax.swing.JButton();
    tfPassword = new javax.swing.JPasswordField();
    jLabel1 = new javax.swing.JLabel();
    mainDesktopPane = new javax.swing.JDesktopPane();
    jMenuBar1 = new javax.swing.JMenuBar();
    menu = new javax.swing.JMenu();
    menuLogin = new javax.swing.JMenuItem();
    menuLogout = new javax.swing.JMenuItem();
    menuExit = new javax.swing.JMenuItem();
    menuPokedex = new javax.swing.JMenu();
    menuPokemon = new javax.swing.JMenuItem();

    dialogLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    dialogLogin.setMinimumSize(new java.awt.Dimension(440, 340));
    dialogLogin.setPreferredSize(new java.awt.Dimension(440, 340));

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel2.setText("Username");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setText("Password");

    tfUser.setText("admin");

    btnLogin.setText("Login");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    tfPassword.setText("admin");

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Login Pokédex");

    javax.swing.GroupLayout dialogLoginLayout = new javax.swing.GroupLayout(dialogLogin.getContentPane());
    dialogLogin.getContentPane().setLayout(dialogLoginLayout);
    dialogLoginLayout.setHorizontalGroup(
      dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(dialogLoginLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(dialogLoginLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnLogin)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(dialogLoginLayout.createSequentialGroup()
        .addGap(75, 75, 75)
        .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel3)
          .addComponent(jLabel2))
        .addGap(18, 18, 18)
        .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tfUser)
          .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(85, Short.MAX_VALUE))
    );
    dialogLoginLayout.setVerticalGroup(
      dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(dialogLoginLayout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addComponent(jLabel1)
        .addGap(51, 51, 51)
        .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(51, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(960, 540));

    javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
    mainDesktopPane.setLayout(mainDesktopPaneLayout);
    mainDesktopPaneLayout.setHorizontalGroup(
      mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 960, Short.MAX_VALUE)
    );
    mainDesktopPaneLayout.setVerticalGroup(
      mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 517, Short.MAX_VALUE)
    );

    menu.setText("Menu");

    menuLogin.setText("Login");
    menuLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuLoginActionPerformed(evt);
      }
    });
    menu.add(menuLogin);

    menuLogout.setText("Logout");
    menuLogout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuLogoutActionPerformed(evt);
      }
    });
    menu.add(menuLogout);

    menuExit.setText("Exit");
    menuExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuExitActionPerformed(evt);
      }
    });
    menu.add(menuExit);

    jMenuBar1.add(menu);

    menuPokedex.setText("Pokedex");

    menuPokemon.setText("Pokemon");
    menuPokemon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuPokemonActionPerformed(evt);
      }
    });
    menuPokedex.add(menuPokemon);

    jMenuBar1.add(menuPokedex);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainDesktopPane)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainDesktopPane)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPokemonActionPerformed
    FramePokemon frPokemon = new FramePokemon();
    addFrame(frPokemon);
  }//GEN-LAST:event_menuPokemonActionPerformed

  private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
    if (dialogLogin.isShowing()) {
      dialogLogin.dispose();
    } else {
      dialogLogin.setVisible(true);
      dialogLogin.setLocationRelativeTo(null);
    }
  }//GEN-LAST:event_menuLoginActionPerformed

  private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_menuLogoutActionPerformed

  private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
    System.exit(NORMAL);
  }//GEN-LAST:event_menuExitActionPerformed

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    String username = tfUser.getText();
    char[] password = tfPassword.getPassword();

    if (username.isEmpty()) {
      tfUser.requestFocus();
    } else if (password.length == 0) {
      tfPassword.requestFocus();
    } else {
      try {
        String query = "SELECT `nama`, `password` FROM `admin` WHERE `nama`=?";
        conn = connDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
          // String getNama = rs.getString("nama");
          if (BCrypt.checkpw(new String(password), rs.getString("password"))) {
            dialogLogin.setVisible(false);
            dialogLogin.dispose();
            menuPokedex.setEnabled(true);
            
            FramePokemon frPokemon = new FramePokemon();
            addFrame(frPokemon);
          } else {
            JOptionPane.showMessageDialog(rootPane, "Username atau Password salah!");
          }
        } else {
          JOptionPane.showMessageDialog(rootPane, "Username atau Password salah!");
        }
      } catch (SQLException ex) {
        System.out.println("Error in btnLogin: " + ex.getMessage());
      }
    }
  }//GEN-LAST:event_btnLoginActionPerformed

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
      java.util.logging.Logger.getLogger(FramePokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FramePokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FramePokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FramePokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FramePokedex().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.JDialog dialogLogin;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JMenuBar jMenuBar1;
  public javax.swing.JDesktopPane mainDesktopPane;
  private javax.swing.JMenu menu;
  private javax.swing.JMenuItem menuExit;
  private javax.swing.JMenuItem menuLogin;
  private javax.swing.JMenuItem menuLogout;
  public javax.swing.JMenu menuPokedex;
  private javax.swing.JMenuItem menuPokemon;
  private javax.swing.JPasswordField tfPassword;
  private javax.swing.JTextField tfUser;
  // End of variables declaration//GEN-END:variables

  private void addFrame(JInternalFrame internalFrame) {
    if (mainDesktopPane.getAllFrames().length > 0) {
      mainDesktopPane.remove(0);
    }
    mainDesktopPane.add(internalFrame);
    try {
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException pve) {
      System.err.println(pve.getMessage());
    }
    internalFrame.setVisible(true);
    internalFrame.toFront();
  }
}
