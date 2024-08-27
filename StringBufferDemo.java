package interview_preaparation;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s = new String("Hello");
		
		s.concat("Ganesh");
		
		StringBuffer sb = new StringBuffer("hii");
		sb.append("Charu");
		
		System.out.println("output of string "+s);
		System.out.println("output of stringBuffer "+sb);
	}
}
