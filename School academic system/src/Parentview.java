import java.sql.*;
public class Parentview extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";
    public Parentview() {
        initComponents();
    }
                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblmath = new javax.swing.JLabel();
        lbleng = new javax.swing.JLabel();
        lblswa = new javax.swing.JLabel();
        lblttl = new javax.swing.JLabel();
        lblmn = new javax.swing.JLabel();
        lblttl1 = new javax.swing.JLabel();
        lblnm = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblperformance = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        lblhomepage1 = new javax.swing.JLabel();
        lblmathmarks = new javax.swing.JLabel();
        lblenglishmarks = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblgrade = new javax.swing.JLabel();
        lblswamarks = new javax.swing.JLabel();
        lblmean = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        lblmath.setBackground(new java.awt.Color(31, 35, 41));
        lblmath.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblmath.setForeground(new java.awt.Color(0, 102, 102));
        lblmath.setText("Mathematics:");

        lbleng.setBackground(new java.awt.Color(31, 35, 41));
        lbleng.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lbleng.setForeground(new java.awt.Color(0, 102, 102));
        lbleng.setText("English:");

        lblswa.setBackground(new java.awt.Color(31, 35, 41));
        lblswa.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblswa.setForeground(new java.awt.Color(0, 102, 102));
        lblswa.setText("Kiswahili:");

        lblttl.setBackground(new java.awt.Color(31, 35, 41));
        lblttl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblttl.setForeground(new java.awt.Color(0, 102, 102));
        lblttl.setText("Total:");

        lblmn.setBackground(new java.awt.Color(31, 35, 41));
        lblmn.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblmn.setForeground(new java.awt.Color(0, 102, 102));
        lblmn.setText("Mean:");

        lblttl1.setBackground(new java.awt.Color(31, 35, 41));
        lblttl1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblttl1.setForeground(new java.awt.Color(0, 102, 102));
        lblttl1.setText("Grade:");

        lblnm.setBackground(new java.awt.Color(31, 35, 41));
        lblnm.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblnm.setForeground(new java.awt.Color(0, 102, 102));
        lblnm.setText("Name:");

        lblname.setBackground(new java.awt.Color(31, 35, 41));
        lblname.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        lblname.setForeground(new java.awt.Color(204, 204, 204));
        lblname.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        lblperformance.setBackground(new java.awt.Color(204, 204, 204));
        lblperformance.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblperformance.setForeground(new java.awt.Color(204, 204, 204));
        lblperformance.setText("Performance");

        lbllogout.setBackground(new java.awt.Color(204, 204, 204));
        lbllogout.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lbllogout.setForeground(new java.awt.Color(204, 204, 204));
        lbllogout.setText("Logout");
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
        });

        lblhomepage1.setBackground(new java.awt.Color(204, 204, 204));
        lblhomepage1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblhomepage1.setForeground(new java.awt.Color(204, 204, 204));
        lblhomepage1.setText("Home Page");
        lblhomepage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhomepage1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblperformance, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblhomepage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblperformance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbllogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(lblhomepage1)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );

        lblmathmarks.setBackground(new java.awt.Color(31, 35, 41));
        lblmathmarks.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblmathmarks.setForeground(new java.awt.Color(204, 204, 204));
        lblmathmarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmathmarks.setOpaque(true);
        lblmathmarks.setPreferredSize(new java.awt.Dimension(16, 25));

        lblenglishmarks.setBackground(new java.awt.Color(31, 35, 41));
        lblenglishmarks.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblenglishmarks.setForeground(new java.awt.Color(204, 204, 204));
        lblenglishmarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblenglishmarks.setOpaque(true);
        lblenglishmarks.setPreferredSize(new java.awt.Dimension(16, 25));

        lbltotal.setBackground(new java.awt.Color(31, 35, 41));
        lbltotal.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lbltotal.setForeground(new java.awt.Color(204, 204, 204));
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal.setOpaque(true);
        lbltotal.setPreferredSize(new java.awt.Dimension(35, 25));

        lblgrade.setBackground(new java.awt.Color(31, 35, 41));
        lblgrade.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblgrade.setForeground(new java.awt.Color(204, 204, 204));
        lblgrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgrade.setOpaque(true);
        lblgrade.setPreferredSize(new java.awt.Dimension(16, 25));

        lblswamarks.setBackground(new java.awt.Color(31, 35, 41));
        lblswamarks.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblswamarks.setForeground(new java.awt.Color(204, 204, 204));
        lblswamarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblswamarks.setOpaque(true);
        lblswamarks.setPreferredSize(new java.awt.Dimension(16, 25));

        lblmean.setBackground(new java.awt.Color(31, 35, 41));
        lblmean.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); 
        lblmean.setForeground(new java.awt.Color(204, 204, 204));
        lblmean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmean.setOpaque(true);
        lblmean.setPreferredSize(new java.awt.Dimension(16, 25));

        String marksretrievalquery = "SELECT * FROM tb_students WHERE studentName = ?";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection db = DriverManager.getConnection(dbUrl, username, password);
                PreparedStatement marksquery = db.prepareStatement(marksretrievalquery);
                marksquery.setString(1, Loginview.studentname());
                ResultSet performance = marksquery.executeQuery();
                while(performance.next()){
                    lblname.setText(performance.getString("studentName"));
                    lblmathmarks.setText(performance.getString("Math"));
                    lblenglishmarks.setText(performance.getString("English"));
                    lblswamarks.setText(performance.getString("Kiswahili"));
                    lbltotal.setText(performance.getString("Total"));
                    String Mean = performance.getString("Mean");
                    lblmean.setText(performance.getString("Mean"));
                    if(Integer.parseInt(Mean)>=70&&Integer.parseInt(Mean)<101){
                        lblgrade.setText("A"); 
                    }else if(Integer.parseInt(Mean)>=60&&Integer.parseInt(Mean)<70){
                        lblgrade.setText("B");
                    }else if(Integer.parseInt(Mean)>=50&&Integer.parseInt(Mean)<60){
                        lblgrade.setText("C");
                    }else if(Integer.parseInt(Mean)>=40&&Integer.parseInt(Mean)<50){
                        lblgrade.setText("D");
                    }else if(Integer.parseInt(Mean)<40){
                       lblgrade.setText("E");
                    }
                }
                
                

            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(59, 59, 59)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lblnm)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblmath)
                                .addComponent(lbleng)
                                .addComponent(lblswa))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblmathmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblttl))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblswamarks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblenglishmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblmn)
                                        .addComponent(lblttl1))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblmean, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnm)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmath)
                            .addComponent(lblttl)
                            .addComponent(lblmathmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblmean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblmn))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblttl1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblgrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblenglishmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblswamarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbleng)
                            .addGap(27, 27, 27)
                            .addComponent(lblswa)))
                    .addGap(0, 152, Short.MAX_VALUE))
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
    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        setVisible(false);
        Loginview.loginpage();
    }                                      

    private void lblhomepage1MouseClicked(java.awt.event.MouseEvent evt) {                                          
        setVisible(false);;
        Homepage.home();
    }                                         

    
    public static void parentview() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Parentview prntvw = new Parentview();
                prntvw.setLocationRelativeTo(null);
                prntvw.setVisible(true);
            }
        });
    }
                    
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbleng;
    private javax.swing.JLabel lblenglishmarks;
    private javax.swing.JLabel lblgrade;
    private javax.swing.JLabel lblhomepage1;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblmath;
    private javax.swing.JLabel lblmathmarks;
    private javax.swing.JLabel lblmean;
    private javax.swing.JLabel lblmn;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnm;
    private javax.swing.JLabel lblperformance;
    private javax.swing.JLabel lblswa;
    private javax.swing.JLabel lblswamarks;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lblttl;
    private javax.swing.JLabel lblttl1;

}