package interview_preaparation;

public class ArrayMax {
	public static void main(String[] args) {
		int[] arr = {6,8,30,6,0,5};
		int max = arr[0];
		
		for(int i= 1;i<arr.length;i++) 
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println(max );
	}

}
