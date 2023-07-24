package coreJavaAssignments;

import java.util.*;

public class ResultDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks for Subject1: ");
		float subject1 = sc.nextFloat();

		System.out.println("Enter the marks for Subject2: ");
		float subject2 = sc.nextFloat();

		System.out.println("Enter the marks for Subject3: ");
		float subject3 = sc.nextFloat();

		if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
			System.out.println("Result : Passed");
		} else if ((subject1 > 60 && subject2 > 60 && subject3 <= 60)
				|| (subject1 <= 60 && subject2 > 60 && subject3 > 60)
				|| (subject1 > 60 && subject2 <= 60 && subject3 > 60)) {
			System.out.println("Result : Promoted");
		} else if ((subject1 > 60 && subject2 <= 60 && subject3 <= 60)
				|| (subject1 <= 60 && subject2 > 60 && subject3 <= 60)
				|| (subject1 <= 60 && subject2 <= 60 && subject3 > 60)) {
			System.out.println("Result : Failed");
		} else {
			System.out.println("Result : Failed");
		}

	}

}
