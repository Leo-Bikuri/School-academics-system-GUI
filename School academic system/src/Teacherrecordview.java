import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Teacherrecordview extends javax.swing.JFrame {

    /**
     *
     */
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";
    private static final long serialVersionUID = 1L;
    public Teacherrecordview() {
        initComponents();
    }

    
                   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //jTable1 = new javax.swing.JTable();
        lblperformance = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblrecordmarks = new javax.swing.JLabel();
        btnrecord = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        model = new DefaultTableModel();
        model.addColumn("Student name");
        model.addColumn("Math");
        model.addColumn("English");
        model.addColumn("Kiswahili");
        String namesretrievalquery = "SELECT studentName FROM tb_students WHERE Math IS NULL";
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection db = DriverManager.getConnection(dbUrl, username, password);
                Statement namesquery = db.createStatement();
                ResultSet nameSet = namesquery.executeQuery(namesretrievalquery);
                while(nameSet.next()) {
                    String name = nameSet.getString("studentName");
                    model.addRow(new Object[]{name});
                }

            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
            jTable1 = new javax.swing.JTable(model);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 19, 25));

        jTable1.setBackground(new java.awt.Color(15, 19, 25));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); 
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(15, 19, 25));
        jScrollPane1.setViewportView(jTable1);

        lblperformance.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblperformance.setForeground(new java.awt.Color(0, 102, 102));
        lblperformance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblperformance.setText("Class Performance");
        lblperformance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblperformanceMouseClicked(evt);
            }
        });

        lblhome.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblhome.setForeground(new java.awt.Color(0, 102, 102));
        lblhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhome.setText("Home");

        lblLogout.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblLogout.setForeground(new java.awt.Color(0, 102, 102));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblrecordmarks.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblrecordmarks.setForeground(new java.awt.Color(0, 102, 102));
        lblrecordmarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrecordmarks.setText("Record Marks");
        

        btnrecord.setBackground(new java.awt.Color(0, 102, 102));
        btnrecord.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); 
        btnrecord.setText("Record");
        btnrecord.setBorderPainted(false);
        btnrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(lblrecordmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblperformance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrecord)
                .addGap(156, 156, 156)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblhome)
                .addGap(18, 18, 18)
                .addComponent(lblperformance)
                .addGap(18, 18, 18)
                .addComponent(lblrecordmarks)
                .addGap(18, 18, 18)
                .addComponent(lblLogout)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnrecord)
                        .addContainerGap())))
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

    private void lblperformanceMouseClicked(java.awt.event.MouseEvent evt) {                                            
        setVisible(false);
        new Teacherperformanceview();
        Teacherperformanceview.teachperformanceview();
    }                                           
                     

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        setVisible(false);
        new Loginview();
        Loginview.loginpage();
    }                                      
                                   

    private void btnrecordActionPerformed(java.awt.event.ActionEvent evt) {   
        int rows = jTable1.getRowCount();                                       
        String total = "";
        String mean = "";
        String markupdate = "UPDATE tb_students SET Math = ? , English = ? , Kiswahili = ?, Total = ?, Mean = ? WHERE studentName = ?";
        String name = "";
        String mathmarks = "";
        String engmarks = "";
        String swamarks = "";
        for(int x = 0;x < rows; x++){
            name = (String) jTable1.getValueAt(x, 0);
            mathmarks = (String) jTable1.getValueAt(x, 1);
            engmarks = (String) jTable1.getValueAt(x, 2);
            swamarks = (String) jTable1.getValueAt(x, 3);
            total = String.valueOf(Integer.parseInt(mathmarks) + Integer.parseInt(engmarks) + Integer.parseInt(swamarks));
            mean = String.valueOf(Integer.parseInt(total)/3);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection db = DriverManager.getConnection(dbUrl, username, password);
                PreparedStatement update = db.prepareStatement(markupdate);
                update.setString(1, mathmarks);
                update.setString(2, engmarks);
                update.setString(3, swamarks);
                update.setString(4, total);
                update.setString(5, mean);
                update.setString(6, name);

                int rowsinserted = update.executeUpdate();
                if(rowsinserted>0){
                    JOptionPane.showMessageDialog(null, "Data entered successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }


        }
    }                                         

        public static void teachrecord() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teacherrecordview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacherrecordview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacherrecordview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacherrecordview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Teacherrecordview teachrecord = new Teacherrecordview();
                teachrecord.setLocationRelativeTo(null);
                teachrecord.setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnrecord;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblperformance;
    private javax.swing.JLabel lblrecordmarks;
    private DefaultTableModel model;
                    
}
