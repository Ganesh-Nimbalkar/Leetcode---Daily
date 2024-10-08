package interview_preaparation;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main (String args[]) {
		int a = 0  , b = 1;
		/*
		 * If you want user input
		 * Scanner sc = new Scanner(System.in);
		System.out.print("enter number upto which you want to print..");
		int d = sc.nextInt();
		*/
		int c;
		for (int i =1; i<=10; i++) { //this is for predefined input make i<d for custom input.
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		//System.out.println();
	}

}
