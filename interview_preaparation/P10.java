package interview_preaparation;

public class P10 {
	public static void main(String[] args) {//sum of digit
		int no=987;
	int	sum=0;
	while(no!=0) {
		sum=sum+no%10;
		no= no/10;
		
	}
	System.out.println("sum of digit is "+ sum);
	}

}
