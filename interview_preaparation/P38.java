package interview_preaparation;

public class P38 {
	public static void main(String[] args) {
		int[]arr= {50,55,20,55,60,20,60};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements are: "+arr[i]);
				}				
			}			
		}		
	}
}
//find duplicate elements from an array