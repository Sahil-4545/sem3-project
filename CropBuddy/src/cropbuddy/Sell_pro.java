package cropbuddy;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class Sell_pro extends javax.swing.JFrame {

    /**
     * Creates new form Sell_pro
     */
    public Sell_pro() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        jLabel15 = new javax.swing.JLabel();
        textField8 = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        category = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        product_name = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new java.awt.TextField();
        price_per_unit = new java.awt.TextField();
        product_description = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        price_unit = new javax.swing.JComboBox<>();
        unit = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        image = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel9.setText("SELL PRODUCT");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 300, 55));

        jLabel10.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel10.setText("quantity:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 70, 30));

        jLabel11.setFont(new java.awt.Font("The Bold Font", 0, 30)); // NOI18N
        jLabel11.setText("Enter product details");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 350, 50));

        jComboBox4.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select category--", "vegetable", "fruit", "seeds" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 240, 30));

        jLabel12.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel12.setText("Category");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 30));
        jPanel3.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 240, 30));

        jLabel13.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel13.setText("product description:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 170, 40));

        jLabel14.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel14.setText("product name:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, 30));

        textField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(textField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 240, 30));
        jPanel3.add(textField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 240, 30));

        jLabel15.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel15.setText("upload photo");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 130, 40));

        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });
        jPanel3.add(textField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 250, 110));

        jLabel16.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel16.setText("price per unit:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 130, 20));

        jComboBox5.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "gm", "ton", " " }));
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 70, 30));

        jComboBox6.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "gm", "ton", " " }));
        jPanel3.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 70, 30));

        jButton3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton3.setText("UPLOAD");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 130, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 250, -1));

        jButton4.setBackground(new java.awt.Color(0, 255, 153));
        jButton4.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jButton4.setText("SUBMIT");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 140, 60));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 1200));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("upload photo");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 80, 40));

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setFont(new java.awt.Font("Thunder", 1, 18)); // NOI18N
        upload.setForeground(new java.awt.Color(0, 0, 0));
        upload.setText("UPLOAD");
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
        });
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        kGradientPanel1.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 140, 40));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setForeground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 660, 250, -1));

        Submit.setBackground(new java.awt.Color(0, 255, 153));
        Submit.setFont(new java.awt.Font("Thunder", 1, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 0));
        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, 140, 50));

        category.setBackground(new java.awt.Color(255, 255, 255));
        category.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        category.setForeground(new java.awt.Color(0, 0, 0));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select category--", "vegetable", "fruit", "seeds" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        kGradientPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 240, 30));

        jLabel4.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Category");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 70, 30));

        product_name.setBackground(new java.awt.Color(255, 255, 255));
        product_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        product_name.setFont(new java.awt.Font("Source Sans Pro Black", 0, 20)); // NOI18N
        product_name.setForeground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.add(product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 240, 30));

        jLabel5.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("product description:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 120, 40));

        jLabel6.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("product name:");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 90, 30));

        quantity.setBackground(new java.awt.Color(255, 255, 255));
        quantity.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        quantity.setFont(new java.awt.Font("Source Sans Pro Black", 0, 20)); // NOI18N
        quantity.setForeground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 240, 30));

        price_per_unit.setBackground(new java.awt.Color(255, 255, 255));
        price_per_unit.setFont(new java.awt.Font("Source Sans Pro Black", 0, 20)); // NOI18N
        price_per_unit.setForeground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.add(price_per_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 240, 30));

        product_description.setBackground(new java.awt.Color(255, 255, 255));
        product_description.setFont(new java.awt.Font("Source Sans Pro Black", 0, 20)); // NOI18N
        product_description.setForeground(new java.awt.Color(0, 0, 0));
        product_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_descriptionActionPerformed(evt);
            }
        });
        kGradientPanel1.add(product_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 240, 30));

        jLabel8.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("price per unit:");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 80, 20));

        price_unit.setBackground(new java.awt.Color(255, 255, 255));
        price_unit.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        price_unit.setForeground(new java.awt.Color(0, 0, 0));
        price_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select unit--", "kg", "gm", "ton", " " }));
        kGradientPanel1.add(price_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 300, 120, 30));

        unit.setBackground(new java.awt.Color(255, 255, 255));
        unit.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        unit.setForeground(new java.awt.Color(0, 0, 0));
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select unit--", "kg", "gm", "ton", " " }));
        kGradientPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 250, -1, 30));

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("enter your product");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 390, 60));

        jLabel2.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sell product");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 250, 60));

        jLabel3.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("quantity");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(40, 40, 40));
        kGradientPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 200, 200));

        jScrollPane1.setViewportView(kGradientPanel1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 2000));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2000, 2000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void product_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_descriptionActionPerformed
    File f = null;
    String path = null;
    
    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("PNG JPG AND JPEG","jpg","png","jpeg");
        chooser.addChoosableFileFilter(fnf); 
        int load; //showOpenDialog() is used to open a dialog box.
        load = chooser.showOpenDialog(null);
        
        if(load == chooser.APPROVE_OPTION){
            f = chooser.getSelectedFile();
            path = f.getAbsolutePath();
            address.setText(path);
            ImageIcon i1 = new ImageIcon(path);
            Image img = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(img));
        }
       
     
    }//GEN-LAST:event_uploadMouseClicked
     
   
        
    
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Category,Product_name,Quantity,Unit,Price_per_unit,Price_unit,Product_description;
        String SUrl,SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
        SUser = "root";
        SPass = "1234567890";
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            PreparedStatement pst = con.prepareStatement("INSERT INTO product(category,pro_name,quatity,unit,price_per_unit,price_unit,pro_descrip,photo)VALUES(?,?,?,?,?,?,?,?)");
           if("--select category--".equals(category.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Category is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
               
           }else if("".equals(product_name.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Product Name is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(quantity.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Quantity is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("--select unit--".equals(unit.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(price_per_unit.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Price Per Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("--select unit--".equals(price_unit.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Price Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(product_description.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Product Description is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else{
               Category = category.getSelectedItem().toString();
               Product_name = product_name.getText();
               Quantity = quantity.getText();
               Unit = unit.getSelectedItem().toString();
               Price_per_unit = price_per_unit.getText();
               Price_unit = price_unit.getSelectedItem().toString();
               Product_description = product_description.getText();
               InputStream is = new FileInputStream(f);
               pst.setString(1, Category);
               pst.setString(2, Product_name);
               pst.setString(3, Quantity);
               pst.setString(4, Unit);
               pst.setString(5, Price_per_unit);
               pst.setString(6, Price_unit);
               pst.setString(7,  Product_description);
               pst.setBlob(8, is);
               
               category.setSelectedItem("--select category--");
               product_name.setText("");
               quantity.setText("");
               unit.setSelectedItem("--select unit--");
               price_per_unit.setText("");
               price_unit.setSelectedItem("--select unit--");
               product_description.setText("");
               image.setIcon(new ImageIcon());
               address.setText("");
               int inserted = pst.executeUpdate();
               if(inserted > 0){
                   JOptionPane.showMessageDialog(null, "Product Added Successfully!");
               }
           }
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadActionPerformed

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
            java.util.logging.Logger.getLogger(Sell_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sell_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sell_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Sell_pro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.TextField price_per_unit;
    private javax.swing.JComboBox<String> price_unit;
    private java.awt.TextField product_description;
    private java.awt.TextField product_name;
    private java.awt.TextField quantity;
    private java.awt.TextField textField4;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}