package AlphabetPattern;
import java.util.Scanner;
public class patterng {

					public static void main(String[] args) {
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the size:");
						int n = sc.nextInt();
						for(int i=0;i<n;i++){//for(i=0;i<=(n-1);i++)
							for(int j=0;j<n;j++) {
								if((i==0 && j<=(n-1)/2 && j!=0) ||
										(j==0 && i!=0 && i!=(n-1))||
										(i==(n-1)/2 && j>(n-1)/4 && j<(n-1)/2) ||
										(j==(n-1)/4 && i>(n-1)/2) ||
										(j==(n-1)/2 && i>(n-1)/2) ||
										(i==(n-1) && j!=0 && j<=(n-1)/4)) {
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

