package interview_preaparation;

public class P6 {
public static void main(String[] args) {
	int no =153;
	int temp = no;
	int length = 0;
	while (temp!=0) {
		length  =  length +1 ;
		temp = temp / 10;
		
	}
	int num = no;
	int arm =0;
	int rem;
	while(num!=0) {
		int mul = 1;
		rem = num % 10;
		
		for(int i =1; i<=length; i++) {
			mul=mul*rem;
			
		}
		arm= arm+mul;
		num=num/10;
		
	}
	if (arm==no) {
		System.out.println(arm+ " is armstong");
	}else {
		System.out.println("not");
	}
	
}
}
