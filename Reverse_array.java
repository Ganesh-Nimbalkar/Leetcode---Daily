package interview_preaparation;

public class Reverse_array {
	public static void main(String[] args) {
	  int[] arr = {15641,156,516,165,16,51,615};
	  System.out.print("original array: ");
	  for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+ " ");
	  }
	  int start = 0;
	  int end = arr.length-1;
	  while(start<end) {
	  int temp = arr[start];
	  arr[start]=arr[end];
	  arr[end]= temp;
	  
	  start++;
	  end--;
	  }
	System.out.println("\nreversed array: ");
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" , ");
	}
	}
	

}
