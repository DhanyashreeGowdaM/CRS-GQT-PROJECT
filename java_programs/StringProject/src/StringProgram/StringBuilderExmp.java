package StringProgram;

import java.util.Scanner;

public class StringBuilderExmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		System.out.println(sb);

	}

}
