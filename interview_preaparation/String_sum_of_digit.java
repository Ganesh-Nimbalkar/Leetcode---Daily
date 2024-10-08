package interview_preaparation;

public class String_sum_of_digit {
	public static void main(String[] args) {
        // Initialize the string
        String s = "H3LLO T35TING9 SHATTRA";

        // Variable to store the sum of digits
        int result = 0;

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a digit
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                // Add the digit to the result after converting it from char to int
                result = result + (s.charAt(i) - '0');
            }
        }

        // Print the sum of digits
        System.out.println("Addition of digits is " + result);
    }
}