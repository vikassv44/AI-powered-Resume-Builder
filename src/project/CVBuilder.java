package project;
//CVBuilder.java
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CVBuilder {

 public static void main(String[] args) {
     JFrame frame = new JFrame("CV Builder");
     frame.setSize(400, 400);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(null);

     // Labels and Text Fields
     JLabel nameLabel = new JLabel("Full Name:");
     nameLabel.setBounds(20, 20, 100, 30);
     JTextField nameField = new JTextField();
     nameField.setBounds(130, 20, 200, 30);

     JLabel emailLabel = new JLabel("Email:");
     emailLabel.setBounds(20, 60, 100, 30);
     JTextField emailField = new JTextField();
     emailField.setBounds(130, 60, 200, 30);

     JLabel phoneLabel = new JLabel("Phone:");
     phoneLabel.setBounds(20, 100, 100, 30);
     JTextField phoneField = new JTextField();
     phoneField.setBounds(130, 100, 200, 30);

     JLabel educationLabel = new JLabel("Education:");
     educationLabel.setBounds(20, 140, 100, 30);
     JTextField educationField = new JTextField();
     educationField.setBounds(130, 140, 200, 30);

     JLabel skillsLabel = new JLabel("Skills:");
     skillsLabel.setBounds(20, 180, 100, 30);
     JTextField skillsField = new JTextField();
     skillsField.setBounds(130, 180, 200, 30);

     // Submit Button
     JButton submitButton = new JButton("Generate CV");
     submitButton.setBounds(130, 230, 120, 40);

     submitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Get input values
             UserData userData = new UserData();
             userData.setFullName(nameField.getText());
             userData.setEmail(emailField.getText());
             userData.setPhone(phoneField.getText());
             userData.setEducation(educationField.getText());
             userData.setSkills(skillsField.getText());

             // Generate PDF
             ResumeGenerator generator = new ResumeGenerator();
             generator.createPdf("GeneratedResume.pdf", userData);

             JOptionPane.showMessageDialog(frame, "Resume Generated Successfully!");
         }
     });

     // Add components
     frame.add(nameLabel);
     frame.add(nameField);
     frame.add(emailLabel);
     frame.add(emailField);
     frame.add(phoneLabel);
     frame.add(phoneField);
     frame.add(educationLabel);
     frame.add(educationField);
     frame.add(skillsLabel);
     frame.add(skillsField);
     frame.add(submitButton);

     frame.setVisible(true);
 }
}
