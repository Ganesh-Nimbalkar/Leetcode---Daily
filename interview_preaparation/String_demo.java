0package interview_preaparation;

public class String_demo {
	public static void main(String[] args) {
		String s1 = "Ganesh";
		String s2 = "Nimbalkar";
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s2.concat(" "+s1));
		
		String[] result = s1.split("a", 2); // Split by the character 'e', limit the result to 2 parts
        for (String part : result) {
            System.out.println(part);
        }
        
		System.out.println(s1.replaceAll(s1, s2));
		System.out.println(s1.replace('n','r'));
		System.out.println(s1.contains(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.toString());





		




	}

}
