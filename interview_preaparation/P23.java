package interview_preaparation;


public class P23 {
	public static void main(String[] args) {
		int x= 7;
		int temp=0;
		for(int i = 2;i<=x-1;i++) {
			if(x%i==0) {
				temp +=1;	
			}	
		}
		if(temp ==0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}
}
