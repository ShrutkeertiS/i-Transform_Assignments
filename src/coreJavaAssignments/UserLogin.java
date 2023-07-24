package coreJavaAssignments;

import java.util.*;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int loginAttempts = 0;
		int maxLoginAttempts = 3;
		
		String validLoginName = "Capgemini";
		String validPassword = "Capg@123";
		
		while(loginAttempts < maxLoginAttempts) {
			
			System.out.println("Enter your UserName: ");
			String userName = sc.next();
			
			System.out.println("Enter Login name: ");
			String loginName = sc.next();
			
			System.out.println("Enter the password: ");
			String password = sc.next();
			
			if(loginName.equals(validLoginName) && password.equals(validPassword)){
				System.out.println("Welcome " + userName + "!!");
				break;
			} else {
				loginAttempts++;
				int attemptsRemaining = maxLoginAttempts - loginAttempts;
				
				if(attemptsRemaining > 0) {
					System.out.println("Invalid Credentials");
				} else {
				System.out.println("Login attempts failed!!!. Contact Admin");
				}
			}
		}
		sc.close();
	}

}
