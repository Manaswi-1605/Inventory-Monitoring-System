package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

import java.text.SimpleDateFormat;
import java.util.Date;

// Welcome page for the application
public class HomePage extends javax.swing.JPanel {

    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel timeLabel;

    public HomePage(String username) {
        initComponents();

        // Fetch user full name
        UserDTO userDTO = new UserDTO();
        new UserDAO().getFullName(userDTO, username);

        // Greeting logic
        int hour = java.time.LocalTime.now().getHour();
        String greeting;

        if (hour < 12) {
            greeting = "Good Morning";
        } else if (hour < 17) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }

        // Set welcome text
        welcomeLabel.setText(greeting + ", " + userDTO.getFullName() + " 👋");

        // Date & Time
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = sdf.format(new Date());
        timeLabel.setText("Date & Time: " + currentTime);

        // Styling
        this.setBackground(new java.awt.Color(30, 30, 40));
        welcomeLabel.setForeground(java.awt.Color.CYAN);
        jLabel1.setForeground(java.awt.Color.LIGHT_GRAY);
        timeLabel.setForeground(java.awt.Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        // Welcome Label
        welcomeLabel.setFont(new java.awt.Font("Impact", 0, 36));
        welcomeLabel.setText("Welcome");

        // Description Label
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>"
                + "<h2>Smart Inventory Dashboard</h2>"
                + "Manage products, customers, and transactions easily.<br><br>"
                + "Click on the Menu to begin 🚀"
                + "</center></html>");

        // Time Label
        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeLabel.setText("Date & Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20)
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(200, Short.MAX_VALUE))
        );
    }
}
