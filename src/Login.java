 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jusss
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
Connection conn = null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enteredUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enteredPassword = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        selectedType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(227, 193, 55));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Password:");

        enteredUsername.setHighlighter(null);
        enteredUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enteredUsernameActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username :");

        enteredPassword.setHighlighter(null);

        LoginButton.setBackground(new java.awt.Color(0, 153, 0));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Log in");
        LoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        selectedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super Admin", "Admin", "Cashier" }));
        selectedType.setFocusable(false);
        selectedType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTypeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Type :");

        jPanel2.setBackground(new java.awt.Color(81, 154, 52));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MICMIC COLORS PAINT CENTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(enteredPassword)
                    .addComponent(enteredUsername)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(selectedType, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enteredUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enteredPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // kukunin yung inenter ng user sa gui and maiistored from new variables
        String username = enteredUsername.getText();                
        String password = enteredPassword.getText();
        String type = selectedType.getSelectedItem().toString();
        
        // ichecheck kung may laman yung username and password at kung wala uulit sa gui with error message
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter username and password!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // connecting from mysql workbench database to java
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            
            // ipapasa sa Prepared statement yung commandat pwede mo na i-modify yung laman ng isang particular table
            // use key word <connection variable name>.  prepareStatement
            // Command: SELECT ALL FROM users (which is our tables in our database) WHERE username(is our column) = ? (and it has no specific value)
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
            
            // in this case, yung i ay nag rerepresent ng number sa kung ilang column ang tinawag mo sa prepared statement at yung string naman yung ipapasa nating valur sa username
            // use key word setString
            // Command: 1 (which is our username column), username (sinet nating value ng username, which is yung ineneter ng user sa gui
            pst.setString(1, username);
            
            //dito naman maexecute ang ginawang command from out database from pst then ma i istored ito sa rs which is our ResultSet
            ResultSet rs  = pst.executeQuery();
            
            // the result of the executed command will check if there are at least 1 row who has the same as data as what we have in our rs
            if (rs.next()) { // pag may kaparehong data you can use and modify and its own specifici info.
                String dbPassword = rs.getString("password"); // getting password column in our database and stored it into new variable
                String userType = rs.getString("type");       // getting type column in our database and stored it into new variable
                if (password.equals(dbPassword)) { // checking if the password is equal on what we have on password column in database. pag equal proceed
                    if (type.equals(userType)) { // checking kung tama ang type na pinili nya based on the type column data sa the database 
                        if ("Admin".equals(userType)) { // kapag tama and admin sya, mapupunta to sa Admin gui
                        dispose();
                        AdminGUI agui = new AdminGUI();
                        agui.setVisible(true);    
                        }
                        else if("Cashier".equals(userType)){ // kapag tama and cashier sya, mapupunta ito sa Cashier gui
                        dispose();
                        GUI gui = new GUI();
                        gui.setVisible(true);
                        }
                    }
                    else{ // else for type mismatch
                    JOptionPane.showMessageDialog(null, "User type selected does not match!", "Error", JOptionPane.ERROR_MESSAGE);
                    }    
                }
                else { // else for password mismatch
                JOptionPane.showMessageDialog(null, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else { //else for username mismatch and wala ito sa naka stored na data from database
            JOptionPane.showMessageDialog(null, "Incorrect username", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void selectedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedTypeActionPerformed

    private void enteredUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enteredUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enteredUsernameActionPerformed

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
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField enteredPassword;
    private javax.swing.JTextField enteredUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> selectedType;
    // End of variables declaration//GEN-END:variables
}
