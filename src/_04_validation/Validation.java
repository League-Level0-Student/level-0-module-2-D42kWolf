//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random gen = new Random();
		
		int randomNumber = gen.nextInt(11);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			 JOptionPane.showMessageDialog(null, "You're epic");
		} else if (randomNumber == 2) {
			 JOptionPane.showMessageDialog(null, "You got pretty hair ");
		} else if (randomNumber == 3) {
			 JOptionPane.showMessageDialog(null, "great eyes");
		} else if (randomNumber == 4) {
			 JOptionPane.showMessageDialog(null, "great smile");
		} else if (randomNumber == 5) {
			 JOptionPane.showMessageDialog(null, "great voice");
		} else if (randomNumber == 6) {
			 JOptionPane.showMessageDialog(null, "great computer skills");
		} else if (randomNumber == 7) {
			 JOptionPane.showMessageDialog(null, "great coding");
		} else if (randomNumber == 8) {
			 JOptionPane.showMessageDialog(null, "great");
		} else if (randomNumber == 9) {
			 JOptionPane.showMessageDialog(null, "great hair");
		} else if (randomNumber == 10) {
			 JOptionPane.showMessageDialog(null, "epic greatttttttttttt");
		} else {
			
		}
			
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
