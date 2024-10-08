package interview_preaparation;

public class P15 {
	public static void main(String[] args) {
		int [] arr= {151,53,1,351,35,1,5};
		int n =arr.length;
		for (int i =0; i<arr.length/2; i++) {
			int temp = arr[i];		
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
			
			
		}
		System.out.println("reversed arry");
		
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
	}
}
