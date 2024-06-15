import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Task 2");
        jf.setSize(500, 500);
        jf.setLayout(null); // Disable layout manager

        // Creating the title label
        JLabel jLabel = new JLabel("REGISTER YOUR NEW ACCOUNT", JLabel.CENTER);
        jLabel.setBounds(100, 20, 300, 30);

        // Creating the input labels and fields
        JLabel nameLabel = new JLabel("Enter your name:", JLabel.RIGHT);
        JTextField nameField = new JTextField();
        nameLabel.setBounds(100, 80, 150, 20);
        nameField.setBounds(280, 80, 150, 20);

        JLabel emailLabel = new JLabel("Enter your email:", JLabel.RIGHT);
        JTextField emailField = new JTextField();
        emailLabel.setBounds(100, 120, 150, 20);
        emailField.setBounds(280, 120, 150, 20);

        JLabel passwordLabel = new JLabel("Enter your password:", JLabel.RIGHT);
        JPasswordField passwordField = new JPasswordField();
        passwordLabel.setBounds(100, 160, 150, 20);
        passwordField.setBounds(280, 160, 150, 20);

        // Creating the registration button
        JButton jButton = new JButton("Register");
        jButton.setBounds(200, 200, 100, 30);

        // Adding action listener to the button
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "Registered Successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adding components to the frame
        jf.add(jLabel);
        jf.add(nameLabel);
        jf.add(nameField);
        jf.add(emailLabel);
        jf.add(emailField);
        jf.add(passwordLabel);
        jf.add(passwordField);
        jf.add(jButton);
        jf.setVisible(true);
    }
}
