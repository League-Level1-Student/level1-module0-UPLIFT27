package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int birdX = 30;
	int birdY = 100;
	int birdYVelocity = -10;
	int gravity = 1;
	int pipeX = (int) random(100,700);
	int pipegap = 200;
	int upperPipeHeight = (int) random(100, 300);
	int pipeWidth = 100;
	int lowerPipeTop =  upperPipeHeight+ pipegap;
	int score=0;
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

		
		

	

		fill(34,138,35);
		rect(0,540, 800,70);
		
		
		fill(0,255,0);
		rect(pipeX, lowerPipeTop, pipeWidth, 325);
		
		
		pipeX--;

		
		if (pipeX == -90) {
		teleportPipes();
		}
		
		if(intersectsPipes())
		{
			JOptionPane.showMessageDialog(null, "game over  your score was "+score);
			
		}
		if(birdY>=570)
		{
			JOptionPane.showMessageDialog(null, "game over  your score was "+score);
			
		}
		
	
		
	}

	public void teleportPipes() {
		int randomNumber = (int) random(800);
		int random = (int) random(400);

		
		
			pipeX = randomNumber;
			upperPipeHeight = random;
			lowerPipeTop =  upperPipeHeight+ pipegap;
			
			score++;
			
			fill(0,0,0);
			text(score, 750, 50); 
		

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
