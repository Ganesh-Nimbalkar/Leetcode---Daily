package interview_preaparation;

public class P44 {
	public static void main(String[] args) {//GCD program.
		int n1=54, n2=60;
		while(n1!=n2) {
			if (n1>n2) {
				n1=n1-n2;
				
			}else {
				n2=n2-n1;
			}
		}
		
		System.out.println(n1);
		
	}

}
