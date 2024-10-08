package interview_preaparation;

public class P25 {
	public static void main(String[] args) {//check if string is palindrome  or not 
		String str = "162";
		String check ="";
		
		for(int i = str.length()-1;i>=0; i--) {
			check=check+str.charAt(i);
		}
		if(str.equals(check)) {
			System.out.println("is plaindrome");
		}else {
			System.out.println("not plaindrome");
		}
	}

}
