class MainCar extends Object{
	MainCar(){
		super();
		System.out.println("Inside MainCar construcotr");
	}
}

class Car5 extends MainCar{
	private int no_of_wheels;
	private String brand;
	private int cost;
	private int no_of_doors;
	private String color;
	
	public Car5() {
		super();
		System.out.println("Inside construcotr 1 of car 5");
	}
	//cons-2
	public Car5(String color) {
		this(2,"red");
		System.out.println("Inside construcotr 2 of car 5");
		this.color = color;
	}
	//cons-3
			public Car5(int no_of_doors, String color) {
				this(3500000,2,"yellow");
				System.out.println("inside constructor 3 of car 5");
				this.no_of_doors = no_of_doors;
				this.color = color;
			}
	//cons-4
			public Car5(int cost, int no_of_doors, String color) {
				this("benz",2500000,2,"blue");
				System.out.println("inside constructor 4 of car 5");
				this.cost = cost;
				this.no_of_doors = no_of_doors;
				this.color = color;
			}
	//cons-5
			public Car5(String brand, int cost, int no_of_doors, String color) {
				this(4,"benz",2500000,2,"blue");
				System.out.println("inside constructor 5 of car 5");
				this.brand = brand;
				this.cost = cost;
				this.no_of_doors = no_of_doors;
				this.color = color;
			}
	//cons-6
			public Car5(int no_of_wheels, String brand, int cost, int no_of_doors, String color) {
				this();
				System.out.println("inside constructor 6 of car 5");
				this.no_of_wheels = no_of_wheels;
				this.brand = brand;
				this.cost = cost;
				this.no_of_doors = no_of_doors;
				this.color = color;
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

public class LocalAndConsChaining {

	public static void main(String[] args) {
		Car5 c1 = new Car5("red");
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_doors());
		System.out.println(c1.getNo_of_wheels());

	}

}
