import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleLabel {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Task 1");
        jf.setSize(300, 200);

//        CREATING A TITLE
        JLabel jLabel = new JLabel("JAVA Swing Lab 12", JLabel.CENTER);
        jLabel.setSize(100, 75);


//        CREATING A BUTTON
        JButton jButton = new JButton("SHOW DIALOGUE!");
        jButton.setBounds(50, 50, 100, 50);

//        ADDING ACTION LISTENER ON BUTTON
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf,
                        "THIS IS JAVA SWING LAB", "Dialogue", JOptionPane.INFORMATION_MESSAGE);
            }
        });
// Create panels to center the components
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(jLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(jButton);

        // Set layout of the frame
        jf.setLayout(new BorderLayout());
        jf.add(titlePanel, BorderLayout.NORTH);
        jf.add(buttonPanel, BorderLayout.SOUTH);

        jf.setVisible(true);
    }
}
