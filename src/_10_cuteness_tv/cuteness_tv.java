package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class cuteness_tv implements ActionListener {
	

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		panel.add(button2);
		frame.pack();
		button2.addActionListener(this);
		panel.add(button3);
		frame.pack();
		button3.addActionListener(this);
		button.setText("Duck video");
		button2.setText("Frog Video");
		button3.setText("Fluffy Unicorn Video");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == button) {
			System.out.println("button1");
			showDucks();
		}
		else if(buttonPressed == button2) {
			System.out.println("button2");
			showFrog();
		}
		else if(buttonPressed == button3) {
			System.out.println("button3");
			showFluffyUnicorns();
		}
				
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
