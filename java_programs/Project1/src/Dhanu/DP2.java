package Dhanu;
import java.util.Scanner;
public class DP2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("User please enter the size of n:");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("- ");
				}
				for(int j=1;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
