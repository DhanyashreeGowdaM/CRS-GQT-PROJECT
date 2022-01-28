package Dhanu;
import java.util.Scanner;
public class DP4 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Scanf("%d",&n);
			System.out.println("User please enter the size of n:");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					if(i==1 || i==n || j==1 || j==i) {
						System.out.print("* ");
					}
					else {
						System.out.print("- ");
					}
				}
				System.out.println();
			}
		}
	}
