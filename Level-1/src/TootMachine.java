import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton shortFart;
	JButton longFart;
	JButton loudFart;
	JButton averageFart;

	public static void main(String[] args) {
		TootMachine tm = new TootMachine();
	}

	TootMachine() {
		frame = new JFrame();
		panel = new JPanel();
		shortFart = new JButton();
		longFart = new JButton();
		loudFart = new JButton();
		averageFart = new JButton();
		frame.add(panel);
		panel.add(shortFart);
		panel.add(longFart);
		panel.add(averageFart);
		shortFart.addActionListener(this);
		longFart.addActionListener(this);
		averageFart.addActionListener(this);
		shortFart.setText("Short");
		longFart.setText("Long");
		averageFart.setText("Average");
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == shortFart) {
			playSound("shortFart.wav");
		} else if (e.getSource() == longFart) {
			playSound("longFart.wav");
		} else if (e.getSource() == averageFart) {
			playSound("averageFart.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
