package interview_preaparation;

public class P42 {
	public static void main(String[] args) {// Bubble an array.
		int [] arr = {1,2,5,4,8,12};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("sorted array: ");
		
		for(int num : arr) {
			System.out.print(num);
		}

	}

}
