package StringProgram;
import java.util.Scanner;
/*
 * WAP to count the total number of vowels and consonants in the given string
 * input: apple
 * output: vowels = 2, consonants = 3
 * vowels: a,e,i,o,u,A,E,I,O,U
 * 
 */
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		int vowel_cnt=0;
		int cons_cnt=0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i'
					|| str1.charAt(i)=='o' || str1.charAt(i)=='u') {
				vowel_cnt++;
			}
			else if(str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I'
					|| str1.charAt(i)=='O' || str1.charAt(i)=='U') {
				vowel_cnt++;
			}
			else {
				cons_cnt++;
			}
		}
		System.out.println("Consonant count is : "+cons_cnt);
		System.out.println("Vowel count is : "+vowel_cnt);

	}

}
