package StringProgram;

import java.util.Arrays;
//WAP to check if the given string are anagram or not
public class AnagramCode1 {

	public static void main(String[] args) {
		String s1 = "hey please listen";
		String s2 = "YEH silent please";
		
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean result = Arrays.equals(c1, c2);
		
		if(result == true) {
			System.out.println("The Strings are anagram");
		}
		else {
			System.out.println("The Strings are not anagram");
		}

	}

}

