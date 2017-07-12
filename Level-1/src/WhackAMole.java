import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
	}

	JFrame frame;
	JPanel panel;
	JButton button;
	JButton molebutton;
	int molesWhacked = 0;
	int molesMissed = 0;
	Date timeStart;

	WhackAMole() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		timeStart = new Date();
		panel.setBackground(new Color(0, 153, 0));
		drawButtons();
	}

	void drawButtons() {
		frame.setVisible(false);
		panel.removeAll();
		int mole = new Random().nextInt(20);
		for (int i = 0; i < 20; i++) {
			button = new JButton();
			button.addActionListener(this);
			button.setOpaque(true);
			button.setBackground(new Color(132, 86, 18));
			button.setForeground(new Color(132, 86, 18));
			if (i == mole) {
				button.setText("MOLE!");
				molebutton = button;
			} else {
				button.setText("");
			}
			panel.add(button);
		}
		if (molesWhacked == 10) {
			endGame(timeStart, molesWhacked);
		}
		frame.setSize(350, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (molebutton == e.getSource()) {
			molesWhacked++;
			molesMissed = 0;
			playSound("homer-doh.wav");
		} else {
			if (molesMissed == 0) {
				speak("Bro you suck!");
			} else if (molesMissed == 1) {
				speak("Bro what the crap!");
			} else if (molesMissed == 2) {
				speak("Bro get a life!");
			} else {
				speak("Bro you're a freakin waste of atoms");
				molesMissed = -1;
			}
			molesMissed++;
		}
		drawButtons();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
