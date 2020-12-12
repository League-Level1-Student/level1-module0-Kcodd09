package _01_houses;

import java.awt.Color;

public class HousesRunner {
	
	public static void main(String[] args) {

		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.setUpRobot();
		houseBuilder.run("small", Color.RED);
		houseBuilder.run("medium", Color.blue);
		houseBuilder.run("medium", Color.gray);
		houseBuilder.run("large", Color.pink);
		houseBuilder.run("medium", Color.CYAN);
		houseBuilder.run("large", Color.black);
		houseBuilder.run("small", Color.green);
		houseBuilder.run("small", Color.darkGray);
		houseBuilder.run("large", Color.red);
		houseBuilder.run("medium", Color.yellow);


	}

}
