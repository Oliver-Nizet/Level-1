import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabel;
	JLabel drumLabel2;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame frame = new JFrame();
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the size of the frame
		frame.setSize(new Dimension(200, 200));
		// 4. Set the title of the frame
		frame.setTitle("Drum Kit");
		// 5. Make a JPanel and initialize it.
		JPanel panel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		frame.add(panel);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse
		// project under "default package".
		// 8. Put the name of your image in a String variable.
		String drumImageFileName = "drum1.jpg";
		String drumImageFileName2 = "drum2.jpg";
		// 9. Use the "createImage()" method to initialize the drumImage variable.
		drumLabel = createImage(drumImageFileName);
		drumLabel2 = createImage(drumImageFileName2);
		// 10. Add the image to the panel
		drumLabel.setSize(100, 100);
		drumLabel2.setSize(100, 100);
		panel.add(drumLabel);
		panel.add(drumLabel2);
		// 11. Set the layout of the panel to "new GridLayout()"
		panel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		frame.pack();
		// 13. add a mouse listener to your drumImage.
		drumLabel.addMouseListener(this);
		drumLabel2.addMouseListener(this);
		frame.pack();
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("Mouse Click");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". There are
		// some sounds here: http://bit.ly/drum-sounds or you can also get them from
		// freesound.org
		// 16. If they clicked on the drumImage...
		if (drumClicked.equals(drumLabel)) {
			// 17. ...use the playSound method to play a drum sound.
			playSound("drum1sound.wav");
		} else if (drumClicked.equals(drumLabel2)) {
			// 17. ...use the playSound method to play a drum sound.
			playSound("drum2sound.aiff");
		}

		// 18. Add more images to make a drumkit. Remember to add a mouse listener to
		// each one.
	}

	private JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		ImageIcon icon = new ImageIcon(imageURL);
		Image img = icon.getImage();
		img = img.getScaledInstance(690, 690, 0);
		icon.setImage(img);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
