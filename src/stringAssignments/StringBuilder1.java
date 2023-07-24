package stringAssignments;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "StringBuilder";
		String str2 = "is a peer class of string";
		String str3 = "that provides much of"; 
		String str4 = "the functionality of strings";
		
		StringBuilder newString = new StringBuilder();
		
		newString.append(str1).append(" ").append(str2).append(" ").append(str3).append(" ").append(str4);
		
		String result = newString.toString();
		
		System.out.println(result);
	}

}
