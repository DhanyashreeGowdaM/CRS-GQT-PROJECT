package Methods;
class Operation1{
	//called method
	void sum(int a,int b) {//input(parameters) is passed
		int c = a+b;
		System.out.println(c);
		}
}
public class exmp2 {
	//calling method
		public static void main(String[] args) {
			Operation1 op1 = new Operation1();
			op1.sum(10,20);//input passed
			
		}

	}
/*
In the above program we can notice that the 
Sum() is the called method and
main() is the calling method
the sum() is passed with parameter and also we can notice that sum()
is not returning any value to the calling method i.e, main() 
Hence we can conclude that the above program belongs to Type-2 method i.e 
Input and No Output

*/