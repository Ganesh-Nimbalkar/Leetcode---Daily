package interview_preaparation;

public class RecursiveBinarySearch {

	

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int target = 3;
	        int result = binarySearch(arr, target);
	        
	        System.out.println(result); // Output: 2
	    }

	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        return -1; // Target not found
	    }
	}

