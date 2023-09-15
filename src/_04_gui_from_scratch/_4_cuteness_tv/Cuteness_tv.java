package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Unicorn = new JButton();
	JButton Duck = new JButton();
	JButton Frog = new JButton();
	
	
	
	public Cuteness_tv()
	{
	
	
	frame.setVisible(true);
	Unicorn.setText("Unicorn");
		
		Frog.setText("Frog");
		panel.add(Frog);
		Frog.addActionListener(this);
		
		Unicorn.setText("Unicorn");
		panel.add(Unicorn);
		Unicorn.addActionListener(this);
		
		Duck.setText("Duck");
		panel.add(Duck);
		Duck.addActionListener(this);
		
		frame.add(panel);	
		
		
		
		frame.pack();
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
	
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		

		if (buttonPressed == Unicorn) {
			System.out.println("Unicorn");
			showFluffyUnicorns();

			}
		else if (buttonPressed == Frog) {

			System.out.println("Frog");

			showFluffyUnicorns();
		}
		else if (buttonPressed == Duck) {
			System.out.println("Duck");
			

			showDucks();
		}

		

		frame.pack();
	}
	
	
	
	
	
	
}
