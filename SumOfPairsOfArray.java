package interview_preaparation;

public class SumOfPairsOfArray {
	public static void main(String[] args) {
		int[] arr = {34, 56, 77, 82, 23};
		int n = arr.length;
		int sum = 111;

		for (int i = 0; i < n; i++) {  // Loop until i < n
			for (int j = i + 1; j < n; j++) {  // Start j from i + 1 to avoid repeating pairs
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
				}
			}
		}
	}
}
