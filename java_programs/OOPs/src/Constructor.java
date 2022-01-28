class Car extends Object {
	int no_of_wheels;
	String brand;
	int cost;
	int no_of_doors;
	String color;
	
	//Zero parameterized constructor
	public Car() {
		super();
		no_of_wheels = 4;
		no_of_doors = 2;
		color = "white";
		cost = 2500000;
		brand = "benz";
	}
	//Parameterized constructor
	public Car(int no_of_wheels,String brand) {
		this.no_of_wheels = no_of_wheels;
		this.brand = brand;
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
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	}

public class Constructor {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_doors());
		System.out.println(c1.getNo_of_wheels());
		System.out.println("-----------------------");
		Car c2 = new Car(4,"Audi");
		System.out.println(c2.getBrand());
		System.out.println(c2.getColor());
		System.out.println(c2.getCost());
		System.out.println(c2.getNo_of_doors());
		System.out.println(c2.getNo_of_wheels());
	}

}
