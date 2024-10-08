package interview_preaparation;

public class P32 {
	public static void main(String[] args) {//sum of array
		int[] arr= {15,151,516};
		int add=0;
		for(int i=0;i<arr.length;i++) {
			add = add + arr[i];
		}
        System.out.println(add);
	}
}
