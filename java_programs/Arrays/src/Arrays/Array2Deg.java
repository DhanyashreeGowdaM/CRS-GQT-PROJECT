package Arrays;
import java.util.Scanner;
public class Array2Deg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of classes:");
		int m = sc.nextInt();
		
		int a[] [] = new int[m] [];
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter the Total number of students in class"+(i+1));
			a[i] = new int[sc.nextInt()];
	}
		System.out.println("the array size is :"+a.length);
		for(int i=0;i<m;i++)
		{
			System.out.println("Inside class:"+i);
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the marks of student:"+(j+1));
			a[i] [j] = sc.nextInt();
		}
	}
		for(int i=0;i<m;i++)
		{
			System.out.println("Inside class:"+i);
			for(int j=0;j>a[i].length;j++)
			{
				System.out.println("the marks of student"+(j+1)+" is: "+a[i][j]);
}
		}
	}
}

