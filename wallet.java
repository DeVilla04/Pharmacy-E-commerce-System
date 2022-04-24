/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs262Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author anilaswani
 */
public class wallet extends javax.swing.JFrame {

    /**
     * Creates new form wallet
     */
    public wallet() {
        initComponents();
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
        myOrdersButton = new javax.swing.JButton();
        walletButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        editUname = new javax.swing.JTextField();
        showBalanceButton = new javax.swing.JButton();
        amountLabel = new javax.swing.JLabel();
        addMoneyButton = new javax.swing.JButton();
        withdrawMoneyButton = new javax.swing.JButton();
        amountTF = new javax.swing.JTextField();
        editPassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        myOrdersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs262project/order.png"))); // NOI18N
        myOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersButtonActionPerformed(evt);
            }
        });

        walletButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs262project/wallet.png"))); // NOI18N

        placeOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs262project/shopping-bag.png"))); // NOI18N
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(walletButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(walletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WALLET");

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs262project/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(logoutButton))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        editUname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editUname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "USERNAME"));

        showBalanceButton.setText("SHOW BALANCE");
        showBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBalanceButtonActionPerformed(evt);
            }
        });

        amountLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("Rs. 0");
        amountLabel.setBorder(new javax.swing.border.MatteBorder(null));

        addMoneyButton.setText("ADD MONEY");
        addMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoneyButtonActionPerformed(evt);
            }
        });

        withdrawMoneyButton.setText("WITHDRAW MONEY");
        withdrawMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawMoneyButtonActionPerformed(evt);
            }
        });

        amountTF.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        amountTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        editPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        editPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Password"));
        editPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addMoneyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showBalanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawMoneyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(editUname, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountTF)
                    .addComponent(editPassword))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editUname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showBalanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(addMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(withdrawMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(amountTF))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs262project/man (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        placeOrder t1 = new placeOrder();
        t1.setVisible(true);
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void myOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        myOrders t1 = new myOrders();
        t1.setVisible(true);
    }//GEN-LAST:event_myOrdersButtonActionPerformed

    private void showBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBalanceButtonActionPerformed
        // TODO add your handling code here:
        amountLabel.setText("Rs. 0");
        if (editUname.getText().isEmpty() || editPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Enter USERNAME and PASSWORD both.");
        } else {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?verifyServerCertificate=false&useSSL=true", "root", "#Av2002Gs");
                Statement st = con.createStatement();

                String username = editUname.getText();
                String password = editPassword.getText();
                boolean exist;

                PreparedStatement ps = con.prepareStatement("select Username, Password from pharmacy.customer where Username = ? and Password = ?;");
                ps.setString(1, username);
                ps.setString(2, password);

                try (ResultSet resultSet = ps.executeQuery()) {
                    exist = resultSet.next();
                }

                if (exist) {
                    String sql = "select Wallet from pharmacy.customer where Username = '" + username + "' and Password = '" + password + "';";
                    ResultSet rs2 = st.executeQuery(sql);
                    rs2.next();
                    amountLabel.setText(String.valueOf(rs2.getInt("Wallet")));

                } else {
                    JOptionPane.showMessageDialog(this, "USERNAME OR PASSWORD IS WRONG!!");
                    editUname.setText("");
                    editPassword.setText("");
                }
                con.close();

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }//GEN-LAST:event_showBalanceButtonActionPerformed

    private void editPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPasswordActionPerformed

    private void addMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoneyButtonActionPerformed
        // TODO add your handling code here:

        if (editUname.getText().isEmpty() || editPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Enter USERNAME and PASSWORD both, then Amount.");
        } else {
            if (amountTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Enter Your Amount");
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?verifyServerCertificate=false&useSSL=true", "root", "#Av2002Gs");

                    String username = editUname.getText();
                    String password = editPassword.getText();
                    int amount = Integer.parseInt(amountTF.getText());

                    boolean exist;

                    PreparedStatement ps = con.prepareStatement("select Username, Password from pharmacy.customer where Username = ? and Password = ?;");
                    ps.setString(1, username);
                    ps.setString(2, password);

                    try (ResultSet resultSet = ps.executeQuery()) {
                        exist = resultSet.next();
                    }

                    if (exist) {
                        Statement stm = con.createStatement();

                        String sql = "select Wallet from pharmacy.customer where Username = '" + username + "' and Password = '" + password + "';";
                        ResultSet rs = stm.executeQuery(sql);
                        rs.next();
                        amountLabel.setText(String.valueOf(rs.getInt("Wallet")));

                        int currentAmount = Integer.parseInt(amountLabel.getText());
                        int updatedAmount = (amount + currentAmount);

                        //amountLabel.setText(String.valueOf(updatedAmount));
                        String query = "UPDATE pharmacy.customer SET Wallet = " + updatedAmount + " where Username = '" + username + "' and Password = '" + password + "';";
                        PreparedStatement ps2 = con.prepareStatement(query);

                        ps2.execute();
                        amountTF.setText("");
                        JOptionPane.showMessageDialog(this, "Added " + amount + " Rs. to the wallet.");

                    } else {
                        JOptionPane.showMessageDialog(this, "USERNAME OR PASSWORD IS WRONG!!");
                    }

                    con.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }


    }//GEN-LAST:event_addMoneyButtonActionPerformed

    private void withdrawMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawMoneyButtonActionPerformed
        // TODO add your handling code here:

        int count = 0;
        if (editUname.getText().isEmpty() || editPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Enter USERNAME and PASSWORD both, then Amount.");
        } else {
            if (amountTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Enter Your Amount");
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?verifyServerCertificate=false&useSSL=true", "root", "#Av2002Gs");

                    String username = editUname.getText();
                    String password = editPassword.getText();
                    int amount = Integer.parseInt(amountTF.getText());

                    boolean exist;

                    PreparedStatement ps = con.prepareStatement("select Username, Password from pharmacy.customer where Username = ? and Password = ?;");
                    ps.setString(1, username);
                    ps.setString(2, password);

                    try (ResultSet resultSet = ps.executeQuery()) {
                        exist = resultSet.next();
                    }

                    if (exist) {
                        Statement stm = con.createStatement();

                        String sql = "select Wallet from pharmacy.customer where Username = '" + username + "' and Password = '" + password + "';";
                        ResultSet rs = stm.executeQuery(sql);

                        rs.next();
                        amountLabel.setText(String.valueOf(rs.getInt("Wallet")));

                        int currentAmount = Integer.parseInt(amountLabel.getText());
                        int updatedAmount = (currentAmount - amount);

                        if (updatedAmount < 0) {
                           
                            updatedAmount = currentAmount;
                            JOptionPane.showMessageDialog(this, "You have only " + currentAmount + " Rs. in your  wallet.");
                        } else {
                            
                            String query = "UPDATE pharmacy.customer SET Wallet = " + updatedAmount + " where Username = '" + username + "' and Password = '" + password + "';";
                            PreparedStatement ps2 = con.prepareStatement(query);
                            //amountLabel.setText(String.valueOf(updatedAmount));

                            ps2.execute();
                            amountTF.setText("");
                            JOptionPane.showMessageDialog(this, "Withdrawn " + amount + " Rs. from the wallet.");

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "USERNAME OR PASSWORD IS WRONG!!");
                    }

                    con.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }
    }//GEN-LAST:event_withdrawMoneyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMoneyButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTF;
    private javax.swing.JPasswordField editPassword;
    private javax.swing.JTextField editUname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myOrdersButton;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JButton showBalanceButton;
    private javax.swing.JButton walletButton;
    private javax.swing.JButton withdrawMoneyButton;
    // End of variables declaration//GEN-END:variables
}
