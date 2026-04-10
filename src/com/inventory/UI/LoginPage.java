package com.inventory.UI;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.inventory.DTO.UserDTO;
import com.inventory.Database.ConnectionFactory;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {

    UserDTO userDTO;
    LocalDateTime inTime;

    public LoginPage() {
        initComponents();
        userDTO = new UserDTO();

        // Background
        getContentPane().setBackground(new java.awt.Color(25, 30, 45));

        // Title styling
        jLabel3.setText("Smart Inventory System");
        jLabel3.setForeground(new java.awt.Color(0, 200, 255));

        // Label colors
        jLabel1.setForeground(java.awt.Color.LIGHT_GRAY);
        jLabel2.setForeground(java.awt.Color.LIGHT_GRAY);

        // Text fields style
        userText.setBackground(new java.awt.Color(40, 45, 60));
        userText.setForeground(java.awt.Color.WHITE);

        passText.setBackground(new java.awt.Color(40, 45, 60));
        passText.setForeground(java.awt.Color.WHITE);

        // Buttons style
        loginButton.setBackground(new java.awt.Color(0, 120, 215));
        loginButton.setForeground(java.awt.Color.WHITE);
        loginButton.setFocusPainted(false);

        clearButton.setBackground(new java.awt.Color(200, 50, 50));
        clearButton.setForeground(java.awt.Color.WHITE);
        clearButton.setFocusPainted(false);

        // Hover effects
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new java.awt.Color(0,150,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new java.awt.Color(0,120,215));
            }
        });

        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButton.setBackground(new java.awt.Color(255,80,80));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButton.setBackground(new java.awt.Color(200,50,50));
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(500, 100, 400, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 26));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Smart Inventory System");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "EMPLOYEE" }));

        loginButton.setText("LOGIN");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(evt -> loginButtonActionPerformed(evt));

        clearButton.setText("CLEAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(evt -> clearButtonActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGap(20)
                        .addComponent(jLabel3)
                        .addGap(30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private String encryptPass(String pass){
        String encPass = null;
        if(pass == null) return null;

        try{
            MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(pass.getBytes(), 0, pass.length());
            encPass = new BigInteger(1, mDigest.digest()).toString(16);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return encPass;
    }

    String userType;

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = userText.getText();
        String password = passText.getText();
        userType = (String)jComboBox1.getSelectedItem();

        if (new ConnectionFactory().checkLogin(username, password, userType)){
            inTime = LocalDateTime.now();
            userDTO.setInTime(String.valueOf(inTime));
            dispose();
            new Dashboard(username, userType, userDTO);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
        }
    }

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        userText.setText("");
        passText.setText("");
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        } catch (Exception ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
}
