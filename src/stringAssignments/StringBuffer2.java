package stringAssignments;

public class StringBuffer2 {

	public static void main(String[] args) {
		
		String str1 = "insert text";
		
		String str2 = "it is used to _ at the specified index position";
		
		int index = str2.indexOf("_");
		
		StringBuffer newString = new StringBuffer(str2);
		
		newString.replace(index, index+1, str1);
		
		String result = newString.toString();
				
		System.out.println(result);
	}
}
