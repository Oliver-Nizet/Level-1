import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad implements KeyListener {
	JFrame frame;
	JPanel topPanel;
	JPanel panel;
	JPanel bottomPanel;
	JButton call;
	JTextField number;
	JButton[] button;

	public static void main(String[] args) {
		KeyPad kp = new KeyPad();
	}

	KeyPad() {
		frame = new JFrame();
		FlowLayout fl = new FlowLayout();
		frame.setLayout(fl);
		topPanel = new JPanel();
		number = new JTextField();
		topPanel.add(number);
		panel = new JPanel();
		call = new JButton();
		button = new JButton[12];
		frame.add(panel);

		call.setText("Call");
		for (int i = 0; i < 12; i++) {
			button[i] = new JButton("" + i);
			panel.add(button[i]);
		}
		bottomPanel = new JPanel();
		bottomPanel.add(call);
		frame.add(bottomPanel);
		button[11].setText("");
		button[10].setText("");
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
