import java.sql.*;

import javax.swing.JOptionPane;

public class Homepage extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";
    public Homepage() {
        initComponents();
    }
                     
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblperformance10 = new javax.swing.JLabel();
        lblhomepage10 = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        lblpinfo = new javax.swing.JLabel();
        lblphonenumber = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblsinfo = new javax.swing.JLabel();
        lblstudentname = new javax.swing.JLabel();
        lblmealallowance = new javax.swing.JLabel();
        lblsetnumber = new javax.swing.JLabel();
        lblsetname = new javax.swing.JLabel();
        lblsetemail = new javax.swing.JLabel();
        lblsetstdname = new javax.swing.JLabel();
        txtmealallowance = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));

        lblperformance10.setBackground(new java.awt.Color(204, 204, 204));
        lblperformance10.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblperformance10.setForeground(new java.awt.Color(204, 204, 204));
        lblperformance10.setText("Performance");
        lblperformance10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblperformance10MouseClicked(evt);
            }
        });

        lblhomepage10.setBackground(new java.awt.Color(204, 204, 204));
        lblhomepage10.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblhomepage10.setForeground(new java.awt.Color(204, 204, 204));
        lblhomepage10.setText("Home Page");

        lbllogout.setBackground(new java.awt.Color(204, 204, 204));
        lbllogout.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lbllogout.setForeground(new java.awt.Color(204, 204, 204));
        lbllogout.setText("Logout");
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhomepage10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblperformance10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbllogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblhomepage10)
                .addGap(18, 18, 18)
                .addComponent(lblperformance10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbllogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblpinfo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); 
        lblpinfo.setForeground(new java.awt.Color(204, 204, 204));
        lblpinfo.setText("Parent Information:");

        lblphonenumber.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblphonenumber.setForeground(new java.awt.Color(204, 204, 204));
        lblphonenumber.setText("Phone number:");

        lblname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblname.setForeground(new java.awt.Color(204, 204, 204));
        lblname.setText("Name:");

        lblemail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblemail.setForeground(new java.awt.Color(204, 204, 204));
        lblemail.setText("Email:");

        lblsinfo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); 
        lblsinfo.setForeground(new java.awt.Color(204, 204, 204));
        lblsinfo.setText("Student Information:");

        lblstudentname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblstudentname.setForeground(new java.awt.Color(204, 204, 204));
        lblstudentname.setText("Name:");

        lblmealallowance.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblmealallowance.setForeground(new java.awt.Color(204, 204, 204));
        lblmealallowance.setText("Meal Allowance:");

        lblsetnumber.setBackground(new java.awt.Color(31, 35, 41));
        lblsetnumber.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblsetnumber.setForeground(new java.awt.Color(204, 204, 204));
        lblsetnumber.setOpaque(true);
        lblsetnumber.setPreferredSize(new java.awt.Dimension(120, 16));

        lblsetname.setBackground(new java.awt.Color(31, 35, 41));
        lblsetname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblsetname.setForeground(new java.awt.Color(204, 204, 204));
        lblsetname.setOpaque(true);
        lblsetname.setPreferredSize(new java.awt.Dimension(120, 16));

        lblsetemail.setBackground(new java.awt.Color(31, 35, 41));
        lblsetemail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblsetemail.setForeground(new java.awt.Color(204, 204, 204));
        lblsetemail.setOpaque(true);
        lblsetemail.setPreferredSize(new java.awt.Dimension(120, 16));

        lblsetstdname.setBackground(new java.awt.Color(31, 35, 41));
        lblsetstdname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        lblsetstdname.setForeground(new java.awt.Color(204, 204, 204));
        lblsetstdname.setOpaque(true);
        lblsetstdname.setPreferredSize(new java.awt.Dimension(120, 16));

        txtmealallowance.setBackground(new java.awt.Color(31, 35, 41));
        txtmealallowance.setForeground(new java.awt.Color(0, 204, 204));

        btnsave.setBackground(new java.awt.Color(31, 35, 41));
        btnsave.setForeground(new java.awt.Color(204, 204, 204));
        btnsave.setText("save");
        btnsave.setBorderPainted(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        String getInfo = "SELECT Parentname, phone_number, email, studentname , meal_allowance FROM parentinfo WHERE studentname = ?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
                    Connection db = DriverManager.getConnection(dbUrl, username, password);
                    PreparedStatement update = db.prepareStatement(getInfo);
                    update.setString(1, Loginview.studentname());
                    ResultSet information = update.executeQuery();
                   while(information.next()){
                       lblsetname.setText(information.getString("Parentname"));
                       lblsetemail.setText(information.getString("email"));
                       lblsetnumber.setText(information.getString("phone_number"));
                       lblsetstdname.setText(information.getString("studentname"));
                       txtmealallowance.setText(String.valueOf(information.getInt("meal_allowance")));
                   }
                } catch (SQLException | ClassNotFoundException throwables) {
                    throwables.printStackTrace();
                }


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsetemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblphonenumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsetnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblpinfo))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmealallowance)
                            .addComponent(lblstudentname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsetstdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmealallowance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsave))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblsinfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpinfo)
                            .addComponent(lblsinfo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblname)
                                    .addComponent(lblsetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblstudentname))))
                    .addComponent(lblsetstdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblphonenumber)
                        .addComponent(lblmealallowance)
                        .addComponent(txtmealallowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblsetnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblemail)
                    .addComponent(lblsetemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
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
    }                        

                                             

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String updatemeal = "UPDATE parentinfo SET meal_allowance = ? WHERE studentname = ?";
        try{
        Class.forName("com.mysql.jdbc.Driver");
                Connection db = DriverManager.getConnection(dbUrl, username, password);
                PreparedStatement update = db.prepareStatement(updatemeal);
                update.setInt(1, Integer.parseInt(txtmealallowance.getText()));
                update.setString(2, Loginview.studentname());

                int rowsinserted = update.executeUpdate();
                if(rowsinserted>0){
                   JOptionPane.showMessageDialog(null, "Meal allowance updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
    }                                        

    private void lblperformance10MouseClicked(java.awt.event.MouseEvent evt) {                                              
        setVisible(false);
        Parentview.parentview();
    }                                             

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        setVisible(false);
        Loginview.loginpage();
    }                                      

    
    public static void home() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Homepage home = new Homepage();
                home.setLocationRelativeTo(null);
                home.setVisible(true);
            }
        });
    }

                     
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel lblperformance10;
    private javax.swing.JLabel lblhomepage10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblmealallowance;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphonenumber;
    private javax.swing.JLabel lblpinfo;
    private javax.swing.JLabel lblsetemail;
    private javax.swing.JLabel lblsetname;
    private javax.swing.JLabel lblsetnumber;
    private javax.swing.JLabel lblsetstdname;
    private javax.swing.JLabel lblsinfo;
    private javax.swing.JLabel lblstudentname;
    private javax.swing.JTextField txtmealallowance;                  
}