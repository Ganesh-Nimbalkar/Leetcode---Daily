package interview_preaparation;

public class PalindromeOfString {
	public static void main(String args[]) {
		String str = "madam";
		if (isPalindrome(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	public static boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false; // If characters don't match, it's not a palindrome
			}
			left++;
			right--;
		}
		
		return true; // If the loop completes, the string is a palindrome
	}
}
