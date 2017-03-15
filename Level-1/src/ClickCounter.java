import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClickCounter implements ActionListener {
	int c = 0;

	public static void main(String[] args) {

		ClickCounter clickcounter = new ClickCounter();
	}

	Dimension d = new Dimension(900, 900);
	JButton button = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	ClickCounter() {

		frame.add(panel);
		frame.setVisible(true);
		button.setPreferredSize(d);
		button.setFont(new Font("Arial", Font.PLAIN, 170));
		button.setText("Clicks: 0");
		button.addActionListener(this);
		panel.add(button);
		frame.pack();
		frame.setTitle("Click Counter");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (e.getSource() == button) {
			c++;
			button.setText("Clicks: " + c);
		}
		frame.pack();
	}
}