package stringAssignments;

public class StringBuilder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This method returns the reversed object on which it was called";

		StringBuilder newString = new StringBuilder(str);

		newString.reverse();

		String result = newString.toString();

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + result);
	}

}
