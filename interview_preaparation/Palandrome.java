package interview_preaparation;

public class Palandrome {
	public static void main(String[] args) {
		int r;
		int sum=0;
		int temp;
		int n=141;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("palindrome is number");
		else
			System.out.print("it is not a palindrome");
		}
	}
