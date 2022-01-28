package Methods;
//called method
class Operation2{
	int sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;//value is returned
		}
}
public class exmp3 {
//calling method
	public static void main(String[] args) {
		Operation2 op2 = new Operation2();
		int res = op2.sum();
		System.out.println(res);
		
	}

}
/*
In the above program we can notice that the 
Sum() is the called method and
main() is the calling method
the sum() is not passed with any parameter and also we can notice that sum()
is returning any value to the calling method i.e, main() 
Hence we can conclude that the above program belongs to Type-3 method i.e 
No Input but Output

*/