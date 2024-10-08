package interview_preaparation;

public class ReverseString {
	public static void main(String[] args) {
		String s = "helloooo";
		System.out.println(stringReverse(s));
	
}
	
	public static String stringReverse(String s) {
		char[] chars = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			chars[i] = s.charAt(s.length()-1-i);
//			System.out.print(chars[i]+" ");
		}

		return new String(chars);
	}
}
