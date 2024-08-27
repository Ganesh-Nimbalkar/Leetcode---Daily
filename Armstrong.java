package interview_preaparation;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int z =num;
		
		int length = 0; //to find length of digit
		while(z!=0) { 
			length = length + 1;
			z = z/10;
		}
		int y = num;
		int arm =0;
		int rem;
		
		while(y!=0) { //for finding cube of digit
			int mul = 1;
			rem = y%10;
			for(int i=1;i<=length;i++ ) {
				mul = mul*rem;
				
			}
			arm = arm+mul;
			y = y/10;
			
		}
		if(arm==num) {
			System.out.println(num+ " is armstrong.");
			
		}
		else {
			System.out.println(num+ " is not an Armstrong");
		}
	}

}
