package interview_preaparation;

public class S2 {
	public static void main(String[] args) {
		String s = "mam";
		
		if(isPalindrome(s)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
	}
	public static boolean isPalindrome (String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

}
