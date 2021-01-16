package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
	JButton button = new JButton();
	int counter = 0;
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		button.setText("Surprise! :)");
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton button = (JButton) arg0.getSource();
		// TODO Auto-generated method stub
		if (button == this.button) {
			counter++;
		}
		if (counter == 5) {
			showPicture("jackInTheBox.png");
		}
	}
}
