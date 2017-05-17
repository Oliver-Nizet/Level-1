import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	int score  = 0;
	char currentLetter =  generateRandomLetter() ;
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
	}
	TypingTutor(){
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.addKeyListener(this);
		label.setText(" " + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		label.setVisible(true);
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(currentLetter == e.getKeyChar()){
			score++;
			System.out.println("You are speshul. Your score is " + score  + ".");
		} else {
			score--;
			System.out.println("YOU ARE TRASH! YOUR SCORE IS " + score + "!");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(" " + currentLetter);
	}
}
