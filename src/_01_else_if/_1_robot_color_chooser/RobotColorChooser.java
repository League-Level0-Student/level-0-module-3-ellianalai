
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot r = new Robot();
		//2. Make the robot draw a shape (this will take more than one line of code)
		while (true) {
			r.setSpeed(50);
			r.penDown();
			r.move(200);
			r.turn(90);
			r.move(200);
			r.turn(90);
			r.move(200);
			r.turn(90);
			r.move(200);
			r.turn(90);
			//3. Set the pen width to 10
			r.setPenWidth(10);
			//4. Ask the user what color pen they would like the robot to draw with
			String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
			//5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("Blue")) {
				r.setPenColor(Color.blue);
			}
			else if (color.equals("Red")) {
				r.setPenColor(Color.red);
			}
			else if (color.equals("Yellow")) {
				r.setPenColor(Color.yellow);
				
			}
			else if (color.equals("Orange")) {
				r.setPenColor(Color.orange);
				
			}
			else if (color.equals("Green")) {
				r.setPenColor(Color.green);
			
				
			}
			else if (color.equals("Purple")) {
				r.setPenColor(Color.magenta);
			
				
			}
			else {
				r.setRandomPenColor();
			}
		}
		//6. If the user doesn't enter anything, choose a random color
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them






	}
}
