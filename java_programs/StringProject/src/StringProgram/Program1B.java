package StringProgram;
import java.util.Scanner;
public class Program1B {
	/*
	 * type 2: String Creation using new operator
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full Name :");
		//String Creation using new operator
		String name1 = new String(sc.nextLine());//it will collect all the words
		System.out.println("Your Name is collected as: "+name1);

	}

}
