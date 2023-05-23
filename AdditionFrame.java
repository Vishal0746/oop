import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionFrame extends JFrame {
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JLabel resultLabel;

    public AdditionFrame() {
        setTitle("Number Addition");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createComponents();

        setVisible(true);
    }

    private void createComponents() {
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel firstNumberLabel = new JLabel("Enter first number:");
        firstNumberTextField = new JTextField();

        JLabel secondNumberLabel = new JLabel("Enter second number:");
        secondNumberTextField = new JTextField();

        JLabel resultTextLabel = new JLabel("Result:");
        resultLabel = new JLabel();

        JButton addButton = new JButton("Add");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstNumber = Integer.parseInt(firstNumberTextField.getText());
                    int secondNumber = Integer.parseInt(secondNumberTextField.getText());
                    int result = firstNumber + secondNumber;
                    resultLabel.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AdditionFrame.this,
                            "Invalid input. Please enter valid numbers.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumberTextField.setText("");
                secondNumberTextField.setText("");
                resultLabel.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(firstNumberLabel);
        panel.add(firstNumberTextField);
        panel.add(secondNumberLabel);
        panel.add(secondNumberTextField);
        panel.add(resultTextLabel);
        panel.add(resultLabel);
        panel.add(addButton);
        panel.add(clearButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(exitButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdditionFrame();
            }
        });
    }
}
