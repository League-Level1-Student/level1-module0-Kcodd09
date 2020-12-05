package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.miniaturize();
		rob.setX(700);
		rob.setY(500);
		run("small", "green");
		run("medium", "blue");	
		run("large", "gray");
	}
	public static void run(String size, String color) {
		int height;
		
		if(size.equalsIgnoreCase("small")) {
			height = 60;
			rob.penDown();
			rob.setPenColor(Color.getColor(color));
			rob.setSpeed(20);
			rob.move(height);
			rob.turn(-90);
			rob.move(25);
			rob.turn(-90);
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
		else if(size.equalsIgnoreCase("medium")) {
			height = 120;
			rob.setPenColor(Color.getColor(color));
			rob.penDown();
			rob.setSpeed(20);
			rob.move(height);
			rob.turn(-90);
			rob.move(25);
			rob.turn(-90);
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
		else {
			height = 250;
			rob.setPenColor(Color.getColor(color));
			rob.penDown();
			rob.setSpeed(20);
			rob.move(height);
			rob.turn(-90);
			rob.move(25);
			rob.turn(-90);
			rob.move(height);
			rob.turn(90);
			rob.setPenColor(10, 200, 35);
			rob.move(20);
			rob.turn(90);
		}
	}
}
