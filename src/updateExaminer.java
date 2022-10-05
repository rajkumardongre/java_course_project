
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shree
 */
public class updateExaminer extends javax.swing.JFrame {

    /**
     * Creates new form updateExaminer
     */
    public updateExaminer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JTextField();
        ay = new javax.swing.JTextField();
        ifscSearchBtn = new javax.swing.JButton();
        semester = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox<>();
        studentAppeared = new javax.swing.JTextField();
        division = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        exam = new javax.swing.JComboBox<>();
        amountPerStudent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        internalName = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        externalName = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        ifsc = new javax.swing.JTextField();
        bankBranch = new javax.swing.JTextField();
        bankAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Examiner");

        jLabel2.setText("Examiner ID :");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Exam");

        ay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayActionPerformed(evt);
            }
        });

        ifscSearchBtn.setText("Search");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "on Demand" }));

        jLabel14.setText("Number of Student Appeared");

        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AIDS", "CS", "IT", "ENTC", "MECH", "INSTRU", "CHEM" }));

        division.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jLabel15.setText("Amount per Student");

        exam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GD", "PPT", "CVV", "EDI", "DT", "SDP" }));

        amountPerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountPerStudentActionPerformed(evt);
            }
        });

        jLabel6.setText("Internal Examiner");

        jLabel7.setText("External Examiner");

        jLabel16.setText("Total Amount");

        totalAmount.setText("0");

        jLabel8.setText("Mobile number");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel9.setText("IFSC Number");

        jLabel17.setText("Email");

        jLabel10.setText("Branch Name");

        jLabel11.setText("Branch Address");

        jLabel18.setText("Password");

        internalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Academic Year");

        jLabel4.setText("Semester");

        jLabel12.setText("Branch");

        jLabel13.setText("Division");

        jLabel19.setText("Account Number");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mobile)
                            .addComponent(internalName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(293, 293, 293)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(externalName)
                                    .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(semester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ay)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(studentAppeared, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(amountPerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(42, 42, 42)
                                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(calculate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateBtn)
                                    .addGap(40, 40, 40)))
                            .addComponent(backBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(bankAddress))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ifsc)
                                        .addComponent(bankBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ifscSearchBtn))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(internalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(externalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifscSearchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bankBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bankAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(studentAppeared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(amountPerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(totalAmount)
                    .addComponent(calculate)
                    .addComponent(backBtn)
                    .addComponent(updateBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new editExaminer().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        // TODO add your handling code here:
        String idString = this.id.getText();
        int id  = Integer.parseInt(idString);
        
         try
        {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Examiner WHERE ID="+id+";";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);
//            System.out.println(rs.next());
            
            
            if(rs.next()){
                String emailValue = rs.getString("Email");
                String passwordValue = rs.getString("Password");
                String ayValue = rs.getString("Academic_Year");
                String semesterValue = rs.getString("Semester");
                String branchValue = rs.getString("Branch");
                String divisionValue = rs.getString("Division");
                String examValue = rs.getString("Exam");
                String internalNameValue = rs.getString("Internal_Name");
                String externalNameValue = rs.getString("External_Name");
                String accNumberValue = rs.getString("Account_Number");
                String mobileNoValue = rs.getString("Mobile_Number");
                String ifscValue = rs.getString("IFSC");
                String bankBranchValue = rs.getString("Bank_Branch");
                String bankAddressValue = rs.getString("Bank_Address");
                int numberOfStudentValue = rs.getInt("Number_of_Student");
                float amountPerStudentValue = rs.getFloat("Amount_per_Student");
                
//                System.out.println(emailValue);
//                System.out.println(passwordValue);
//                System.out.println(ayValue);
//                System.out.println(semesterValue);
//                System.out.println(branchValue);
//                System.out.println(divisionValue);
//                System.out.println(examValue);                
//                System.out.println(internalNameValue);
//                System.out.println(externalNameValue);
//                System.out.println(accNumberValue);
//                System.out.println(mobileNoValue);
//                System.out.println(ifscValue);
//                System.out.println(bankBranchValue);
//                System.out.println(bankAddressValue);
//                System.out.println(numberOfStudentValue);
//                System.out.println(amountPerStudentValue);

//                JOptionPane.showMessageDialog(null, "Examiner found with ID "+idString);

                  this.email.setText(emailValue);
                  this.password.setText(passwordValue);
                  this.ay.setText(ayValue);
                  this.semester.setSelectedItem(semesterValue);
                  this.branch.setSelectedItem(branchValue);
                  this.division.setSelectedItem(divisionValue);
                  this.exam.setSelectedItem(examValue);
                  this.internalName.setText(internalNameValue);
                  this.externalName.setText(externalNameValue);
                  this.accountNumber.setText(accNumberValue);
                  this.mobile.setText(mobileNoValue);
                  this.ifsc.setText(ifscValue);
                  this.bankBranch.setText(bankBranchValue);
                  this.bankAddress.setText(bankAddressValue);
                  this.studentAppeared.setText(Integer.toString(numberOfStudentValue));
                  this.amountPerStudent.setText(Float.toString(amountPerStudentValue));

            }else{
                JOptionPane.showMessageDialog(null, "No Examiner found with ID "+idString);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private void ayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayActionPerformed

    private void amountPerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountPerStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountPerStudentActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        String numberOfStudentAppearedString = this.studentAppeared.getText();
        String amountPerStudentString = this.amountPerStudent.getText();

        int numberOfStudentAppeared = Integer.parseInt(numberOfStudentAppearedString);
        float  amountPerStudent = Float.parseFloat(amountPerStudentString);
        float totalAmount = numberOfStudentAppeared * amountPerStudent;
        this.totalAmount.setText(Float. toString(totalAmount));
    }//GEN-LAST:event_calculateActionPerformed

    private void internalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_internalNameActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String id = this.id.getText();
        int idInteger = Integer.parseInt(id);
        String email = this.email.getText();
        String password = this.password.getText();
        String ay = this.ay.getText();
        String semester = (String)this.semester.getSelectedItem();
        String branch = (String)this.branch.getSelectedItem();
        String division = (String)this.division.getSelectedItem();
        String exam = (String)this.exam.getSelectedItem();
        String internalName = this.internalName.getText();
        String externalName = this.externalName.getText();
        String mobile = this.mobile.getText();
        String accountNumber = this.accountNumber.getText();
        String ifsc = this.ifsc.getText();
        String bankBranch = this.bankBranch.getText();
        String bankAddress = this.bankAddress.getText();
        String numberOfStudentAppearedString = this.studentAppeared.getText();
        String amountPerStudentString = this.amountPerStudent.getText();
        
        int numberOfStudentAppeared = Integer.parseInt(numberOfStudentAppearedString);
        float  amountPerStudent = Float.parseFloat(amountPerStudentString);
        
        try
        {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            String query = "UPDATE Examiner "+
                    "SET Email='"+email+"',"+
                    "Password='"+password+"',"+
                    "Academic_Year='"+ay+"',"+
                    "Semester='"+semester+"',"+
                    "Branch='"+branch+"',"+
                    "Division='"+division+"',"+
                    "Exam='"+exam+"',"+
                    "Internal_Name='"+internalName+"',"+
                    "External_Name='"+externalName+"',"+
                    "Mobile_Number='"+mobile+"',"+
                    "Account_Number='"+accountNumber+"',"+
                    "IFSC='"+ifsc+"',"+
                    "Bank_Branch='"+bankBranch+"',"+
                    "Bank_Address='"+bankAddress+"',"+
                    "Number_of_Student="+numberOfStudentAppeared+","+
                    "Amount_per_Student="+amountPerStudent+" "+
                    "WHERE ID="+idInteger+";"
                    ;
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Failed");
//            setVisible(false);
//            new home().setVisible(true);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(updateExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateExaminer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateExaminer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumber;
    private javax.swing.JTextField amountPerStudent;
    private javax.swing.JTextField ay;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bankAddress;
    private javax.swing.JTextField bankBranch;
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JButton calculate;
    private javax.swing.JComboBox<String> division;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> exam;
    private javax.swing.JTextField externalName;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField id;
    private javax.swing.JTextField ifsc;
    private javax.swing.JButton ifscSearchBtn;
    private javax.swing.JTextField internalName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JTextField studentAppeared;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}