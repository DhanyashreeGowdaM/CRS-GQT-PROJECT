package AlphabetPattern;
import java.util.Scanner;
public class patternVINAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {//for V
				if((j==0 && i<=(n-1)/2) ||
						(j==(n-1) && i<=(n-1)/2) ||
						(i-j==(n-1)/2) ||
						(i+j==(n-1)+((n-1)/2)))
						{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");	
			for(int j=0;j<n;j++) {//for I
				if((i==0 && j<(n-1)/2) ||
						(i==(n-1) && j<(n-1)/2) || (j==(n-1)/4))
						{
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
                    System.out.print("  ");
                    for(int j=0;j<n;j++) {//for N
        				if(j==0 || j==(n-1) || i==j)
        						{
        					System.out.print("*");
        				}
        				else {
        					System.out.print(" ");
        				}
        			}
        			System.out.print("  ");
        			for(int j=0;j<n;j++) {//for A
    					if((i==0 && j<=(n-1)/2) || j==0 || j==(n-1)/2 ||
    							(i==(n-1)/2 && j<=(n-1)/2))
    							{
    						System.out.print("*");
    						}
    					else {
    						System.out.print(" ");
    					}
    				}
    	                    System.out.print("  ");
        			for(int j=0;j<n;j++) {//for Y
        				if((i==j && j<=(n-1)/2) || i+j==(n-1))
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


