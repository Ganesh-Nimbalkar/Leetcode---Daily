package interview_preaparation;

public class P45 {
	public static void main(String[] args) {//find the length of string without using in built methods.
		String str = "Ganesh n";
		String s = str.replaceAll("\\s", "");
//		System.out.println(s);
		int length = 0;
//		
		for (int i = 0; ; i++) {	
			try {
				s.charAt(i);
				length++;
				
				
			}catch(Exception e) {
				break;
			}
		}
			
			System.out.println("Length of the string is: "+length);
		}
		
}	

//if(str.equals(" ")) {
//space++;
//
//}

//
//break;
//}
//
//System.out.println(space);
//}
