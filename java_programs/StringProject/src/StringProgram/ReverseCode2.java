package StringProgram;
/*
 * WAP to Reverse a String
 * input: RCB is the best
 * output: BCR si eht tseb
 */
import java.util.Scanner;
public class ReverseCode2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();//RCB is the best
		System.out.println(str1);
		String str2 = "";
		int temp = 0;
		int count = 0;
		//code to count number of words
		for(int i=0;i<str1.length();i++) 
		{
			if(str1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Total words="+(count+1));//it takes space as one word so we have to give +1 to find total words present in our code
		
		//array creation to store the word in reverse order
		String str[] = new String[count+1];//4 location
		
		for(int i=str1.length()-1;i>=0;i--) {
			if(str1.charAt(i)==' ') {
				str[temp] = str2;
				temp++;
				str2 = "";
			}
			else {
				str2 = str2 + str1.charAt(i);
			}
		}
		str[temp] = str2;
		
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}

	}

}
