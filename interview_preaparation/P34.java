package interview_preaparation;

public class P34 {
	public static void main(String[] args) { //second largest
		
		int[] arr={10,50,60,80,20};
		int secmax=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					secmax=arr[i];
					arr[i]=arr[j];
					arr[j]=secmax;
				}
			}
			
		}
		
		System.out.println(arr[arr.length-2]);
	}

}
