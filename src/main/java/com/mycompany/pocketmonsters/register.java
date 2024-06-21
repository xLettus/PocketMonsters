
package com.mycompany.pocketmonsters;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {

   private List<User> userList;
    
    public register(List<User> userList) {
        this.userList = userList;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(400, 535));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Repeat Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 300, -1));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("I have an account");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 20));

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\LOGIN,REGISTER,TTRAINER,REGIONS.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
         if (jRadioButton1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0); // Reveal the password
        } else {
            jPasswordField1.setEchoChar('\u2022'); // Hide the password, using the default bullet character
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         if (jRadioButton2.isSelected()) {
            jPasswordField2.setEchoChar((char) 0); // Reveal the password
        } else {
            jPasswordField2.setEchoChar('\u2022'); // Hide the password, using the default bullet character
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         login loginFrame = new login(userList);
         loginFrame.setVisible(true);

        // Dispose the current MainFrame
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // Retrieve the input from the text fields
        String username = jTextField1.getText().trim();
        char[] password1 = jPasswordField1.getPassword();
        char[] password2 = jPasswordField2.getPassword();

        // Convert char arrays to strings
        String passwordStr1 = new String(password1);
        String passwordStr2 = new String(password2);

        // Validate the inputs
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        if (passwordStr1.isEmpty() || passwordStr2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        if (!passwordStr1.equals(passwordStr2)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        try {
        User newUser = new User(username, passwordStr1); // Create new User object
         userList.add(newUser); // Add user to userList
        
        JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Optionally, proceed to another frame or action after registration
        menu menuFrame = new menu(userList);
        menuFrame.setVisible(true);
        this.dispose(); // Close the current frame
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Registration Failed", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print stack trace for debugging
    }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        List<User> userList = new ArrayList<>();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register(userList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
