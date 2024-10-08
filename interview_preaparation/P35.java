package interview_preaparation;

public class P35 { //frequency of an element present in an array
	public static void main(String[] args) {
		int [] arr = {10,10,20,50,60,20,50,80};
		boolean[] visited= new boolean[arr.length];

		for(int i=0;i<arr.length;i++) {
			if(visited[i])
				continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" occures "+count+" times");
		}

	}
}
