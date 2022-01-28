package Methods;
//called method
class Operation{
	void sum() {//no input(no parameters) is passed
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		}
}
public class exmp1 {
//calling method
	public static void main(String[] args) {
		Operation op = new Operation();
		op.sum();
		
	}

}
/*
In the above program we can notice that the 
Sum() is the called method and
main() is the calling method
the sum() is not passed with any parameter and also we can notice that sum()
is not returning any value to the calling method i.e, main() 
Hence we can conclude that the above program belongs to Type-1 method i.e 
No Input No Output

*/