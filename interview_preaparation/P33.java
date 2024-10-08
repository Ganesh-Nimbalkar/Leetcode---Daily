package interview_preaparation;

public class P33 {//reverse an array
	public static void main(String[] args) {
		int [] arr= {1,2,5,8,9};
		int n = arr.length;
		
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		
		System.out.println("reversed array: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		} 
	}
}
