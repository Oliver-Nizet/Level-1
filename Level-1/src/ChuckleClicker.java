import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;;

public class ChuckleClicker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton joke;
	JButton punchline;

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
	}

	ChuckleClicker() {
		frame = new JFrame();
		panel = new JPanel();
		joke = new JButton();
		punchline = new JButton();
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("Joke");
		punchline.setText("Punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "What do skeletons say before eating?");
		} else {
			JOptionPane.showMessageDialog(null, "Bone Appetite!");
		}

	}
}
