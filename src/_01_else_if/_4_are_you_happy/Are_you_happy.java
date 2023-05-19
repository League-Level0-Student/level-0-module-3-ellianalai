package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {

	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are You Happy?");
		if (question.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}
		if (question.equalsIgnoreCase("No")) {
			String q = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (q.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			if (q.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
		
		

	}

}
