import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JPanel panel;
	JFrame frame;
	JButton button;
	JTextField input;
	JTextField answer;

	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
	}

	BinaryConverter() {
		panel = new JPanel();
		frame = new JFrame();
		button = new JButton();
		input = new JTextField();
		answer = new JTextField();
		frame.add(panel);
		panel.add(input);
		panel.add(button);
		panel.add(answer);
		input.setText("                    ");
		answer.setText("                    ");
		button.setText("Convert");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input2 = input.getText();
		answer.setText(convert(input2));
	}
}
