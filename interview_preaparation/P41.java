package interview_preaparation;

import java.util.Scanner;

public class P41 {
	public static void main(String[] args) { //factorial program.using while loop&for loop
		int n , fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact= fact*i;
			
		}
		//while(n>0) {
//			fact=fact*n;
//			n=n-1;
//			
//		}
		System.out.println(fact);
	}

}
