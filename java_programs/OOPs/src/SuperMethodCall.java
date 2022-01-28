class MainCar extends Object{
	int no_of_wheels;
	String brand;
	int cost;
	int no_of_doors;
	String color;
	
	MainCar(){
		super();
		System.out.println("Inside MainCar construcotr");
	}
	MainCar(int no_of_wheels){
		super();
		this.no_of_wheels = no_of_wheels;
	}
}
class car3 extends MainCar{
	public car3() {
		super(4);
		System.out.println("Inside construcotr 1 of car3");
	}
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	public int getNo_of_doors() {
		return no_of_doors;
	}
	public String getColor() {
		return color;
	}	
}


public class SuperMethodCall {

	public static void main(String[] args) {
		car3 c1 = new car3();
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_doors());
		System.out.println(c1.getNo_of_wheels());

	}

}
