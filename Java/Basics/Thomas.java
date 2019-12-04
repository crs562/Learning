/**************************************************
 * Problem: Mr. Thomas, The School Teacher!
 * 
 * Mr. Thomas is a school teacher. He conducted the final exam for the year.
 * The exam included the following subject:
 * 	1. Mathematics
 * 	2. English
 * 	3. Hindi
 * 	4. Science
 * 	5. Social Science
 * However he is finding it very difficult to calculate the percentage of each student manually and then providing them the corresponding grades.
 * Now he wants an automated system in which he only has to enter the marks for the above listed subjects and the system displays the category of the student on the basis of his percentage.
 * Precentage - Category Chart:
 * 	1. Below 40 percent - Poor
 * 	2. 40 - 59 percent - Average
 * 	3. 60 - 79 percent - Good
 * 	4. 80 - 89 percent - Very Good
 * 	5. 90 percent and above - Excellent.
 *
 * Author: Chaitanyakumar Shah @ acs.chaitanya35@gmail.com
 * Date: December 3, 2019
 **************************************************/

import java.util.Scanner;

public class Thomas {

	public static void main(String[] args) {
		int numStudent;
		double mathScore, englishScore, hindiScore, scienceScore, socialScore;
		double percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many student you have?");
		numStudent = sc.nextInt();
		for (int i=0; i<numStudent; i++) {
			System.out.println("Please Enter All Score from 0 to 100");
			System.out.println("Please Enter Mathematics Score for student-"+(i+1));
			mathScore = sc.nextDouble();
			System.out.println("Please Enter English Score for student-"+(i+1));
			englishScore = sc.nextDouble();
			System.out.println("Please Enter Hindi Score for student-"+(i+1));
			hindiScore = sc.nextDouble();
			System.out.println("Please Enter Science Score for student-"+(i+1));
			scienceScore = sc.nextDouble();
			System.out.println("Please Enter Social Science Score for student-"+(i+1));
			socialScore = sc.nextDouble();
			percentage = (mathScore + englishScore + hindiScore + scienceScore + socialScore)/5.0;
			System.out.println("Percentage for student-" + (i+1) +" is " + percentage);
			if (percentage < 40) System.out.println("Percentage Category -- Poor");
			else if (percentage < 60) System.out.println("Percentage Category -- Average");
			else if (percentage < 80) System.out.println("Percentage Category -- Good");
			else if (percentage < 90) System.out.println("Percentage Category -- Very Good");
			else System.out.println("Percentage Category -- Excellent");
		}
	}

}
