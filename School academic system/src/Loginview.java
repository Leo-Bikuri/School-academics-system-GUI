
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Loginview extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";
    private static String stdname = "";
    
    private static final ArrayList<ArrayList<String>> parentcredarr = new ArrayList<ArrayList<String>>();
    private static final ArrayList<ArrayList<String>> teachercredarr = new ArrayList<ArrayList<String>>();
    private static final ArrayList<String> studentnames = new ArrayList<String>();
    public Loginview() {
        initComponents();
    }

    
                             
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblregister = new javax.swing.JLabel();
        lblprompt = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        incorrect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 19, 25));

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblusername.setBackground(new java.awt.Color(0, 0, 0));
        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14));
        lblusername.setForeground(new java.awt.Color(204, 204, 204));
        lblusername.setText("Username:");

        lblpassword.setBackground(new java.awt.Color(0, 0, 0));
        lblpassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblpassword.setForeground(new java.awt.Color(204, 204, 204));
        lblpassword.setText("Password:");

        txtUsername.setBackground(new java.awt.Color(31, 35, 41));
        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        btnLogin.setText("LOGIN");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblregister.setBackground(new java.awt.Color(15, 19, 25));
        lblregister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblregister.setForeground(new java.awt.Color(204, 204, 204));
        lblregister.setText("Register >"); 
        lblregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblregisterMouseClicked(evt);
            }
        });

        lblprompt.setBackground(new java.awt.Color(13, 19, 25));
        lblprompt.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); 
        lblprompt.setForeground(new java.awt.Color(0, 102, 102));
        lblprompt.setText("Login to get started!");

        txtpassword.setBackground(new java.awt.Color(31, 35, 41));
        txtpassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        txtpassword.setForeground(new java.awt.Color(204, 204, 204));

        incorrect.setBackground(new java.awt.Color(15, 19, 25));
        incorrect.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14));
        incorrect.setForeground(new java.awt.Color(255, 0, 0));
        incorrect.setPreferredSize(new java.awt.Dimension(213, 20));
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblregister)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprompt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblusername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblprompt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblregister)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }                                            

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String parentcredquery = "SELECT Parentusername, Parentpassword FROM parentinfo";
        String teachercredquery = "SELECT teacherusername, teacherpassword FROM teacherinfo";
        String studentnamesquery = "SELECT Studentname FROM parentinfo";
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection(dbUrl, username, password);
            Statement stmnt = db.createStatement();
            Statement stmnt2 = db.createStatement();
            Statement stmnt3 = db.createStatement();
            ResultSet parentcred = stmnt.executeQuery(parentcredquery);
            ResultSet teachrcred = stmnt2.executeQuery(teachercredquery);
            ResultSet stds = stmnt3.executeQuery(studentnamesquery);
            while(parentcred.next()){
                parentcredarr.add(new ArrayList<String>(Arrays.asList(parentcred.getString("Parentusername"), parentcred.getString("Parentpassword"))));

            }
            while(teachrcred.next()) {
                teachercredarr.add(new ArrayList<String>(Arrays.asList(teachrcred.getString("teacherusername"), teachrcred.getString("teacherpassword"))));
            }
            while(stds.next()){
                studentnames.add(stds.getString("studentName"));
            }
            for(int x = 0;x<teachercredarr.size();x++){
                    if (teachercredarr.get(x).get(0).equals(txtUsername.getText()) && teachercredarr.get(x).get(1).equals(new String(txtpassword.getPassword()))) {
                        i=1;
                        setVisible(false);
                        new Teacherperformanceview();
                        Teacherperformanceview.teachperformanceview();
                        break;
                }
            }
            for(int x = 0;x<parentcredarr.size();x++){
                if (parentcredarr.get(x).get(0).equals(txtUsername.getText()) && parentcredarr.get(x).get(1).equals(new String(txtpassword.getPassword()))) {
                    i=1;
                    stdname = studentnames.get(x);
                    setVisible(false);
                    new Homepage();
                    Homepage.home();
                    break;
                }
            }

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        txtUsername.setText("");
        txtpassword.setText("");
        if(i!=1) {
            incorrect.setText("Username or Password is incorrect!");
        }
    }
                                            

    private void lblregisterMouseClicked(java.awt.event.MouseEvent evt) { 
        setVisible(false);                                        
        new Registerparentview();
        Registerparentview.registerparentpage();
    }                                        

                          

    
    public static void loginpage() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Loginview login = new Loginview();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel incorrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblprompt;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpassword;
    
    public static String studentname(){
        return stdname;
    }                  
}
