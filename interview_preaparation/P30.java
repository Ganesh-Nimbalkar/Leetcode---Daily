package interview_preaparation;

public class P30 {// convert a string to title case means words first letter will be capital
	public static void main(String[] args) {
		String str = "java is palindrome";
		String [] words= str.split(" ");
		
		String result = "";
		
		for(String word : words) {
			result = result+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println("title case: "+ result.trim());
	}

}
