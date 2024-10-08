package interview_preaparation;

public class P37 {
	public static void main(String[] args) {//find a missing number from an array but applicable only for single value
		int[] arr= {1, 2, 3, 5};
		int n=arr.length+1;
		int total=n*(n+1)/2;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			
		}
		int missing=total-sum;
		
		System.out.println("missing number is: "+missing);
	}

}
