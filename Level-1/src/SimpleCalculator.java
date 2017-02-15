import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.IOException;
public class SimpleCalculator implements ActionListener{
	JFrame jframe;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	JTextField num1;
	JTextField num2;
	JPanel numbers;
	JPanel buttons;
	JPanel answer;
	JTextArea output;
	GridLayout rows;
	
	SimpleCalculator(){
		jframe = new JFrame();
		jframe.setVisible(true);
		add = new JButton();
		sub = new JButton();
		mul = new JButton();
		div = new JButton();
		num1 = new JTextField();
		num2 = new JTextField();
		output = new JTextArea();
		rows = new GridLayout(3,1);
		numbers = new JPanel();
		buttons = new JPanel();
		answer = new JPanel();
		jframe.setLayout(rows);
		buttons.add(add);
		buttons.add(sub);
		buttons.add(mul);
		buttons.add(div);
		numbers.add(num1);
		numbers.add(num2);
		answer.add(output);
		jframe.add(numbers);
		jframe.add(buttons);
		jframe.add(answer);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		jframe.setTitle("Simple Calculator");
		add.setText("+");
		sub.setText("-");
		mul.setText("x");
		div.setText("÷");
		num1.setText("Number 1");
		num2.setText("Number 2");
		output.setText("Put in Two Numbers and Press an Operator");
		jframe.pack();
		speak("Put in Two Numbers and Press an Operator");
	}
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner s = new Scanner(System.in);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
		
		String leftText = num1.getText();
		String rightText = num2.getText();
		float leftyText = Float.parseFloat(leftText);
		float rightyText = Float.parseFloat(rightText);
		if (e.getSource()==add) {
			float addAnswer = leftyText + rightyText;
			String addyAnswer = Float.toString(addAnswer);
			output.setText("Answer: " + addyAnswer);
			speak("The answer is " + addyAnswer);
		}
		if (e.getSource()==sub) {
			float subAnswer = leftyText - rightyText;
			String subyAnswer = Float.toString(subAnswer);
			output.setText("Answer: " + subyAnswer);
			speak("The answer is " + subyAnswer);
		}
		if (e.getSource()==mul) {
			float mulAnswer = leftyText * rightyText;
			String mulyAnswer = Float.toString(mulAnswer);
			output.setText("Answer: " + mulyAnswer);
			speak("The answer is " + mulyAnswer);
		}
		if (e.getSource()==div) {
			float divAnswer = leftyText / rightyText;
			String divyAnswer = Float.toString(divAnswer);
			output.setText("Answer: " + divyAnswer);
			speak("The answer is " + divyAnswer);
		}
		} catch (Exception e2) {
			output.setText("Put in Valid Numbers");
			speak("Put in Valid Numbers");
		}
	}
	static void speak(String words) {
	   	try {
	   		Runtime.getRuntime().exec("say " + words).waitFor();
	   	} catch (Exception e) {
	   		e.printStackTrace();
	   	}
	}
}

