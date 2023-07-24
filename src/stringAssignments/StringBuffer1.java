package stringAssignments;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "StringBuffer";
		String str2 = "is a peer class of string";
		String str3 = "that provides much of"; 
		String str4 = "the functionality of strings";
		
		StringBuffer newString = new StringBuffer();
		
		newString.append(str1).append(" ").append(str2).append(" ").append(str3).append(" ").append(str4);
		
		String result = newString.toString();
		
		System.out.println(result);
	}

}
