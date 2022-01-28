package Arrays;
import java.util.Scanner;
public class Array3DJagged {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of Branches:");
		int m = sc.nextInt();
		int n,o;
		int a[] [] [] = new int[m] [] [];
		
		//loop for collecting the class count in each branch
		for(int i=0;i<m;i++) {
			System.out.println("Enter the number of classes in branch "+i);
			n = sc.nextInt();
			a[i] = new int[n] [];//the empty [] represents the student count which is unknown here
		}
		
		//loop for collecting the student count in each class of the branch
		for(int i=0;i<a.length;i++) {
			System.out.println("Collecting student count for branch "+i);
			for(int j=0;j<a[i].length;j++) {
			System.out.println("Enter the student count inside class "+j);
			o = sc.nextInt();
			a[i] [j] = new int[o];
			}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Inside Branch"+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Inside class"+(j+1));
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("Enter the marks of student "+(k+1));
					a[i][j][k] = sc.nextInt();
	}

}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Inside Branch"+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Inside class"+(j+1));
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("Enter the marks of student "+(k+1)+"is :" +a[i][j][k]);
		}
			}
		}
	}
}
