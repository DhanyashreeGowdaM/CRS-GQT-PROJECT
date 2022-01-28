package StringProgram;
/*
 * Mutable Strings: These are the strings that can be modified once they are created.
 * In java to handle the mutable string we have StringBuffer and StringBuilder.
 */
import java.util.Scanner;

public class StringBufferExmp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		StringBuffer sb = new StringBuffer(sc.nextLine());
		System.out.println(sb);

	}

}
