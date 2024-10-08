package interview_preaparation;

public class P22 {
	public static void main(String[] args) {
		int i =0 ;
		int j = 1;
		int k ;
		for(int y =1;y<=101;y++) {
			k= i+j;
//			System.out.print(k +",");
			i=j;
			j=k;
			
			if(k<100&&k>0) {
				System.out.print(k+",");
			
			}
			if (k > 100) {
                System.out.println();
                System.out.println("First Fibonacci number greater than 100 is: " + k);
                break; // Exit the loop after printing the first number greater than 100
            }
			
		}
	}

}
