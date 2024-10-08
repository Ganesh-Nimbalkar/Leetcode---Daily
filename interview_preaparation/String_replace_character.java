package interview_preaparation;

public class String_replace_character {
	public static void main(String[] args) {
		String s = "Ganeshx@$sjdfbn#nsjdfn$nsjdfk$sjd$";
		 
		String result = s.replaceAll("[^a-zA-Z0-9]","c") ;
		System.out.println(result);
	}

}
