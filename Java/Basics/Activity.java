/**************************************************
 * Problem: Jack and Jill Leisure Activity
 *
 * Jack and Jill were getting bored so they decide to play a game.
 * In this game there are 10 cards.
 * Each card has a message written on it.
 * Jack asks Jill to choose one card from 1 to 10.
 * Then, Jack reveals the message written on the card that was selected by Jill.
 * Make a program to implement the game that is played by them.
 * Message on every choice should be different.
 * Implement it using switch case construct.
 *
 * Author: Chaitanyakumar Shah @ acs.chaitanya35@gmail.com
 * Date: December 3, 2019
 **************************************************/

import java.util.Scanner;

public class Activity {

	private static String[] empty = {};

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select number from 1 to 10");
		num = sc.nextInt();
		switch(num) {
			case 1:  System.out.println("card 1");  break;
			case 2:  System.out.println("card 2");  break;
			case 3:  System.out.println("card 3");  break;
			case 4:  System.out.println("card 4");  break;
			case 5:  System.out.println("card 5");  break;
			case 6:  System.out.println("card 6");  break;
			case 7:  System.out.println("card 7");  break;
			case 8:  System.out.println("card 8");  break;
			case 9:  System.out.println("card 9");  break;
			case 10: System.out.println("card 10"); break;
			default: Activity.main(empty);
		}
	}

}
