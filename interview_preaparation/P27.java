package interview_preaparation;

public class P27 {//find the fequency of repeated each charaters in string
public static void main(String[] args) {
	String str ="hel11lo";
	int[] arr = new int[256];
	
	for(int i=0; i<str.length();i++) {
		arr[str.charAt(i)]++;
		
	}
	for(int i = 0;i<str.length();i++) {
		char ch =str.charAt(i);
		if(arr[ch]>0) {
			System.out.println(ch+":"+arr[ch]);
			arr[ch]=0;
		}
	}
}
}
