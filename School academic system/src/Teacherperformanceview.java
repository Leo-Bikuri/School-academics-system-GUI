import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Teacherperformanceview extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_Leo_Bikuri_136258";
    private static final String username = "Leo";
    private static final String password = "leomugambi23";

    public Teacherperformanceview() {
        initComponents();
    }

    
    private void initComponents() {

        
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblperformance = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblrecordmarks = new javax.swing.JLabel();
        model = new DefaultTableModel();
        model.addColumn("Student name");
            model.addColumn("Math");
            model.addColumn("English");
            model.addColumn("Kiswahili");
            model.addColumn("Total");
            model.addColumn("Mean");
            model.addColumn("Grade");
            model.addColumn("Position"); 
            String marksretrievalquery = "SELECT * FROM tb_students WHERE Total IS NOT NULL ORDER BY Total DESC";
            int position = 1;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection db = DriverManager.getConnection(dbUrl, username, password);
                Statement marksquery = db.createStatement();
                ResultSet performance = marksquery.executeQuery(marksretrievalquery);
                while(performance.next()) {
                    String grade="";
                    String name = performance.getString("studentName");
                    String Math = performance.getString("Math");
                    String Eng = performance.getString("English");
                    String Swa = performance.getString("Kiswahili");
                    String Total = performance.getString("Total");
                    String Mean = performance.getString("Mean");
                    if(Integer.parseInt(Mean)>=70&&Integer.parseInt(Mean)<101){
                        grade = "A";
                    }else if(Integer.parseInt(Mean)>=60&&Integer.parseInt(Mean)<70){
                        grade = "B";
                    }else if(Integer.parseInt(Mean)>=50&&Integer.parseInt(Mean)<60){
                        grade = "C";
                    }else if(Integer.parseInt(Mean)>=40&&Integer.parseInt(Mean)<50){
                        grade = "D";
                    }else if(Integer.parseInt(Mean)<40){
                        grade = "E";
                    }
                    model.addRow(new Object[]{name, Math, Eng, Swa, Total, Mean, grade, position});
                    position++;
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
       

           
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        lblperformance.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); 
        lblperformance.setForeground(new java.awt.Color(0, 102, 102));
        lblperformance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblperformance.setText("Class Performance");
        
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
        lblrecordmarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblrecordmarksMouseClicked(evt);
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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblhome)
                .addGap(18, 18, 18)
                .addComponent(lblperformance)
                .addGap(18, 18, 18)
                .addComponent(lblrecordmarks)
                .addGap(18, 18, 18)
                .addComponent(lblLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    
   
    private void lblrecordmarksMouseClicked(java.awt.event.MouseEvent evt) {                                            
        setVisible(false);
        new Teacherrecordview();
        Teacherrecordview.teachrecord();
    }                                           

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        setVisible(false);
        new Loginview();
        Loginview.loginpage();
    }                                      

    
    public static void teachperformanceview() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teacherperformanceview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacherperformanceview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacherperformanceview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacherperformanceview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Teacherperformanceview performanceview = new Teacherperformanceview();
                performanceview.setLocationRelativeTo(null);
                performanceview.setVisible(true);
            }
        });
    }

                    
    
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblperformance;
    private javax.swing.JLabel lblrecordmarks;
    private DefaultTableModel model;
                   
}
