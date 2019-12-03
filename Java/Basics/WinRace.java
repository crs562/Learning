/**************************************************
 * Problem: Michael and Bruce, Who wins the race?
 *
 * Michael and Bruce are friends. Both of them liked the same girl.
 * One day they started fighting over her and decided that both of them will write a number on a chit.
 * The one whose number will be smaller will forget the girl and get out of other's way.
 * The problem was that they were not educated and hence they are still waiting for someone, who could help them to implement the plan.
 * Now try to implement a program which can help them, using the above strategy.
 *
 * Author: Chaitanyakumar Shah @ acs.chaitanya35@gmail.com
 * Date: December 3, 2019
 *************************************************/

import java.util.Scanner;

public class WinRace {

	private static String[] empty = {};

	public static void main(String[] args) {
		int michaelNum;
		int bruceNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ready!!!");
		System.out.println("Michael enter your Number:");
		michaelNum = sc.nextInt();
		System.out.println("Bruce enter your Number:");
		bruceNum = sc.nextInt();
		if (michaelNum > bruceNum)
			System.out.println("Michael Wins! Bruce please find another girl!!");
		else if (michaelNum < bruceNum)
			System.out.println("Bruce Wins! Michael please find another girl!!");
		else {
			System.out.println("Both selected the same number, Please try again!!");
			WinRace.main(empty);
		}
	}

}         
