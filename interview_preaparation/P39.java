package interview_preaparation;

public class P39 {//prime or not
	public static void main(String[] args) {
		int n=19;
		boolean isprime = true;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println("number is prime.");
		else
			System.out.println("not prime.");
	}

}
