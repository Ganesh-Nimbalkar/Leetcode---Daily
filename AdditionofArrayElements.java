package interview_preaparation;

public class AdditionofArrayElements {
	public static void main(String[] args) {
		int[] arr= {1,23,6,6,36,5};
		int add = 0;
		
		for(int i=0;i<arr.length;i++) {
			add = add + arr[i];
			
		}
		System.out.println(add);
	}

}
