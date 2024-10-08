package interview_preaparation;

import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String Size: ");
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		
		
		}
		System.out.println("arry elements are");
		for(int x : arr ) {
		 System.out.println(x + " "  );
		}
	}

}
