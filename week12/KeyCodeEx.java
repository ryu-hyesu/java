package week12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Listener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
			
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar() == '%')
				getContentPane().setBackground(Color.yellow);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				getContentPane().setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
