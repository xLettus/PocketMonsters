
package com.mycompany.pocketmonsters;

import javax.swing.ImageIcon;
import java.util.List;
import java.util.ArrayList;

public class Certificate extends javax.swing.JFrame {
     
    private String username;
    private String selectedPokemon;
    private String selectedTrainerType;
    private List<User> userList;

    public Certificate(String username, String selectedPokemon, String selectedTrainerType, List<User> userList) {
        this.username = username;
        this.selectedPokemon = selectedPokemon;
        this.selectedTrainerType = selectedTrainerType;
        this.userList = userList;
        initComponents();
        updateCertificate(username, selectedPokemon, selectedTrainerType);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 110));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 130, 130));

        jTextField1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 370, -1));

        jTextField2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 370, -1));

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\Pokeball(logout, back button).gif")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\Certificate.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       trainer trainerFrame = new trainer(username, userList);
        trainerFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

     private void updateCertificate(String username, String selectedPokemon, String selectedTrainerType) {
        jTextField1.setText(selectedTrainerType);
        jTextField2.setText("Trainer " + username);

        String pokemonImagePath = "";
        switch (selectedPokemon) {
            case "bulbasaur":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\bulba.gif";
                break;
            case "charmander":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\charmander.gif";
                break;
            case "squirtle":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\squirtle.gif";
                break;
            case "giratina":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\giratina.gif";
                break;
            case "zekrom":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\zekrom.gif";
                break;
            case "darkrai":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\darkrai.gif";
                break;
            case "death":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\death.gif";
                break;
            case "kyogre":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\kyogre.gif";
                break;
            case "steel":
                pokemonImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\steel.gif";
                break;
        }
        jLabel1.setIcon(new ImageIcon(pokemonImagePath));

        String trainerImagePath = ""; 
            switch (selectedTrainerType) {
            case "maleorani":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\orani male.gif";
                break;
            case "femaleorani":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\orani female.gif";
                break;
            case "femalemariveles":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\mari female.gif";
                break;
            case "malemariveles":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\mari male.gif";
                break;
            case "malebalanga":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\balanga male.gif";
                break;
            case "femalebalanga":
                trainerImagePath = "C:\\Users\\admin\\Downloads\\Pocket-Monsters-OUTPUT\\assets\\balanga female.gif";
                break;
                   
                  
    }
            jLabel2.setIcon(new ImageIcon(trainerImagePath));
     }
    
    public static void main(String args[]) {
         List<User> userList = new ArrayList<>();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Certificate("UsernamePlaceholder", "bulbasaur", "male", userList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
