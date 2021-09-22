import java.sql.*;
public class Registerparentview extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";
    public Registerparentview() {
        initComponents();
    }
                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rbtnParent = new javax.swing.JRadioButton();
        rbtnTeacher = new javax.swing.JRadioButton();
        lblpname = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        txtpname = new javax.swing.JTextField();
        lblloginpage = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblemaill = new javax.swing.JLabel();
        lblphonenumber = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtphonenumber = new javax.swing.JTextField();
        lblstudentname = new javax.swing.JLabel();
        txtstudentname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));

        rbtnParent.setForeground(new java.awt.Color(153, 153, 153));
        rbtnParent.setText("Parent");
        rbtnParent.setSelected(true);
        rbtnParent.setOpaque(false);

        rbtnTeacher.setForeground(new java.awt.Color(153, 153, 153));
        rbtnTeacher.setText("Teacher");
        rbtnTeacher.setOpaque(false);
        rbtnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTeacherActionPerformed(evt);
            }
        });

        lblpname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblpname.setForeground(new java.awt.Color(204, 204, 204));
        lblpname.setText("Parent Name:");

        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblusername.setForeground(new java.awt.Color(204, 204, 204));
        lblusername.setText("Username:");

        lblpassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblpassword.setForeground(new java.awt.Color(204, 204, 204));
        lblpassword.setText("Password:");

        txtusername.setBackground(new java.awt.Color(31, 35, 41));
        txtusername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtusername.setForeground(new java.awt.Color(153, 153, 153));

        btnregister.setBackground(new java.awt.Color(0, 102, 102));
        btnregister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        btnregister.setText("Register");
        btnregister.setBorderPainted(false);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        txtpname.setBackground(new java.awt.Color(31, 35, 41));
        txtpname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtpname.setForeground(new java.awt.Color(204, 204, 204));

        lblloginpage.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblloginpage.setForeground(new java.awt.Color(204, 204, 204));
        lblloginpage.setText("< Login");
        lblloginpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblloginpageMouseClicked(evt);
            }
        });

        txtpassword.setBackground(new java.awt.Color(31, 35, 41));
        txtpassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtpassword.setForeground(new java.awt.Color(204, 204, 204));

        lblemaill.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblemaill.setForeground(new java.awt.Color(204, 204, 204));
        lblemaill.setText("Email:");

        lblphonenumber.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblphonenumber.setForeground(new java.awt.Color(204, 204, 204));
        lblphonenumber.setText("Phone Number:");

        txtemail.setBackground(new java.awt.Color(31, 35, 41));
        txtemail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtemail.setForeground(new java.awt.Color(204, 204, 204));

        txtphonenumber.setBackground(new java.awt.Color(31, 35, 41));
        txtphonenumber.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtphonenumber.setForeground(new java.awt.Color(204, 204, 204));

        lblstudentname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblstudentname.setForeground(new java.awt.Color(204, 204, 204));
        lblstudentname.setText("Student name:");

        txtstudentname.setBackground(new java.awt.Color(31, 35, 41));
        txtstudentname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtstudentname.setForeground(new java.awt.Color(204, 204, 204));
       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(rbtnParent)
                        .addGap(124, 124, 124)
                        .addComponent(rbtnTeacher))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpassword)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblusername)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpname)
                            .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemaill)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblphonenumber)
                            .addComponent(lblstudentname)
                            .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 288, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblloginpage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblloginpage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnParent)
                    .addComponent(rbtnTeacher))
                .addGap(28, 28, 28)
                .addComponent(lblpname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblphonenumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblemaill)
                .addGap(11, 11, 11)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblstudentname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblusername)
                .addGap(18, 18, 18)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpassword)
                .addGap(18, 18, 18)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnregister)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                   
                              

    private void lblloginpageMouseClicked(java.awt.event.MouseEvent evt) {                                          
        setVisible(false);                                        
        new Loginview();
        Loginview.loginpage();
    }                                         

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String insertstd = "INSERT INTO tb_students(studentName) VALUES (?)";
                        String insertprnt = "INSERT INTO parentinfo(Parentname, Studentname, Parentusername, Parentpassword, phone_number, email) VALUES (?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection db = DriverManager.getConnection(dbUrl, username, password);
                            PreparedStatement statement1 = db.prepareStatement(insertstd);
                            PreparedStatement statement2 = db.prepareStatement(insertprnt);
                            statement1.setString(1, txtstudentname.getText());
                            statement2.setString(1, txtpname.getText());
                            statement2.setString(2, txtstudentname.getText());
                            statement2.setString(3, txtusername.getText());
                            statement2.setString(4, String.valueOf(txtpassword.getPassword()));
                            statement2.setInt(5, Integer.parseInt(txtphonenumber.getText()));
                            statement2.setString(6, txtemail.getText());

                            int rowsInserted = statement1.executeUpdate();
                            int rowsInserted1 = statement2.executeUpdate();
                            if (rowsInserted > 0 && rowsInserted1>0) {
                                txtpname.setText("");
                                txtstudentname.setText("");
                                txtusername.setText("");
                                txtpassword.setText("");
                                setVisible(false);
                                new Loginview();
                                Loginview.loginpage();
                            }

                        } catch (SQLException | ClassNotFoundException throwables) {
                            throwables.printStackTrace();
                        }
    }                                                                                  

    private void rbtnTeacherActionPerformed(java.awt.event.ActionEvent evt) {                                            
        setVisible(false);
        new Registerteacherview();
        Registerteacherview.registerteacherpage();
    }                                           
                                     

    
    public static void registerparentpage() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registerparentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerparentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerparentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerparentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registerparentview regpar = new Registerparentview();
                regpar.setLocationRelativeTo(null);
                regpar.setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton btnregister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblemaill;
    private javax.swing.JLabel lblloginpage;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblphonenumber;
    private javax.swing.JLabel lblpname;
    private javax.swing.JLabel lblstudentname;
    private javax.swing.JLabel lblusername;
    private javax.swing.JRadioButton rbtnParent;
    private javax.swing.JRadioButton rbtnTeacher;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtstudentname;
    private javax.swing.JTextField txtusername;
                      
}