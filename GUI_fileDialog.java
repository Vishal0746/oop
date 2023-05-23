package final_programs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ChatFrame extends JFrame {
    private JButton openButton;
    private JButton saveButton;
    private JFileChooser fileChooser;
    private JTextArea textArea;

    public ChatFrame() {
        setTitle("File Dialog Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        openButton = new JButton("Open File");
        saveButton = new JButton("Save File");
        textArea = new JTextArea();

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        fileChooser = new JFileChooser();

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addContainerGap(150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(openButton)
                                .addComponent(saveButton)
                                .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap(150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addComponent(openButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addContainerGap(100, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void openFile() {
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Read file content
                String fileContent = readFileContent(selectedFile);
                textArea.setText(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Save file content
                String content = textArea.getText();
                writeFileContent(selectedFile, content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String readFileContent(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[1024];
            int length;
            while ((length = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, length);
            }
        }
        return sb.toString();
    }

    private void writeFileContent(File file, String content) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatFrame().setVisible(true);
            }
        });
    }
}






