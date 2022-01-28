package Arrays;
import java.util.Scanner;
public class Array1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of students:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("the array size is:"+a.length);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of student:"+(i+1));
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("the marks of student"+(i+1)+"is:"+a[i]);
		}
			
	}

}
