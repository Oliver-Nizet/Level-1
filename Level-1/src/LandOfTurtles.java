import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	JFrame frame;
	MultiTurtlePanel panel;
	public LandOfTurtles(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(2000, 1000);
		
	}
	void addPanel(MultiTurtlePanel panel){
		frame.add(panel);
		this.panel = panel;
	}
	void addTurtle(){
		for (int i = 0; i < 50; i++) {
			Turtle t = new Turtle();
			panel.addTurtle(t);
			t.show();
			t.setX(new Random().nextInt(1000)+1000);
			t.setY(new Random().nextInt(600)+400);
		}
	}
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "http://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		//galapagosIslands = "file://beach.jpg";
		LandOfTurtles lot = new LandOfTurtles();
// 1. Create a frame & make it visible
		
		// 2. Add the panel to the frame
		lot.addPanel(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		lot.addTurtle();
// 5. Add the turtle to the panel 
		
		// 6. Put 50 Turtles on the beach

	}
}
