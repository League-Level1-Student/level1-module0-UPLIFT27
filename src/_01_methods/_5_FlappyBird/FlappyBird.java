package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x=30;
int y=300;
int birdYVelocity = -10;
int gravity = 1;
int pipeX=200;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
     
    	
    	size(width, height);

    	
    }

    @Override
    public void draw() {
        
    	background(173, 216, 230);
    	fill(255, 255, 0);
    	stroke(255, 255, 0);
    	ellipse(x, y, 40, 50);
    	
    
    	if(mousePressed)
    	{
    	y+=birdYVelocity;
    	}
    	
    	y+=gravity;
    	
    	
    	fill(0, 255, 0);
    	
    	rect(pipeX, 0, 80, 300);
    	pipeX--;
    	
    	

    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
