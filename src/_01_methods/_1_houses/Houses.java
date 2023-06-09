package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {

	Robot rob = new Robot();

	int large = 0;

	public void run() {
		
		rob.setX(50);
		rob.setY(100);
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(15);
		rob.setWindowColor(0,0,0);
	rob.setX(50);
	rob.setY(400);
	
		for(int i=0; i<=9; i++){
		
		String size =	JOptionPane.showInputDialog("What size do you want the building to be");
		 String color =		JOptionPane.showInputDialog("What color do you want the building to be");
		String roof = "";
		 

		
	
		if(color.equals("red"))
		{
			rob.setPenColor(255,0,0);
		}
		else if(color.equals("blue"))
		{
			rob.setPenColor(0,0,255);
		}
		else if(color.equals("green"))
		{
			rob.setPenColor(0,255,0);
		}
		else if(color.equals("yellow"))
		{
			rob.setPenColor(255,255,0);
		}
		else if(color.equals("orange"))
		{
			rob.setPenColor(255,102,0);
		}
		else if(color.equals("purple"))
		{
			rob.setPenColor(102,0,255);
		}
		else
		{
			rob.setPenColor(0,0,0);
		}
		
		
		
		if(size.equals("small"))
		{
			large=60;
		}
		if(size.equals("medium"))
		{
			large=120;
		}
		if(size.equals("large"))
		{
			 large=250;
		}
		
		 if(large==250)
		 {
			 roof= "straight";
					 
		 }
		 else{
				 roof = 	JOptionPane.showInputDialog("What roof do you want the building to be");
				 }
		
		if(roof.equals("pointy"))
		{
			PointRoof();
		}
		
		if(roof.equals("straight"))
		{
			StraightRoof();
		}
			}
		
		
		
		
		}

	public void PointRoof()

	{
		rob.move(large);
		rob.turn(60);
		rob.move(30);
		rob.turn(60);
		rob.move(30);
		rob.turn(60);
		rob.move(large);
		
		rob.turn(270);
		rob.move(11);
		rob.setPenColor(1,160,32);
		rob.move(40);
		rob.turn(270);
	}

	public void StraightRoof()

	{

		rob.move(large);
		rob.turn(90);
		rob.move(45);
		rob.turn(90);
		rob.move(large);
	
		rob.turn(270);
		rob.move(11);
		rob.setPenColor(1,160,32);
		rob.move(40);
		rob.turn(270);
	}

	// Check the recipe to find out what code to put here

}
