package interview_preaparation;

public class ArrayMin {
	public static void main(String[] args) {
		int[] arr = {6,7,5,9,3,0};
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
			min = arr[i];
		}
		System.out.println(min);
	}
}
