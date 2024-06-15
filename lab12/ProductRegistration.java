import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductRegistration {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Task 3");
        jf.setSize(500, 500);
        jf.setLayout(null); // Disable layout manager

        // Creating the title label
        JLabel jLabel = new JLabel("REGISTER YOUR NEW PRODUCT", JLabel.CENTER);
        jLabel.setFont(new Font("JOST",Font.BOLD,16));
        jLabel.setBounds(100, 20, 300, 30);

        // Creating the input labels and fields
        JLabel productNameLabel = new JLabel("Enter product name:", JLabel.CENTER);
        JTextField productNameField = new JTextField();
        productNameLabel.setBounds(100, 80, 150, 20);
        productNameField.setBounds(250, 80, 150, 20);

        JLabel productType = new JLabel("Product Type:", JLabel.CENTER);
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Local");
        JRadioButton rb2 = new JRadioButton("Foreign");
        rb1.setBounds(250, 120, 75, 20);
        rb2.setBounds(325, 120, 75, 20);
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);

        productType.setBounds(100, 120, 150, 20);


        JLabel productDesc = new JLabel("Enter product description:", JLabel.RIGHT);
        JTextArea prodDescField = new JTextArea();
        productDesc.setBounds(100, 160, 150, 20);
        prodDescField.setBounds(260, 160, 150, 100);

        // Creating the registration button
        JButton jButton = new JButton("Register");
        jButton.setBounds(200, 400, 100, 30);

        // Adding action listener to the button
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "Registered Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adding components to the frame
        jf.add(jLabel);
        jf.add(productNameLabel);
        jf.add(productNameField);
        jf.add(productType);
        jf.add(rb1);
        jf.add(rb2);
        jf.add(productDesc);
        jf.add(prodDescField);
        jf.add(jButton);
        jf.setVisible(true);
    }
}
