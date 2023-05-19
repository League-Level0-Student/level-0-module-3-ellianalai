package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class Ninetynine_bottles {

	public static void main(String[] args) {
		for (int i=99;i>1;i--) {
			System.out.println( i + " bottles of beer on the wall, " + i + " bottles of beer.\n"
					+ "					Take one down and pass it around, " + (i-1) +  " bottles of beer on the wall.");
		}
		System.out.println("Take one down and pass it around. no more bottles of beer on the wall.\n"
				+ "				No more bottles of beer on the wall, no more bottles of beer.\n"
				+ "				Go to the store and buy some more, 99 bottles of beer on the wall."
);

	}

}
