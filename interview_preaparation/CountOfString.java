package interview_preaparation;

import java.util.Scanner;
/*
 * count of words in given sentence
 */
public class CountOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine(); // Use nextLine() to read the entire line, including spaces
		
		int count = 1; // Start with 1 because the last word won't have a space after it
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') { // Check if the current character is a space
				count++;
			}
		}
		
		System.out.println("Count of words in the given string is: " + count);
		
	}
}
