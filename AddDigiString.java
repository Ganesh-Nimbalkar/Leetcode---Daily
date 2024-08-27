package interview_preaparation;

public class AddDigiString {
	public static void main(String[] args) {
		String s="Hell9 T3esting Shas5tra";
		int result=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				result=(s.charAt(i)-48)+result;
			}
		}
		System.out.println(result);
}
}
