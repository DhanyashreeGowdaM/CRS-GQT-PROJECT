package StringProgram;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full Name :");
		String name1 = sc.nextLine();//it will collect all the words
		System.out.println("Your Name is collected as: "+name1);
		System.out.println("Enter your Name :");
		String name = sc.next();//it will collect only first word
		System.out.println("Your Name is collected as: "+name);
	}

}
