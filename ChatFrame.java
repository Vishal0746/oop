import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame {
    private JTextField textField;

    public ChatFrame() {
        setTitle("Chat Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createMenuBar();
        createComponents();

        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveAsItem = new JMenuItem("Save As");

        fileMenu.add(openItem);
        fileMenu.add(saveAsItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void createComponents() {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Enter a text:");
        panel.add(label, BorderLayout.NORTH);

        textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Send");
        JButton resetButton = new JButton("Reset");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(sendButton);
        buttonPanel.add(resetButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                // Perform action with the entered text
                System.out.println("Sending message: " + text);
                textField.setText("");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChatFrame();
            }
        });
    }
}
