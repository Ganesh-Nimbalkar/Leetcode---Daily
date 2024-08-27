package interview_preaparation;

public class Armstorng {
	public static void main(String[] args) {
		int num=1534;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int d=num%10; //3-5-1
			sum=(d*d*d)+sum;//3*3*3+0=27 5*5*5+27=152 1+152
			num=num/10;//15-1
			System.out.println(sum);//27 -152-153
		}
		if(temp==sum) {
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Not armstrong");
	}
}
