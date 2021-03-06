/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import business.EcoSystem;
import business.datageneration.FetchCityIndicatorsLive;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import utilities.validation.Validation;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import reports.LinearRegressionModel;
import reports.RegressionModel;

/**
 *
 * @author dsain
 */
public class PatientRoleJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    /**
     * Creates new form PatientRoleJPanel
     */
   
 public PatientRoleJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
       
        
    }
public static double ageVsBloodPressure(int inputage) { //linear regression
        Scanner scanAge = new Scanner(System.in);
        double[] age = {5, 14, 23, 32, 43, 40, 45, 53};

        double[] bloodPressure = {100, 110, 120, 133, 137, 138, 150, 153};

        RegressionModel model = new LinearRegressionModel(age, bloodPressure);
        model.compute();
        double[] coefficients = model.getCoefficients();

        System.out.printf("Output from our code: y = %.4f + %.4fx", coefficients[0], coefficients[1]);

        System.out.println("\n \n Predict bloodpressure for age \n");

//        int inputAge = Integer.parseInt(inputTextField.getText());
        
        double predictedOutput= model.evaluateAt(inputage);


        System.out.println("The predicated blood pressure at age: " + inputage + "\n blood pressure: \n" + predictedOutput);
        return predictedOutput;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        agetf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        predictBPButton = new javax.swing.JButton();
        outputlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        weightTextField1 = new javax.swing.JTextField();
        heightTextField2 = new javax.swing.JTextField();
        heartRateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numberOfStpesTextField4 = new javax.swing.JTextField();
        distanceTextField = new javax.swing.JTextField();
        savejButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        nameLabel11 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to Patient Home Screen");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 330, 59));
        add(agetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 120, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, 20));

        predictBPButton.setBackground(new java.awt.Color(0, 0, 0));
        predictBPButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        predictBPButton.setForeground(new java.awt.Color(255, 255, 255));
        predictBPButton.setText("Predict BP");
        predictBPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictBPButtonActionPerformed(evt);
            }
        });
        add(predictBPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 170, 50));

        outputlabel.setBackground(new java.awt.Color(0, 0, 0));
        outputlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outputlabel.setForeground(new java.awt.Color(255, 255, 255));
        outputlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(outputlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 150, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ideal Blood Pressure");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 190, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Height");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Heart Rate");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vital Signs of an Average Day from a FITBIT");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Weight");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        weightTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextField1ActionPerformed(evt);
            }
        });
        add(weightTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 120, -1));
        add(heightTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 120, -1));

        heartRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateTextFieldActionPerformed(evt);
            }
        });
        add(heartRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of Steps");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Distance Covered");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));
        add(numberOfStpesTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 110, -1));
        add(distanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 110, -1));

        savejButton.setBackground(new java.awt.Color(0, 0, 0));
        savejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savejButton.setForeground(new java.awt.Color(255, 255, 255));
        savejButton.setText("Save Data For Health Insurance Analysis ");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });
        add(savejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 340, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("City");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, 20));
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 100, -1));

        nameLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel11.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel11.setText("Name");
        add(nameLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });
        add(nametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        cityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("Live Data Feed");
        cityLabel.setToolTipText("");
        add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 250, 100));
        cityLabel.getAccessibleContext().setAccessibleName("Report");
    }// </editor-fold>//GEN-END:initComponents

    private void predictBPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictBPButtonActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        
                String in= agetf.getText();
                
        Validation v = new Validation();
        
           String blank = "";
        if (in.equals(blank)) {
            JOptionPane.showMessageDialog(null, "Age field can not be empty");
        } 
        
        else if(!v.numberWithSizeCheck(in, 2))
        {
             JOptionPane.showMessageDialog(null, "Age can only be a number between 0-100");
             
        }

        else{              
                
                int input=Integer.parseInt(in);
  
                
        
              
        double output= ageVsBloodPressure(input);
        
        outputlabel.setText(String.valueOf(output));
        }
    }//GEN-LAST:event_predictBPButtonActionPerformed

    private void weightTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextField1ActionPerformed

    private void heartRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateTextFieldActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
      Validation v = new Validation();
      
      String name= nametf.getText();
      String age= agetf.getText();
      String weight = weightTextField1.getText();
      String height= heightTextField2.getText();
      String heart= heartRateTextField.getText();
      
      String step= numberOfStpesTextField4.getText();
      String dist= distanceTextField.getText();
      
      
       if(!v.alphabetCheck(name))
        {
             JOptionPane.showMessageDialog(null, "Can only be alphabets");

        }
      
       else if((!v.numberCheck(age))||(!v.numberCheck(weight))||(!v.numberCheck(heart))||(!v.numberCheck(height))||(!v.numberCheck(step))||(!v.numberCheck(dist)))
        
        {
             JOptionPane.showMessageDialog(null, "Can only be (whole) numbers");

        }
       else{
        
        FileWriter pw;
        FileWriter pwname;
     try 
     {
         pw = new FileWriter("PatientData.txt",true);
         pwname= new FileWriter("PatientNames.txt",true);
         Random rand = new Random();
         
         StringBuffer sb = new StringBuffer();
         StringBuffer sb2 = new StringBuffer();
         FetchCityIndicatorsLive fci =new FetchCityIndicatorsLive(cityTextField.getText());
         String output = fci.generateData();
         
         int random2 = rand.nextInt(1);
         
         sb.append(System.getProperty("line.separator"));
         
         
         
         int random = rand.nextInt(20);
         
         sb.append(String.valueOf(random));
         sb.append(",");
         sb.append(String.valueOf(fci.val));
         sb.append(","); 
        
                
         sb.append(random2 == 1 ? 'Y' : 'N');
         
         pw.write(sb.toString());
         pw.close();
         
         
         
         
         cityLabel.setText(output);
         
         sb2.append(String.valueOf(nametf.getText()));
         sb2.append(System.getProperty("line.separator"));
         pwname.write(sb2.toString());
         pwname.close();
         
         
         JOptionPane.showMessageDialog(this, "Data Saved For Analysis");
         
         nametf.setEditable(false);
         agetf.setEditable(false);
         weightTextField1.setEditable(false);
         heightTextField2.setEditable(false);
         heartRateTextField.setEditable(false);
         numberOfStpesTextField4.setEditable(false);
         
         cityTextField.setEditable(false);
         distanceTextField.setEditable(false);
         
         
         
     } 
     catch (Exception ex) {
         Logger.getLogger(PatientRoleJPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
       // pw.append(TOOL_TIP_TEXT_KEY)
        
       }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetf;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField distanceTextField;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JTextField heightTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameLabel11;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField numberOfStpesTextField4;
    private javax.swing.JLabel outputlabel;
    private javax.swing.JButton predictBPButton;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField weightTextField1;
    // End of variables declaration//GEN-END:variables
}
