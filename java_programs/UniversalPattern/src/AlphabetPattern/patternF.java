package AlphabetPattern;
import java.util.Scanner;
public class patternF {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of n:");
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++) {
					if(j==0 ||
							(i==0 && j<=(n-1)/2) ||
							(i==(n-1)/2 && j<=(n-1)/2))
							{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
				}
	                    System.out.println();
		}

		}

	}
