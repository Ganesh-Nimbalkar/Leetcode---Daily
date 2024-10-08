package interview_preaparation;

public class P29 { //Program to
	public static void main(String[] args) {
		String str = "ggaanessh";
		boolean found = false;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("first not repeted character is: "+ch);
				found=true;
				//break;
			}
		}
		if(!found) {
			System.out.println("all are reapeted");
		}
	}

}
