package Arrays;
import java.util.Scanner;
public class Array4D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of Trust :");
		int m = sc.nextInt();
		System.out.println("Enter the Total Number of Branches:");
		int n = sc.nextInt();
		System.out.println("Enter the Total Number of classes in each Branch: ");
		int o = sc.nextInt();
		System.out.println("Enter the Total Number of students in each class ");
		int p = sc.nextInt();
		
		int a[] [] [] [] = new int[m] [n] [o] [p];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Inside Trust"+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Inside Branch"+(j+1));
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("Inside class "+(k+1));
					for(int l=0;l<a[i][j][k].length;l++)
					{
						System.out.println("Enter the marks of student "+(l+1));
					
					a[i][j][k][l] = sc.nextInt();		
	}

}
		}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Inside Trust"+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Inside Branch"+(j+1));
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("Inside Class"+(k+1));
					for(int l=0;l<a[i][j][k].length;l++)
					{
						System.out.println("Enter the marks of student "+(l+1)+"is :" +a[i][j][k][l]);
		}
			}
		}
	}
}	
}
