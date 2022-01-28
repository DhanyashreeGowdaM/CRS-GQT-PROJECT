package Methods;
//called method
class Operation3{
	int sum(int a,int b) {
		int c = a+b;
		return c;
		}
}
public class exmp4 {
//calling method
	public static void main(String[] args) {
		Operation3 op3 = new Operation3();
		int res = op3.sum(10,20);
		System.out.println(res);
	}

}
/*
In the above program we can notice that the 
Sum() is the called method and
main() is the calling method
the sum() is passed with any parameter and also we can notice that sum()
is returning value to the calling method i.e, main() 
Hence we can conclude that the above program belongs to Type-4 method i.e Input Output
*/
