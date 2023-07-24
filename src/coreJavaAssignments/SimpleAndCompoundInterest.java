package coreJavaAssignments;

import java.util.*;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of Principal: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate per annum: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time period: ");
		double time = sc.nextDouble();
		
		double SI = principal * rate * time;
		
		System.out.println("Simple Interest: " + SI);
		
		System.out.println("Enter the number of times interest is compounded: ");
		double num = sc.nextDouble();
		
		double CI = principal * (Math.pow((1 + rate/100), (time * num))) - principal;
		
		System.out.println("Compound Interest: " + CI);
		
	}

}
