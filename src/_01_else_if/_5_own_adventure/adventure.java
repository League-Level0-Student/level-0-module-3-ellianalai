package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {

	public static void main(String[] args) {
		String adventure = JOptionPane.showInputDialog("It is nearing to the end of school day and you are getting restless."
				+ " Do you just sit there or secretly text on your phone");
		if (adventure.equalsIgnoreCase("Sit there")) {
			 adventure = JOptionPane.showInputDialog("The school bell rings and you grab your phone. "
					+ "You check it and see that an app you have never seen before got downloaded on your phone. "
					+ "Do you open it or delete it?"); {
				if (adventure.equalsIgnoreCase("Open it")) {
					JOptionPane.showMessageDialog(null, "When you click it, in a whirl of light, you get "
							+ "transported to this beautiful place and you live there happily forever. The End");
				}
				else if (adventure.equalsIgnoreCase("Delete it")) {
					JOptionPane.showMessageDialog(null, "You live the rest of your life wondering what would have "
							+ "happened if you opened the app and you die wondering too. The End. ");
				}   
			}

		}
		else if (adventure.equalsIgnoreCase("secretly text")){
				JOptionPane.showMessageDialog(null, "Your teacher catches you and your phone gets confiscated. The End");

		}
	}
}