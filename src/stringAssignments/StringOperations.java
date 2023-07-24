package stringAssignments;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Java String pool refers to collection of Strings which are stored in heap memory";

		System.out.println("String in lower case: " + string.toLowerCase());
		
		System.out.println("***************************************");

		System.out.println("String in upper case: " + string.toUpperCase());
		
		System.out.println("***************************************");

		String newString = string.replace('a', '$');

		System.out.println("Replace letter a with $: " + newString);
		
		System.out.println("***************************************");

		String target = "collection";

		if (string.contains(target)) {
			System.out.println("String contains the word: " + target);
		} else {
			System.out.println("String does not contains the word: " + target);
		}
		
		System.out.println("***************************************");

		String string2 = "java string pool refers to collection of strings which are stored in heap memory";

		System.out.println(string.equals(string2));
		
		System.out.println("***************************************");
		
		System.out.println(string.equalsIgnoreCase(string2));
	}

}
