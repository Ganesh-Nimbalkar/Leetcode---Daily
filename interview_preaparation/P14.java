package interview_preaparation;

public class P14 {
	
	public static void main(String[] args) {
		 
		int a [] = {15,1,658,416,51,68451,0651,65,41651};
		int max =a[0];
		for (int i =0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
				
			}
		}
		System.out.println("max is " + max);
	}

}
