import javax.swing.*;
import java.awt.*;
public class Homework1 extends JFrame {
    public Homework1() {
        setTitle("GridLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        Color[] colors = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.MAGENTA, Color.BLUE, Color.PINK, Color.GRAY,
            Color.PINK, Color.gray, Color.WHITE, Color.GREEN,
            Color.BLACK, Color.ORANGE, Color.MAGENTA, Color.CYAN,
        };

        for (int i = 0; i < 16; i++) {
            JPanel panel = new JPanel();
            panel.setBackground(colors[i]);
            add(panel);
        }

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        Homework1 frame = new Homework1();
    }
}
