import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Hw3 extends JFrame {
    private JLabel la = new JLabel("C");

    public Hw3(){
        setTitle("hw3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int minX = 0;
                int maxX = 250;
                int minY = 0;
                int maxY = 250;

                Random random = new Random();
                int randomX = random.nextInt(maxX - minX + 1) + minX;
                int randomY = random.nextInt(maxY - minY + 1) + minY;

                la.setLocation(randomX, randomY);
            }
        });
		
		c.setLayout(null);
		la.setSize(50, 50);
		la.setLocation(30, 20);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
    }

    public static void main(String[] args) {
        new Hw3();
    }
}
