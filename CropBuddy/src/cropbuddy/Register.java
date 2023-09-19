package cropbuddy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author sdewr
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        m = new javax.swing.JLabel();
        mobileno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Signup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Create Account ");
        jLabel1.setPreferredSize(new java.awt.Dimension(81, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 305, 48));

        jLabel2.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Enter Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 112, 30));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 112, 31));

        jLabel3.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Enter Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 94, 24));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 174, 34));

        m.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        m.setForeground(new java.awt.Color(153, 255, 153));
        m.setText("Enter Mobile No");
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, -1));

        mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilenoActionPerformed(evt);
            }
        });
        jPanel1.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 117, 31));

        jLabel6.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("Enter Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 97, 20));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 120, 30));

        Signup.setBackground(new java.awt.Color(153, 255, 153));
        Signup.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        Signup.setText("Register");
        Signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 95, 34));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 93, 34));

        jLabel8.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("Already Have Account ?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 145, 28));

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jButton3.setText("Login");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 439, 60, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilenoActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        //System.out.println("Sign up Successfull");
        String Username,Email,Password,mobile_no,query;
        String SUrl,SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/user_databse";
        SUser = "root";
        SPass = "1234567890";
        
        try{
           Class.forName("com.mysql.jdbc.Driver"); 
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
           Statement st = con.createStatement();
           if("".equals(username.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
               
           }else  if("".equals(mobileno.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Mobile no is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(email.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(password.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else {
               Username = username.getText();
               mobile_no = mobileno.getText();
               Email = email.getText();
               Password = password.getText();
               System.out.println(Password);
               query = "INSERT INTO user(username,mobileno,email,password)"+
                       "VALUES('"+Username+"', '"+mobile_no+"' , '"+Email+"' , '"+Password+"')";
                st.execute(query);
                username.setText("");
                mobileno.setText("");
                email.setText("");
                password.setText("");
                showMessageDialog(null, "New account has been created successfully!");
                Dasboard dash = new Dasboard();
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
                this.dispose();
           }
               
           }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_SignupActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel m;
    private javax.swing.JTextField mobileno;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
