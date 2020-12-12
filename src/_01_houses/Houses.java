package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
	}
	public void setUpRobot() {
		rob.miniaturize();
		rob.setX(600);
		rob.setY(500);
	}
	public void run(String size, Color color) {
		int height;

		if(size.equalsIgnoreCase("small")) {
			height = 60;
			rob.penDown();
			rob.setPenColor(color);
			rob.setSpeed(20);
			rob.move(height);
			drawPointyRoof();
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
		else if(size.equalsIgnoreCase("medium")) {
			height = 120;
			rob.setPenColor(color);
			rob.penDown();
			rob.setSpeed(20);
			rob.move(height);
			drawPointyRoof();
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
		else {
			height = 250;
			rob.setPenColor(color);
			rob.penDown();
			rob.setSpeed(20);
			rob.move(height);
			drawFlatRoof();
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
	}
	public static void drawPointyRoof() {
		rob.turn(-45);
		rob.move(25);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-45);
	}
	public static void drawFlatRoof() {
	rob.turn(-90);
	rob.move(25);
	rob.turn(-90);
	}
}
