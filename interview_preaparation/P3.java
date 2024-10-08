package interview_preaparation;

public class P3 {
public static void main(String[] args) {
	int no = 153;
	int temp = no;
	int length = 0;
	while(temp!=0) {
		length=length +1;
		temp=temp/10;
		
	}
	int k = no;
	int arm=0;
	int rem;
	while(k!=0) {
		int mul=1;
		rem=k%10;
		for(int i=1; i<=length;i++) {
			mul=mul*rem;
			
		}
		arm=arm+mul;
		k=k/10;

	}
	if (arm==no) {
		System.out.println(no+" is armstrong");
	}else {
		System.out.println(no+" not armstrong");

	}

}
}
