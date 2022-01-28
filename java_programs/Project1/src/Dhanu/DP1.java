package Dhanu;
import java.util.Scanner;
public class DP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user please enter the size of n:");
		int n = sc.nextInt();
		int count = 1;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
