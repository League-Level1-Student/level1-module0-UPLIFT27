package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie {
	
	public void showButton() {
		
		System.out.println("Button Clicked");
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		
		
		
		
		
		frame.setVisible(true);
		
		frame.add(button);
		frame.pack();
		
		button.addActionListener(this);
		
		
		
		
		
		
	}

	
	public actionPerformed  implements void ActionListener()
	
	{
		
		
		
		
		JOptionPane.showMessageDialog(null, "Woohooo!");
		
		
		Random rand = new Random();
		
		int num = rand*4;
		
	}
	
	
	
	
	
	
	
}
