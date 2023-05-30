import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hw1 extends JFrame {

    public Hw1(){
        JFrame frame = new JFrame("Color Change Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                contentPane.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                contentPane.setBackground(Color.GREEN);
            }
        });

        frame.setContentPane(contentPane);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Hw1();
    }
}
