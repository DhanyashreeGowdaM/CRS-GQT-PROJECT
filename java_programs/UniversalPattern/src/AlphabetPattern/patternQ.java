package AlphabetPattern;
import java.util.Scanner;
public class patternQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alue of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j<(n-1)*3/4 && j!=0) ||
						(j==0 && i!=0 && i<(n-1)*3/4) ||
						(j==(n-1)*3/4 && i!=0 && i<=(n-1)*3/4) ||
						(i==(n-1)*3/4 && j!=0 && j<=(n-1)*3/4) ||
						(i==j && j>=(n-1)/2))
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

