package AlphabetPattern;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		int balance = 5000;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("withdraw");
			System.out.println("Deposit");
			System.out.println("Check balance");
			System.out.println("Choosing the operation");
			int n = s.nextInt();
			
			System.out.println("enter money to be withdraw");
			withdraw = s.nextInt();
			if(balance >= withdraw)
			{
				balance = balance - withdraw;
			}
			ATM a = new ATM();
			
		}
		
	}

}
