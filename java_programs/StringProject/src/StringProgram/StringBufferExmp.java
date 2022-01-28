package StringProgram;
/*
 * Program to merge two strings in case of mutable and immutable strings
 */
import java.util.Scanner;

public class StringBufferExmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		StringBuffer sb1 = new StringBuffer(sc.nextLine());
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer(sc.nextLine());
		System.out.println(sb2);
		
		sb1.append(sb2);
		System.out.println(sb1);
		
		//
		
		String s1 = "Rama";
		System.out.println(s1);
		String s2 = "Sita";
		System.out.println(s2);
		s1.concat(s2);//in case of immutable strings concat() will not assign the value to the first string
		s1 = s1.concat(s2);//in case of immutable strings concat() will assign the value to the string passed on LHS
		System.out.println(s1);
		//in case of immutable strings concat() will print the concatenated value on the screen
		System.out.println(s1.concat(s2));

	}

}
