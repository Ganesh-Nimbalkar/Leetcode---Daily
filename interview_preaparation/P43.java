package interview_preaparation;

public class P43 {
	
	    public static void main(String[] args) {//armstrong number.
	    	
	    	int n= 153, sum =0, temp = n;
	    	while(temp!=0) {
	    		
	    		int digit = temp %10;
	    		sum +=  Math.pow(digit, 3);
	    		temp=temp/10;
	    	}
	    	if (sum==n) {
	    		System.out.println("is amrstrog");
	    	}else {System.out.println("not");
	    }
	    }
	}



