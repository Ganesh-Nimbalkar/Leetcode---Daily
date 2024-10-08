package interview_preaparation;

public class Array_FindPalindrome {

	public static void main(String[] args) {
		int[] arr = {121,25, 89, 989};
		
		System.out.println("Palindrome numbers from given array are: ");
		
		for(int num: arr) {
			int y;
			if(isPalindrome(num)) {
				y = num;
				System.out.println(y+" ");
			}
		}
		
	}
	
	private static boolean isPalindrome(int num) {
		
		int og = num;
		int rev = 0;
		while(num>0) {
			
			int digit = num%10;
			rev = rev*10+digit;
			num = num /10;
		}
		return og==rev;
	}

}
