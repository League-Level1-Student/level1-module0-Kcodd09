package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://i0.wp.com/www.redpandanetwork.org/wp-content/uploads/2020/07/28138502587_a0a020ae9a_k.jpg?fit=1024%2C683&ssl=1";
		// 2. create a variable of type "Component" that will hold your image
		
		// 3. use the "createImage()" method below to initialize your Component
		Component component = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String Question1 = JOptionPane.showInputDialog("What type of animal is shown?");
		// 7. print "CORRECT" if the user gave the right answer
		if(Question1.equalsIgnoreCase("red panda")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/03/11/10/singapore.jpg";
		// 11. add the second image to the quiz window
		Component component2 = createImage(image2);
		quizWindow.add(component2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String q2 = JOptionPane.showInputDialog("Which city is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(q2.equalsIgnoreCase("singapore")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		quizWindow.remove(component2);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
