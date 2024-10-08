package interview_preaparation;

public class AnagramOfString {
	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		boolean result = isAnagram(s1, s2);
		
		if(result)
			System.out.println("Given strings are Anagram to each other");
		else
			System.out.println("Given strings are not anagram");
		
	}
	public static boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length())
			return false;
		 
		int[] count = new int[26];
		for(int i = 0; i<s1.length();i++) {
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
		}
		
		for(int i=0; i<26;i++) {
			if(count[i]!=0) {
				return false;
				
			}	
		}
		return true;
	}
	

}
