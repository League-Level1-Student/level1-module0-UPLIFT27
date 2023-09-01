package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {

	public void showButton() {

		JFrame frame = new JFrame();
		JButton button = new JButton();

		frame.setVisible(true);

		button.setText("Click me");

		frame.add(button);
		frame.pack();

		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Woohooo!");

		int rand = new Random().nextInt(5);

		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Opportunities knock when you least expect them; keep your door open!");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Your creativity knows no bounds; let it guide you to new horizons.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null,
					"Learning from yesterday, living for today, and hoping for tomorrow brings success.");
		} else {
			JOptionPane.showMessageDialog(null, "The journey of a thousand miles begins with a single step, and you're already on the right path.");
		}
	}

}
