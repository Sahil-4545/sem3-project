package cropbuddy;

import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class search_product extends javax.swing.JFrame {
    
    public search_product() {
        initComponents();
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
    }    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public class func{
        public ResultSet find(String s) throws SQLException{
            try {
                 String SUrl,SUser,SPass;
                SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
                SUser = "root";
                SPass = "1234567890";
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(SUrl,SUser,SPass);
                pst = con.prepareStatement("select * from product where pro_name = ?");
                pst.setString(1, s);
                rs = pst.executeQuery();
            } catch (ClassNotFoundException ex) { 
                Logger.getLogger(search_product.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
            
        }
    }

       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        vegetablebtn = new javax.swing.JLabel();
        fruitsbtn = new javax.swing.JLabel();
        seedsbtn = new javax.swing.JLabel();
        pestbtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fertilizerbtn1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fertilizerbtn2 = new javax.swing.JLabel();
        search_pro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        display_product = new javax.swing.JLabel();
        product = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        price_unit = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        prodescrip = new javax.swing.JTextField();
        qunatity = new javax.swing.JTextField();
        priceunit = new javax.swing.JTextField();
        buy = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vegetablebtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        vegetablebtn.setForeground(new java.awt.Color(0, 0, 0));
        vegetablebtn.setText("SEARCH  |");
        vegetablebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vegetablebtnMouseClicked(evt);
            }
        });
        jPanel2.add(vegetablebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        fruitsbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        fruitsbtn.setForeground(new java.awt.Color(0, 0, 0));
        fruitsbtn.setText("VEGETABLES  |");
        fruitsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitsbtnMouseClicked(evt);
            }
        });
        jPanel2.add(fruitsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        seedsbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        seedsbtn.setForeground(new java.awt.Color(0, 0, 0));
        seedsbtn.setText("FRUITS  |");
        seedsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seedsbtnMouseClicked(evt);
            }
        });
        jPanel2.add(seedsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        pestbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        pestbtn.setForeground(new java.awt.Color(0, 0, 0));
        pestbtn.setText("SEEDS   |");
        pestbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pestbtnMouseClicked(evt);
            }
        });
        jPanel2.add(pestbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("HOME  |");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 110, -1, -1));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Thunder", 0, 24)); // NOI18N
        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setText("Search For Products");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 687, 42));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search icon.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, 90));

        fertilizerbtn1.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        fertilizerbtn1.setForeground(new java.awt.Color(0, 0, 0));
        fertilizerbtn1.setText(" FERTILIZERS    |");
        fertilizerbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fertilizerbtn1MouseClicked(evt);
            }
        });
        jPanel2.add(fertilizerbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 10, -1));

        fertilizerbtn2.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        fertilizerbtn2.setForeground(new java.awt.Color(0, 0, 0));
        fertilizerbtn2.setText("PESTICIDES    |");
        fertilizerbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fertilizerbtn2MouseClicked(evt);
            }
        });
        jPanel2.add(fertilizerbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        search_pro.setBackground(new java.awt.Color(255, 255, 255));
        search_pro.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        search_pro.setForeground(new java.awt.Color(0, 0, 0));
        search_pro.setText("Search");
        search_pro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        search_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_proActionPerformed(evt);
            }
        });
        search_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_proKeyPressed(evt);
            }
        });
        jPanel2.add(search_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 150));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1150, 400));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product.setBackground(new java.awt.Color(204, 255, 255));
        display_product.setOpaque(true);
        jPanel4.add(display_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 350));

        product.setEditable(false);
        product.setBackground(new java.awt.Color(204, 255, 255));
        product.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product.setForeground(new java.awt.Color(0, 0, 0));
        product.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product.setBorder(null);
        product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 240, 40));

        number.setEditable(false);
        number.setBackground(new java.awt.Color(204, 255, 255));
        number.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 0));
        number.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number.setBorder(null);
        number.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 50, 40));

        price.setEditable(false);
        price.setBackground(new java.awt.Color(204, 255, 255));
        price.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price.setBorder(null);
        price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel4.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 40, 40));

        price_unit.setEditable(false);
        price_unit.setBackground(new java.awt.Color(204, 255, 255));
        price_unit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit.setForeground(new java.awt.Color(0, 0, 0));
        price_unit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit.setBorder(null);
        price_unit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unitActionPerformed(evt);
            }
        });
        jPanel4.add(price_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 40, 40));

        unit.setEditable(false);
        unit.setBackground(new java.awt.Color(204, 255, 255));
        unit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit.setForeground(new java.awt.Color(0, 0, 0));
        unit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit.setBorder(null);
        unit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        jPanel4.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 50, 40));

        prodescrip.setEditable(false);
        prodescrip.setBackground(new java.awt.Color(204, 255, 255));
        prodescrip.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip.setBorder(null);
        prodescrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(prodescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 220, 40));

        qunatity.setEditable(false);
        qunatity.setBackground(new java.awt.Color(204, 255, 255));
        qunatity.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity.setForeground(new java.awt.Color(0, 0, 0));
        qunatity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity.setBorder(null);
        qunatity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(qunatity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, 40));

        priceunit.setEditable(false);
        priceunit.setBackground(new java.awt.Color(204, 255, 255));
        priceunit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit.setForeground(new java.awt.Color(0, 0, 0));
        priceunit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit.setBorder(null);
        priceunit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(priceunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 160, 40));

        buy.setEditable(false);
        buy.setBackground(new java.awt.Color(204, 255, 255));
        buy.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        buy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buy.setBorder(null);
        buy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 90, 50));

        jScrollPane2.setBackground(new java.awt.Color(204, 255, 255));

        description.setBackground(new java.awt.Color(204, 255, 255));
        description.setColumns(20);
        description.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description.setRows(5);
        description.setBorder(null);
        description.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(description);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 310, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1130, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fertilizerbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertilizerbtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fertilizerbtn2MouseClicked

    private void fertilizerbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertilizerbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fertilizerbtn1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Dasboard DB = new Dasboard();
        DB.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pestbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestbtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pestbtnMouseClicked

    private void seedsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedsbtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_seedsbtnMouseClicked

    private void fruitsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsbtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fruitsbtnMouseClicked

    private void vegetablebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablebtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_vegetablebtnMouseClicked

    private void search_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_proActionPerformed
        // TODO add your handling code here:
        
        try {
            String Quantity,Price_per_unit,Product_description;
            Quantity = "Quantity :";
            Price_per_unit = "Price Per Unit :";
            Product_description = "Product Description :";
            
            search_product.func f = new search_product.func();
            rs = f.find(search.getText());
            if(rs.next()){
                byte[] img = rs.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                display_product.setIcon(newImage);
                product.setText("Product Name :" + search.getText());
                number.setText(rs.getString(  "quatity"));
                unit.setText(rs.getString("unit"));
                price.setText(rs.getString( "price_per_unit"));
                price_unit.setText(rs.getString("price_unit"));
               description.setText(rs.getString( "pro_descrip"));
               qunatity.setText(Quantity);
               priceunit.setText(Price_per_unit);
               prodescrip.setText(Product_description);
               buy.setText("BUY");
            }else{
                JOptionPane.showMessageDialog(null, "Product Not Found!");
            }
        }catch (SQLException ex) { 
                Logger.getLogger(search_product.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }//GEN-LAST:event_search_proActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void price_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unitActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void search_proKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_proKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_proKeyPressed

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        // TODO add your handling code here:
        if(search.getText().equals("Search For Products")){
            search.setText("");
            search.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_searchFocusGained

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        // TODO add your handling code here:
         if(search.getText().equals("")){
            search.setText("Search For Products");
            search.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_searchFocusLost

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
            java.util.logging.Logger.getLogger(search_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buy;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel display_product;
    private javax.swing.JLabel fertilizerbtn1;
    private javax.swing.JLabel fertilizerbtn2;
    private javax.swing.JLabel fruitsbtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField number;
    private javax.swing.JLabel pestbtn;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price_unit;
    private javax.swing.JTextField priceunit;
    private javax.swing.JTextField prodescrip;
    private javax.swing.JTextField product;
    private javax.swing.JTextField qunatity;
    private javax.swing.JTextField search;
    private javax.swing.JButton search_pro;
    private javax.swing.JLabel seedsbtn;
    private javax.swing.JTextField unit;
    private javax.swing.JLabel vegetablebtn;
    // End of variables declaration//GEN-END:variables
}
