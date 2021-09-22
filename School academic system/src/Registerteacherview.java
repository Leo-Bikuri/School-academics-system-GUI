import java.sql.*;


public class Registerteacherview extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";

    public Registerteacherview() {
        initComponents();
    }

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rbtnTeacher = new javax.swing.JRadioButton();
        btnregister = new javax.swing.JButton();
        lbltname = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        rbtnParent = new javax.swing.JRadioButton();
        lblloginpage = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));

        rbtnTeacher.setForeground(new java.awt.Color(153, 153, 153));
        rbtnTeacher.setText("Teacher");
        rbtnTeacher.setSelected(true);
        rbtnTeacher.setOpaque(false);
        

        btnregister.setBackground(new java.awt.Color(0, 102, 102));
        btnregister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        btnregister.setText("Register");
        btnregister.setBorderPainted(false);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        lbltname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lbltname.setForeground(new java.awt.Color(204, 204, 204));
        lbltname.setText("Teacher Name:");

        txtlname.setBackground(new java.awt.Color(31, 35, 41));
        txtlname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtlname.setForeground(new java.awt.Color(204, 204, 204));

        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblusername.setForeground(new java.awt.Color(204, 204, 204));
        lblusername.setText("Username:");

        lblpassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblpassword.setForeground(new java.awt.Color(204, 204, 204));
        lblpassword.setText("Password:");

        txtusername.setBackground(new java.awt.Color(31, 35, 41));
        txtusername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtusername.setForeground(new java.awt.Color(153, 153, 153));
        

        rbtnParent.setForeground(new java.awt.Color(153, 153, 153));
        rbtnParent.setText("Parent");
        rbtnParent.setOpaque(false);
        rbtnParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnParentActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnParent)
                                .addGap(114, 114, 114)
                                .addComponent(rbtnTeacher))
                            .addComponent(lblusername)
                            .addComponent(lblpassword)
                            .addComponent(txtusername)
                            .addComponent(btnregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtlname)
                            .addComponent(txtpassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblloginpage
            
            )))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblloginpage
            )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnParent)
                    .addComponent(rbtnTeacher))
                .addGap(18, 18, 18)
                .addComponent(lbltname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblusername)
                .addGap(18, 18, 18)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpassword)
                .addGap(18, 18, 18)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnregister)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }                    
                              
                                    

    private void lblloginpageMouseClicked(java.awt.event.MouseEvent evt) {                                     
        setVisible(false);
        new Loginview();
        Loginview.loginpage();;
    }                                    

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String insertteach = "INSERT INTO teacherinfo(teachername, teacherusername, teacherpassword) VALUES (?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection db = DriverManager.getConnection(dbUrl, username, password);
                            PreparedStatement statement = db.prepareStatement(insertteach);
                            statement.setString(1, txtlname.getText());
                            statement.setString(2, txtusername.getText());
                            statement.setString(3, String.valueOf(txtpassword.getPassword()));

                            int rowsInserted = statement.executeUpdate();
                            if (rowsInserted > 0) {
                                setVisible(false);
                                new Loginview();
                                Loginview.loginpage();
                            }

                        } catch (SQLException | ClassNotFoundException throwables) {
                            throwables.printStackTrace();
                        }
    }                                          

    private void rbtnParentActionPerformed(java.awt.event.ActionEvent evt) {                                           
        setVisible(false);
        new Registerparentview();
        Registerparentview.registerparentpage();
    }                                          

    
    public static void registerteacherpage() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registerteacherview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerteacherview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerteacherview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerteacherview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registerteacherview regteach = new Registerteacherview();
                regteach.setLocationRelativeTo(null);
                regteach.setVisible(true);
            }
        });
    }

                     
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel lblloginpage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbltname;
    private javax.swing.JLabel lblusername;
    private javax.swing.JRadioButton rbtnParent;
    private javax.swing.JRadioButton rbtnTeacher;
    private javax.swing.JTextField txtlname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
               
}
