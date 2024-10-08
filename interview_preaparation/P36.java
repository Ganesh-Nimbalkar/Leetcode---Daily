package interview_preaparation;

public class P36 {

	public static void main(String[] args) {//shifting zeros to right
		int[] arr = {55,20,60,80,0,60,0,38,0};
		int count= 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		System.out.print("Array after moving: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
