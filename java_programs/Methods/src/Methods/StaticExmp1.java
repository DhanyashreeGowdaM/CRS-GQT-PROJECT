package Methods;

import java.util.Scanner;

class Customer{
	int custid;
	String name;
	double pamount;
	double rate;
	double time;
	double si;
	
	void collectInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cust-Id");
		custid = sc.nextInt();
		System.out.println("Enter Cust-Name");
		name = sc.next();
		System.out.println("Enter the Principle");
		pamount = sc.nextInt();
		rate = 2.5f;
		System.out.println("Enter the time duration");
		time = sc.nextDouble();
	}
	
	void calculate() {
		double p = pamount;
		double t = time;
		double r = rate;
		si = (p*t*r)/100.00;
	}
	
	void display(){
		System.out.println("The simple interest for "+name+" is "+si);
	}
}

public class StaticExmp1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		c1.collectInfo();
		c2.collectInfo();
		
		c1.calculate();
		c2.calculate();
		
		c1.display();
		c2.display();

	}

}
