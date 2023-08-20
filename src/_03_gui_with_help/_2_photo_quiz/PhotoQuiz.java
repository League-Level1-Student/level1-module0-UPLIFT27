package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
String picture = "https://t3.gstatic.cpictureom/licensed-image?q=tbn:ANd9GcTNwWdVLoWRgaRzoyctQn8vnWiU_pUFth_L6AmYDVwfWXLwUloDa6j4VFYNT5AwZBEy";
		// 2. create a variable of type "Component" that will hold your image




		Component comp = createImage(picture);
		// 3. use the "createImage()" method below to initialize your Component

		

		// 4. add the image to the quiz window
quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image

String flavor =JOptionPane.showInputDialog("what flavor is the icecream");
		// 7. print "CORRECT" if the user gave the right answer

		
int score=0;

		if(flavor.equals("Vanilla") || flavor.equals("vanilla") )
		{
			score++;
			JOptionPane.showMessageDialog(null,"CORRECT your score is "+ score);

		
		}
		
		
		
		
		// 8. print "INCORRECT" if the answer is wrong

		else
		{
			JOptionPane.showMessageDialog(null,"INCORRECT your score is "+score);
		}
		
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		
		quizWindow.remove(comp);
		

		// 10. find another image and create it (might take more than one line
		// of code)
		
		String newpic = "https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTNwWdVLoWRgaRzoyctQn8vnWiU_pUFth_L6AmYDVwfWXLwUloDa6j4VFYNT5AwZBEy";
		
		comp= createImage(newpic);

		// 11. add the second image to the quiz window

		
		quizWindow.add(comp);
		
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String car =JOptionPane.showInputDialog("what is the is the brand of this car");
		// 14+ check answer, say if correct or incorrect, etc.




if(car.equals("tesla") || car.equals("Tesla"))
{
	JOptionPane.showMessageDialog(null,"CORRECT, your score is "+score);
	score++;
	
	
}

else
{
	JOptionPane.showMessageDialog(null,"INCORRECT your score is + "+score);
}









		
		
		
		
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
