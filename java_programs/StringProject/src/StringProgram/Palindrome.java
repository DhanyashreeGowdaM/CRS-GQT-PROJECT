package StringProgram;
/*
 * WAP to check if the given string is Palindrome or not
 * 
 */
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		String str2 = "";
		//step-1
		int len = str1.length();
		
		//step-2
		for(int i=len-1;i>=0;i--) {
			//step-3
			str2 = str2 + str1.charAt(i);
		}
		//step-4
		System.out.println(str2);
		//step-5
		if(str1.equals(str2)==true) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}

}
