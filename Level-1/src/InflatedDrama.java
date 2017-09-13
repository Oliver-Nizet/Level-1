import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InflatedDrama implements MouseListener {
	JFrame frame;
	JPanel panel;
	String pic[] = { "JakePaul.jpg", "RiceGum.jpg", "KeemStar.jpg" };
	JLabel mom[];
	int index;

	public static void main(String[] args) {
		InflatedDrama id = new InflatedDrama();
	}

	InflatedDrama() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.addMouseListener(this);
		mom = new JLabel[pic.length];
		for (int i = 0; i < mom.length; i++) {
			mom[i] = loadImageFromComputer(pic[i]);
		}
		index = 0;
		panel.add(mom[index]);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("ur cool");
		frame.setVisible(false);
		panel.remove(mom[index]);
		index++;
		index = index % mom.length;
		panel.add(mom[index]);
		frame.pack();
		frame.setVisible(true);
		if (index == 0) {
			speak("hey i have no friends");
		}
		if (index == 1) {
			speak("hey i have a fake wife");
		}
		if (index == 2) {
			speak("hey i have friends");
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
