package interview_preaparation;

import java.util.Scanner;

public class String_find_vowels {
	public static void main(String[] args) {
		int v = 0;
		int con= 0;
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char c1 = s.charAt(i);
			if(c1!=' ') {
				if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
					v++;
				}
				else
					con ++;
			}	
		}
		System.out.println("Vowels = "+ v + " Consonants = "+ con);
	}

}
