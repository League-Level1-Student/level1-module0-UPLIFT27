package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int birdX = 30;
	int birdY = 300;
	int birdYVelocity = -10;
	int gravity = 1;
	int pipeX = 200;
	int pipegap = 80;
	int upperPipeHeight = (int) random(100, 200);
	int pipeWidth = 100;
	int lowerPipeTop;
	
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

		
	}

	@Override
	public void draw() {

		background(173, 216, 230);
		fill(255, 255, 0);
		stroke(255, 255, 0);
		ellipse(birdX, birdY, 40, 50);

		if (mousePressed) {
			 birdYVelocity=-10;
		}

		birdYVelocity+=gravity;
		birdY += birdYVelocity;

		fill(0, 255, 0);

		rect(pipeX, 0, pipeWidth, upperPipeHeight);

		

	

		rect(pipeX, lowerPipeTop, pipeWidth, 500);

		pipeX--;

		teleportPipes();
		if(intersectsPipes())
		{
			JOptionPane.showMessageDialog(null, "game over");
		
			
		}

	}

	public void teleportPipes() {
		int randomNumber = (int) random(width);

		if (pipeX == -90) {
			pipeX = randomNumber;
			lowerPipeTop =  upperPipeHeight -pipegap;
			
		
		}

	}

	boolean intersectsPipes() {
		if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX + pipeWidth)) {
			return true;
		} else if (birdY > lowerPipeTop && birdX > pipeX && birdX < (pipeX + pipeWidth)) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
