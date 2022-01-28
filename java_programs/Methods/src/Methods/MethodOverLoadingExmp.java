package Methods;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a,float b) {
		return a+b;
	}
	float add(float a,float b,float c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, double b,double c) {
		return a+b+c;
	}
	float add(int a,float b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(float a,double b) {
		return a+b;
	}
}
public class MethodOverLoadingExmp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10.5f, 20.5f));
		System.out.println(c.add(10.23, 20.45));
		System.out.println(c.add(10, 20, 30));
		System.out.println(c.add(10.5f, 20.5f, 30.5f));
		System.out.println(c.add(10.23, 20.23, 30.23));
		System.out.println(c.add(10, 20.5f));
		System.out.println(c.add(10, 20.5));
		System.out.println(c.add(10.5f, 20.34));
		}

}
