package interview_preaparation;

import java.util.Arrays;

public class SortArrayInAsc {

	public static void main(String[] args) {
		
		int[] arr = {45,67,98,34,69};
//		Arrays.sort(arr);
//		
//		System.out.println("Ascending order is: ");
//		for(int a:arr)
//			System.out.print(a+", ");
	
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) { //for descending: arr[j]<arr[j+1]
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
		for(int num : arr)
			System.out.print(num + " ");
	
	}

}
