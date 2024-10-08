package interview_preaparation;

public class P11 {
	public static void main(String[] args) {//count of digit
		int no =12300;
		int length=0;
		while(no !=0) {
			no=no/10;
			length=length+1;
		}
		
		System.out.println("count of digit is: "+length);
		
	}

}
