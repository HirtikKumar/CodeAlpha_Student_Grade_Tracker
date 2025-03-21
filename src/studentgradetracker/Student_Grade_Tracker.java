/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentgradetracker;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Student_Grade_Tracker extends javax.swing.JFrame {
private ArrayList<Integer> grades;
    /**
     * Creates new form Student_Grade_Tracker
     */
    public Student_Grade_Tracker() {
         grades = new ArrayList<>();
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
        gradeInputField = new javax.swing.JTextField();
        addGradeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        CalculateBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 247, 250));
        jPanel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 87, 155));
        jLabel1.setText("STUDENT GRADE TRACKER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 87, 155));
        jLabel2.setText("Enter Student Grade :");

        gradeInputField.setBackground(new java.awt.Color(255, 255, 255));
        gradeInputField.setForeground(new java.awt.Color(2, 136, 209));
        gradeInputField.setCaretColor(new java.awt.Color(2, 136, 209));
        gradeInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeInputFieldActionPerformed(evt);
            }
        });

        addGradeBtn.setBackground(new java.awt.Color(2, 136, 209));
        addGradeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addGradeBtn.setText("Add Grade");
        addGradeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addGradeBtnMouseClicked(evt);
            }
        });

        TextArea.setBackground(new java.awt.Color(102, 204, 255));
        TextArea.setColumns(20);
        TextArea.setForeground(new java.awt.Color(0, 0, 102));
        TextArea.setRows(5);
        TextArea.setText("\n");
        jScrollPane1.setViewportView(TextArea);

        CalculateBtn.setBackground(new java.awt.Color(2, 136, 209));
        CalculateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CalculateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalculateBtn.setText("Calculate");
        CalculateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculateBtnMouseClicked(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(2, 136, 209));
        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(gradeInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addGradeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalculateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gradeInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addGradeBtn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(CalculateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ResetBtn)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeInputFieldActionPerformed

    private void addGradeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGradeBtnMouseClicked
        // TODO add your handling code here:
        try {
            int grade = Integer.parseInt(gradeInputField.getText());
            if (grade >= 0) {
         grades.add(grade);
                TextArea.append(gradeInputField.getText() + "\n");
            } else {
                TextArea.append("Negative numbers are not allowed.\n");
            }
            gradeInputField.setText("");
        } catch (NumberFormatException ex) {
            TextArea.append("Please enter a valid number.\n");
            gradeInputField.setText("");}

    }//GEN-LAST:event_addGradeBtnMouseClicked

    private void CalculateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculateBtnMouseClicked
        // TODO add your handling code here:
        if (grades.isEmpty()) {
    TextArea.append("No grades to calculate.\n");
} else {
    int sum = 0;
    int highest = grades.get(0);
    int lowest = grades.get(0);

    for (int grade : grades) {
        sum += grade;
        if (grade > highest) {
            highest = grade;
        }
        if (grade < lowest) {
            lowest = grade;
        }
    }

    double average = sum / (double) grades.size();

    // Display the results
    TextArea.append("\nAverage score: " + average);
    TextArea.append("\nHighest score: " + highest);
    TextArea.append("\nLowest score: " + lowest + "\n");
}
    }//GEN-LAST:event_CalculateBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        // TODO add your handling code here:
        TextArea.setText("");
    }//GEN-LAST:event_ResetBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Student_Grade_Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Grade_Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Grade_Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Grade_Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Grade_Tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton addGradeBtn;
    private javax.swing.JTextField gradeInputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
