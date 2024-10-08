package interview_preaparation;

public class P18 {
	public static void main(String[] args) {
		int arr []= {0,67,8,0,9,0,65,3};
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
			
		}
		while(count<arr.length) {
			arr[count++]=0;
			
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
}