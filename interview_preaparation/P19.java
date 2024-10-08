package interview_preaparation;
//2.	Write a program to print separate 1 and 0 from given string “0110011001”
public class P19 {
	public static void main(String[] args) {
		String str = "0110011001gffv";
		String countofzero = "";
		String countofone = "";

		
		for (int i = 0; i<str.length();i++) {
			if (str.charAt(i)=='0') {
				countofzero = countofzero + '0';
			}else if (str.charAt(i)=='1') {
				countofone += '1';
			}
		}
		System.out.println("zero are "+countofzero );
		System.out.println("one are "+countofone );

	}
}



