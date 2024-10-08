package interview_preaparation;

public class P24 {
	public static void main(String[] args) {//String program series (reverse a string)
		String str = "Ganesh";
		String rev = "";
		for ( int i = str.length()-1; i>=0; i--) {
			rev= rev+str.charAt(i);
		}
		
		System.out.println(rev);

	}
}
