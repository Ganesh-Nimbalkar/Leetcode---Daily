package interview_preaparation;

public class P26 {//count number of vowels in a string
public static void main(String[] args) {
	String str = "AeiOu";
	int count = 0;
	
	str = str.toUpperCase();
	
	
	for(int i =0; i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch == 'O'||ch=='U') {
			count++;
		}
		
	}
	System.out.println(count+" is count of vowels in strng");
}
}
