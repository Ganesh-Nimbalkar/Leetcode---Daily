package interview_preaparation;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number to check number is prime or not ");
//		int a=sc.nextInt();
		int num=7;  // for custom input from user make int num = a;
		int temp = 0;
		
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
			
		}
		if(temp==0) {
			System.out.println(num+ " is prime number");
		}
		else {
			System.out.println(num +" is not prime number");
		}
	}

}
