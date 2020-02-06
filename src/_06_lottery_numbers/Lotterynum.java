package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynum {
		public static void main(String[] args) {
			Random gen = new Random();
			{
				JOptionPane.showMessageDialog(null, "Roll for Lottery");
				
				int randomNumber = gen.nextInt(10);
				
				int random1 = gen.nextInt(10);
				
				int random2 = gen.nextInt(10);
				
				int random3 = gen.nextInt(10);
				
				int random4 = gen.nextInt(10);
				System.out.println(randomNumber+" "+ random1+" "+ random2+" "+ random3+" "+random4+" ");
					
			}}}