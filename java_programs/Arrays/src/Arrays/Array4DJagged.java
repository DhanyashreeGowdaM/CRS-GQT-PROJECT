package Arrays;
import java.util.Scanner;
public class Array4DJagged {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of Trusts:");
		int m = sc.nextInt();
		int n,o,p;
		int a[] [] [] [] = new int[m][][][];

		//loop for collecting the branch count in each trust
		for(int i=0;i<m;i++) {
			System.out.println("Enter the number of branches in trust "+i);
			n = sc.nextInt();
			a[i] = new int[n][][];	
	}
		//loop for collecting the class count in each branch of the trust
				for(int i=0;i<a.length;i++) {
					System.out.println("Collecting student count for branch from trust "+i);
					for(int j=0;j<a[i].length;j++) {
					System.out.println("Enter the student count inside branch "+j);
					o = sc.nextInt();
					a[i] [j] = new int[o][];
					}
			}
				//collecting student count in each class of branch inside the trust
				for(int i=0;i<a.length;i++) {
					System.out.println("Collecting student count for branch from trust "+i);
					for(int j=0;j<a[i].length;j++) {
					System.out.println("Enter the student count inside the class of branch "+j);
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println("Enter the student count inside the class "+k);
					p = sc.nextInt();
					a[i] [j] [k] = new int[p];
					}
			}

				}	
	}
		
}
