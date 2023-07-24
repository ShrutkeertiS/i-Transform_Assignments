package coreJavaAssignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Armstrong numbers between 100 to 999: ");
		
		for(int num = 100; num<=999; num++) {
			
			int temp = num;
			int remainder;
			int result = 0;
			
			while(temp != 0) {
				remainder = temp % 10;
				result = result + (remainder * remainder * remainder);
				temp = temp / 10;
			}
			
			if(result == num) {
				System.out.println(num + " ");
			}
		}
		
	}

}
