package interview_preaparation;

import java.util.Iterator;

public class S1 {
	public static void main(String[] args) {//reverse a string.
		 String s = "desserts";
		 String s1 = "";
		 
		 for(int i = s.length()-1; i>=0; i--) {
			s1 = s1 + s.charAt(i); //s1 += s.charAt(i);both ways can be written.
			
		 }
		 System.out.println("reverse string "+s1);
	}

}
