package coreJavaAssignments;

import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the your CTC: ");
		int ctc = sc.nextInt();

		if (ctc <= 180000) {
			System.out.println("Amount for IncomeTax: NIL");
		} else if (ctc >= 181001 && ctc <= 300000) {
			System.out.println("Payable IncomeTax ammount in Percentage : 10%");
			float incomeTax = (10f / 100f) * ctc;
			System.out.println("Total Income Tax ammount: " + incomeTax);
		} else if (ctc >= 300001 && ctc <= 500000) {
			System.out.println("Payable IncomeTax ammount in Percentage : 20%");
			float incomeTax = (20f / 100f) * ctc;
			System.out.println("Total Income Tax ammount: " + incomeTax);
		} else if (ctc >= 500001 && ctc <= 1000000) {
			System.out.println("Payable IncomeTax ammount in Percentage : 30%");
			float incomeTax = (30f / 100f) * ctc;
			System.out.println("Total Income Tax ammount: " + incomeTax);
		}
	}

}
