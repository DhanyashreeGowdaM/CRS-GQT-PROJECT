package StringProgram;
import java.util.Scanner;
/*
 * WAP to remove the unwanted spaces in beginning and at the end of the string
 * input: --------------India is the best-------------(- represents space)
 * output: India is the best
 */
public class UnwantedSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();//--------------India is the best-------------
		//System.out.println(str1);
		
		str1 = str1.trim();
		
		System.out.println(str1);

	}  

}
