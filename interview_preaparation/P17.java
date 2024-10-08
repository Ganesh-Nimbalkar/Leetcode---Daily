package interview_preaparation;

public class P17 {
	public static void main(String[] args) {
		int arr [] = {12,1,74,12,85,1};

		for(int i = 0; i<arr.length; i++) {

			for(int j = i+1; j<arr.length; j++) {
				if(	arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}

		}
	}
}
