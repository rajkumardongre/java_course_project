import java.sql.*;
import Project.ConnectionProvider;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shree
 */
public class allExaminer extends javax.swing.JFrame {

    /**
     * Creates new form allExaminer
     */
    public allExaminer() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        try
        {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from Examiners;");
            System.out.println(rs);
            examiners.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        examiners = new javax.swing.JTable();
        searchQuery = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchBy = new javax.swing.JComboBox<>();
        showAllBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Examiners");

        closeBtn.setText("Back");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        examiners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(examiners);

        searchQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchQueryActionPerformed(evt);
            }
        });

        jLabel2.setText("Search By : ");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic Year", "Semester", "Branch", "Division", "Exam", "Internal Name", "External Name", "Mobile", "Account Number", "IFSC Code", "Bank Branch", "Bank Address", "Number of Student", "Amount Per Student" }));

        showAllBtn.setText("Show All");
        showAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });

        exportBtn.setText("Export Data");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(searchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                        .addComponent(showAllBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(searchBtn)
                        .addComponent(searchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showAllBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtn)
                    .addComponent(exportBtn))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    private void formComponentShown(java.awt.event.ComponentEvent evt)
//    {
////        try
////        {
////            Connection con = ConnectionProvider.getConnection();
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery("SELECT * from Examiner;");
////            System.out.println(rs);
////            examiners.setModel(DbUtils.resultSetToTableModel(rs));
////        }catch(Exception e){
////            JOptionPane.showMessageDialog(null, "Connection Error");
////        }
//    }
    
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void searchQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchQueryActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchBy = (String)this.searchBy.getSelectedItem();
        String searchByOption = "ay";
        String searchQuery = "2022";
        //Academic Year
        //Semester
        //Branch
        //Division
        //Exam
        //Internal Name
        //External Name
        //Mobile
        //Account Number
        //IFSC Code
        //Bank Branch
        //Bank Address
        //Number of Student
        //Amount Per Student
        searchQuery = this.searchQuery.getText();
        if(searchBy == "Academic Year"){
            searchByOption = "ay";
        }else if(searchBy == "Semester"){
            searchByOption = "semester";
            
        }else if(searchBy == "Branch"){
            searchByOption = "branch";
            
        }else if(searchBy == "Division"){
            searchByOption = "division";
            
        }else if(searchBy == "Exam"){
            searchByOption = "exam";
            
        }else if(searchBy == "Internal Name"){
            searchByOption = "internal_name";
            
        }else if(searchBy == "External Name"){
            searchByOption = "external_name";
            
        }else if(searchBy == "Mobile"){
            searchByOption = "mob_no";
            
        }else if(searchBy == "Account Number"){
            searchByOption = "acc_no";
            
        }else if(searchBy == "IFSC Code"){
            searchByOption = "ifsc_code";
            
        }else if(searchBy == "Bank Branch"){
            searchByOption = "bank_branch";
            
        }else if(searchBy == "Bank Address"){
            searchByOption = "bank_address";
            
        }
//        else if(searchBy == "Number of Student"){
//            
//        }else if(searchBy == "Amount Per Student"){
//            
//        }
//        System.out.print("Hello World");
        try
        {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Examiners WHERE " + searchByOption + " LIKE '%" + searchQuery + "%';";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            examiners.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
        // TODO add your handling code here:
         try
        {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from Examiners;");
            System.out.println(rs);
            examiners.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_showAllBtnActionPerformed

    public void exportTable(JTable table, File file) throws IOException{
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(out);
        for(int i=0; i<model.getColumnCount(); i++){
            bw.write(model.getColumnName(i) + "\t");
        }
        bw.write("\n");
         for(int i=0; i<model.getRowCount(); i++){
            for(int j=0; j<model.getColumnCount(); j++){
                bw.write(model.getValueAt(i, j) + "\t");
            }
            bw.write("\n");   
         }
         bw.close();
    }
    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        // TODO add your handling code here:
        try{
//        String FilePath = "D:\\Academic\\JAVA_OOP\\COURSE_PROJECT\\Exported_Data\\Data" + new java.util.Date()+".xls";
//        
        String fileName = "Data" + new java.util.Date();
        fileName = fileName.replaceAll(" ", "_");
        fileName = fileName.replaceAll(":", "-");
        String FilePath = "D:\\Academic\\JAVA_OOP\\COURSE_PROJECT\\Exported_Data\\"+fileName+".xls";


        exportTable(examiners, new File(FilePath));
        JOptionPane.showMessageDialog(null, "The File is Exported to following path : \n" + FilePath);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_exportBtnActionPerformed

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
            java.util.logging.Logger.getLogger(allExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allExaminer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTable examiners;
    private javax.swing.JButton exportBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchBy;
    private javax.swing.JTextField searchQuery;
    private javax.swing.JButton showAllBtn;
    // End of variables declaration//GEN-END:variables
}
