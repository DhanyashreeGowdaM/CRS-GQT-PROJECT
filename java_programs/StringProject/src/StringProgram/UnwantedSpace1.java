package StringProgram;
import java.util.Scanner;
/*
 * WAP to remove the unwanted spaces in the string
 * input: India     is      the     best
 * output: India is the best
 */
public class UnwantedSpace1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		//System.out.println(str1);
		String str2="";
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ' && str1.charAt(i+1)==' ') {
		}
			else {
				str2 = str2+str1.charAt(i);
			}
		}
			System.out.println(str2);

	}
}