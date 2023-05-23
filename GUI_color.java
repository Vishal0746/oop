package final_programs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextColorChanger extends JFrame implements ActionListener {
    private JLabel label;
    private JButton redButton;
    private JButton blueButton;

    public TextColorChanger() {
        setTitle("Text Color Changer");
        setLayout(new FlowLayout());

        label = new JLabel("Hello, World!");
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");

        redButton.addActionListener(this);
        blueButton.addActionListener(this);

        add(label);
        add(redButton);
        add(blueButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            label.setForeground(Color.RED);
        } else if (e.getSource() == blueButton) {
            label.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new TextColorChanger();
    }
}
