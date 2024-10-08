package interview_preaparation;

public class P40 {
	public static void main(String[] args) {//fibonacci series program
		int a=0,b=1;
		//int result=0;
		
		for(int i=1;i<10;i++) {
			System.out.print(a+" ");
			int next= a+b;
			a=b;
			b=next;
			
		}
	}
}
