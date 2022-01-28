package StringProgram;
import java.util.Scanner;
/*
 * WAP to convert the string into an array
 */
public class StringToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		//Approach without using built in functions
		char[] charArray = new char[str1.length()];
		for(int i = 0;i < str1.length(); i++) {
			System.out.println(charArray[i]);
		}
		
		//Approach with using built in functions
		char[] charArray1 = str1.toCharArray();
		
		for(int i = 0;i < charArray1.length;i++) {
			System.out.println(charArray1[i]);
		}

	}
}
