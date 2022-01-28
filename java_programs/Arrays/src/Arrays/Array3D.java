package Arrays;
import java.util.Scanner;
public class Array3D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of Branches:");
		int m = sc.nextInt();
		System.out.println("Enter the Total Number of classes in each Branch:");
		int n = sc.nextInt();
		System.out.println("Enter the Total Number of students in each class ");
		int o = sc.nextInt();
		
		int a[] [] [] = new int[m] [n] [o];
		
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
		
