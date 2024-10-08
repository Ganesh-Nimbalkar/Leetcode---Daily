package interview_preaparation;

public class Palindrom {
	public static void main(String[] args) {
		int num=5656;
		int og = num;
		
		int rev = 0;
		int rem;
		
		while(og!=0) {
			rem = og%10;
			rev = rev*10+rem;
			og = og/10;
		}
		if(num==rev) 
			System.out.println(num + "  is palindrome");
		
		else
			System.out.println(num + " is not palindrome");
	}
	
}
