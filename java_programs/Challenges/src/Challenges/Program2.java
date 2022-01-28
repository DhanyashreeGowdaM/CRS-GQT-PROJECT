package Challenges;
import java.util.Scanner;
/*
There are N number of baskets. We want to move apples between baskets 
so that all baskets have the same number of apples. What is the minimum 
number of apple that must be moved? It is guaranteed that there exists a 
way to move apples so as to have an equal number of apples in each basket.
Input: 2 1 3
Output:1
*/
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of baskets");
		int num = sc.nextInt();
		int sum=0;
		int total=0;
		int a[] = new int[num];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the number of apples in basket "+(i+1));
			a[i]=sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("sum:"+sum);
		int e = sum/num;
		System.out.println("Each basket contains:"+e);
		for(int i=0;i<a.length;i++)
		{
			int rem = e-a[i];//
			
			if(rem<0)
			{
				rem =- (rem);
			}
			else
			{
				rem = rem;
			}
			total = total + rem;
		}
		int move = total/2;
		System.out.println("total number of apples to be moved : "+move);
	}

}
