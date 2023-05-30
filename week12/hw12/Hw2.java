import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Hw2 extends JFrame {
    private static final int MIN_FONT_SIZE = 5;
    private static final int FONT_SIZE_INCREMENT = 5;
    private JLabel la = new JLabel();

    public Hw2(){
        setTitle("Key Listener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

        la.setText("Love Java");
			
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {

			if(e.getKeyChar() == '+')
                increaseFontSize(la);
			else if(e.getKeyChar() == '-')
                decreaseFontSize(la);
		}
	}

    private static void increaseFontSize(JLabel label) {
        Font currentFont = label.getFont();
        int currentSize = currentFont.getSize();
        int newSize = Math.max(currentSize + FONT_SIZE_INCREMENT, MIN_FONT_SIZE);
        Font newFont = currentFont.deriveFont(Font.PLAIN, newSize);
        label.setFont(newFont);
    }

    private static void decreaseFontSize(JLabel label) {
        Font currentFont = label.getFont();
        int currentSize = currentFont.getSize();
        int newSize = Math.max(currentSize - FONT_SIZE_INCREMENT, MIN_FONT_SIZE);
        Font newFont = currentFont.deriveFont(Font.PLAIN, newSize);
        label.setFont(newFont);
    }

    public static void main(String[] args) {
        new Hw2();
    }

}
