import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example {

    private static JLabel messageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create buttons
        JButton redButton = createButton("All The Best", Color.RED);
        JButton purpleButton = createButton("All The Best", Color.MAGENTA);
        JButton blueButton = createButton("All The Best", Color.BLUE);
        JButton greenButton = createButton("All The Best", Color.GREEN);
        JButton skyBlueButton = createButton("All The Best", Color.CYAN);

        // Set layout
        frame.setLayout(new BorderLayout());

        // Create panel to hold the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 5));
        buttonPanel.add(redButton);
        buttonPanel.add(purpleButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(skyBlueButton);

        // Create label for displaying the message
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Add the button panel and message label to the frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(messageLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setForeground(color);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton sourceButton = (JButton) e.getSource();
                messageLabel.setText(messageLabel.getText() + " " + sourceButton.getText());
                messageLabel.setForeground(sourceButton.getForeground());
            }
        });
        return button;
    }
}
