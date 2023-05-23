import javax.swing.*;
import java.awt.*;

public class Homework2 extends JFrame {
    private JTextField textField;
    private JButton[][] buttons;
    private JTextField additionalTextField;
    private JLabel label;


    public Homework2() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        label = new JLabel("수식입력");
        inputPanel.add(label);

        textField = new JTextField(20);
        inputPanel.add(textField);
        add(inputPanel, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        buttons = new JButton[4][4];

        String[][] buttonText = {
            {"0", "1", "2", "3"},
            {"4", "5", "6", "7"},
            {"8", "9", "CE", "계산"},
            {"+", "-", "X", "/"}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j] = new JButton(buttonText[i][j]);
                panel.add(buttons[i][j]);
            }
        }

        add(panel, BorderLayout.CENTER);

        JPanel inputPanel2 = new JPanel(new FlowLayout());
        label = new JLabel("계산결과");
        inputPanel2.add(label);

        additionalTextField = new JTextField(20);
        inputPanel2.add(additionalTextField);
        add(inputPanel2, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Homework2 frame = new Homework2();
    }
}