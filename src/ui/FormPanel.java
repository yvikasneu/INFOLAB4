/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.User;

/**
 *
 * @author vikas
 */
public class FormPanel extends javax.swing.JPanel {
    
    JFileChooser chooser;
    BufferedImage img;
    String filename;
    File file ; 
    JPanel bottomPanel; 
    
    public FormPanel(JPanel bottomPanel){
         this.bottomPanel = bottomPanel;
         
        initComponents();
    }


    /**
     * Creates new form FormPanel
     */
    public FormPanel() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        genderButton = new javax.swing.ButtonGroup();
        mainPanel1 = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        firstNameLabel1 = new javax.swing.JLabel();
        firstNameInput1 = new javax.swing.JTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        lastNameInput1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        emailInput1 = new javax.swing.JTextField();
        ageInput1 = new javax.swing.JTextField();
        ageLabel1 = new javax.swing.JLabel();
        messageLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageInput1 = new javax.swing.JTextArea();
        submitButton1 = new javax.swing.JButton();
        imageButton1 = new javax.swing.JButton();
        imageLabel1 = new javax.swing.JLabel();
        targetImage1 = new javax.swing.JLabel();
        patientTypeLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        patientTypeLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setPreferredSize(new java.awt.Dimension(700, 500));

        mainPanel1.setBackground(new java.awt.Color(253, 206, 68));
        mainPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        titleLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        titleLabel1.setText("Patient Registration Form");

        firstNameLabel1.setText("First Name");

        lastNameLabel1.setText("Last Name");

        emailLabel1.setText("Email");

        ageLabel1.setText("Age");

        messageLabel1.setText("Message");

        messageInput1.setColumns(20);
        messageInput1.setRows(5);
        jScrollPane2.setViewportView(messageInput1);

        submitButton1.setBackground(new java.awt.Color(0, 0, 0));
        submitButton1.setForeground(new java.awt.Color(255, 255, 255));
        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        imageButton1.setText("Choose Image");
        imageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButton1ActionPerformed(evt);
            }
        });

        imageLabel1.setText("Select Profile Image");

        targetImage1.setText("No Image Selected");

        patientTypeLabel.setText("Patinent Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emergey", "General", "Pedatric" }));

        patientTypeLabel1.setText("Gender");

        genderButton.add(jRadioButton2);
        jRadioButton2.setText("Male");
        jRadioButton2.setActionCommand("MALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        genderButton.add(jRadioButton3);
        jRadioButton3.setText("Female");
        jRadioButton3.setActionCommand("FEMALE");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        genderButton.add(jRadioButton4);
        jRadioButton4.setText("Others");
        jRadioButton4.setActionCommand("OTHERS");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(titleLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel1Layout.createSequentialGroup()
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameLabel1)
                                    .addComponent(ageInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameLabel1)
                                    .addComponent(emailInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel1))))
                        .addGap(68, 68, 68))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel1Layout.createSequentialGroup()
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageLabel1)
                                    .addGroup(mainPanel1Layout.createSequentialGroup()
                                        .addComponent(imageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(targetImage1)))
                                .addGap(86, 86, 86))
                            .addComponent(patientTypeLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(204, 204, 204))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLabel1)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientTypeLabel1)
                                    .addGroup(mainPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel1)
                .addGap(18, 18, 18)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanel1Layout.createSequentialGroup()
                        .addComponent(firstNameLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(lastNameLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(ageLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addComponent(emailLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(messageLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeLabel)
                    .addComponent(patientTypeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetImage1))
                .addGap(18, 18, 18)
                .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
         // TODO add your handling code here:
          // TODO add your handling code here:
        String firstName = firstNameInput1.getText();
        String lastName = lastNameInput1.getText();
        String age = ageInput1.getText(); 
        String email = emailInput1.getText();
        String message = messageInput1.getText();
        String type = jComboBox1.getSelectedItem().toString();
        String gender = "";
        
        if(genderButton.getSelection() != null){
           gender = genderButton.getSelection().toString();
        }
        
  
         System.out.println(gender);
       

            Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
            Matcher isValidEmail = pattern.matcher(email);
           
           
           if(firstName.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid First Name", "Validation Error", HEIGHT);
        }else if (lastName.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Last Name", "Validation Error", HEIGHT);
        } else if(age.length() == 0 || !age.chars().allMatch(Character::isDigit) ) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Validation Error", HEIGHT);
        } else if(email.length() == 0 || !isValidEmail.matches()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Email", "Validation Error", HEIGHT);
        } else if (message.length() == 0) {
            JOptionPane.showMessageDialog(this, "Message Should not empty", "Validation Error", HEIGHT);
        } 
        else if (gender == "") {
            JOptionPane.showMessageDialog(this, "Please select your gender", "Validation Error", HEIGHT);
        }
        else if (file == null ){
         JOptionPane.showMessageDialog(this, "Please select the profile image", "Validation Error", HEIGHT);
        } else {
            
            
            
            
            try {
            img=ImageIO.read(file);
            ImageIcon icon = new ImageIcon(img); 
            
            User user = new User(); 
            user.setAge(age);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setType(type);
            user.setGender(gender);
            user.setMessage(message);
            user.setIcon(icon);
            
            
            ViewPanel newViewPanel = new ViewPanel(user); 
            bottomPanel.add(newViewPanel);

            CardLayout layout = (CardLayout) bottomPanel.getLayout(); 
            layout.next(bottomPanel);   
            
            

            }  catch(IOException e2){}
            
        }
                        
       
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void imageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButton1ActionPerformed
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        
        try {
            img=ImageIO.read(file);
            ImageIcon icon = new ImageIcon(img); // ADDED
            targetImage1.setIcon(icon);
            targetImage1.setText("");

            targetImage1.setPreferredSize(new Dimension(icon.getIconWidth(),icon.getIconHeight())); // ADDED

            targetImage1.revalidate(); // ADDED
            targetImage1.repaint(); // ADDED
                        
        }
        catch(IOException e1) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_imageButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageInput1;
    private javax.swing.JLabel ageLabel1;
    private javax.swing.JTextField emailInput1;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField firstNameInput1;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.ButtonGroup genderButton;
    private javax.swing.JButton imageButton1;
    private javax.swing.JLabel imageLabel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameInput1;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JTextArea messageInput1;
    private javax.swing.JLabel messageLabel1;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JLabel patientTypeLabel1;
    private javax.swing.JButton submitButton1;
    private javax.swing.JLabel targetImage1;
    private javax.swing.JLabel titleLabel1;
    // End of variables declaration//GEN-END:variables
}
