import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.getBackgroundWindow().setColor(Color.black);
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(7);
		Tortoise.hide();
		Tortoise.penUp();
		Tortoise.turn(238);
		Tortoise.move(350);
		Tortoise.turn(122);
		Tortoise.setSpeed(7);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.turn(-90);
		Tortoise.move(20);
		Tortoise.turn(180);
		Tortoise.move(20);
		Tortoise.turn(-90);
		for (int i = 0; i < 10; i++) {
			int randomHeight = new Random().nextInt(300);
			drawHouse(randomHeight);
		}
	}

	private static void drawHouse(int height) {
		Color c = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
		Tortoise.setPenColor(c);
		Tortoise.move(height);
		if (height > 150) {
			flatRoof();
		}
		if (height < 150) {
			pointyRoof();
		}
		Tortoise.move(height);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(180);
		Tortoise.move(70);
		Tortoise.turn(-90);
	}

	private static void pointyRoof() {
		Tortoise.turn(45);
		Tortoise.move(28);
		Tortoise.turn(90);
		Tortoise.move(28);
		Tortoise.turn(45);
	}

	private static void flatRoof() {
		Tortoise.turn(90);
		Tortoise.move(40);
		Tortoise.turn(90);
	}
}