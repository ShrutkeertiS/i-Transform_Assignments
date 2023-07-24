package coreJavaAssignments;

//accept the marks from 3 students for subjects A, B and C. Find total score and average for each student. Also calculate total and average scored by student in each respective subject

import java.util.*;

public class TotalAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter marks of Student " + i);
			System.out.println("Enter the marks in subject A: ");
			int score1 = sc.nextInt();

			System.out.println("Enter the marks in subject B: ");
			int score2 = sc.nextInt();

			System.out.println("Enter the marks in subject C: ");
			int score3 = sc.nextInt();

			int total = score1 + score2 + score3;

			int average = total / 3;

			System.out.println("Total score: " + total);

			System.out.println("Average: " + average);

			System.out.println("Average score for Subject A: " + (score1 / 3));

			System.out.println("Average score for Subject B: " + (score2 / 3));

			System.out.println("Average score for Subject C: " + (score3 / 3));

			System.out.println("**************************************");
		}

	}

}
