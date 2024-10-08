package interview_preaparation;

public class P13 {
	public static void main(String[] args) {
		
		int [] a = {5,1,351,5,15,1,51,3 };
		
		int min = a[0];
		for (int i = 1; i<=a.length-1; i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("smallest is "+ min);
		
	}

}
