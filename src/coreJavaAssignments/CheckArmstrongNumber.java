

package coreJavaAssignments;

import java.util.*;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int remainder = 0;
		int result = 0;
		
		while(num != 0) {
			remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;
		}
				
		if(result == num) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
		
		sc.close();
	}

}
