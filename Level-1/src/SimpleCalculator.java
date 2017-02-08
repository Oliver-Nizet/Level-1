import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleCalculator {
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
		jframe.setTitle("Simple Calculator");
		add.setText("+");
		sub.setText("-");
		mul.setText("x");
		div.setText("÷");
		num1.setText("        ");
		num2.setText("        ");
		output.setText("                          ");
		jframe.pack();
	}
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner s = new Scanner(System.in);
	}
}
