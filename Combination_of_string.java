package interview_preaparation;

public class Combination_of_string {
	public static void main(String[] args) {
		String str = "charuli";
		generateCombinations(str, " ");
		

		
	}

	public static void generateCombinations(String str, String combination) {
		if(str.length()== 0) {
			System.out.print(combination+" ");
		
		return ;
		}
		generateCombinations(str.substring(1), combination + str.charAt(0));
		generateCombinations(str.substring(1), combination);

	}
	
}
