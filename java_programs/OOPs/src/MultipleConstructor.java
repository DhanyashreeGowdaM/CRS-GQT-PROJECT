class Car3{
	private int no_of_wheels;
	private String brand;
	private int cost;
	private int no_of_doors;
	private String color;
	
	//cons-1
	public Car3() {
		super();
	}
	//cons-2
	public Car3(String color) {
		super();
		this.color = color;
	}
	//cons-3
	public Car3(int no_of_doors, String color) {
		super();
		this.no_of_doors = no_of_doors;
		this.color = color;
	}
	//cons-4
	public Car3(int cost, int no_of_doors, String color) {
		super();
		this.cost = cost;
		this.no_of_doors = no_of_doors;
		this.color = color;
	}
	//cons-5
	public Car3(String brand, int cost, int no_of_doors, String color) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.no_of_doors = no_of_doors;
		this.color = color;
	}
	//cons-6
	public Car3(int no_of_wheels, String brand, int cost, int no_of_doors, String color) {
		super();
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

public class MultipleConstructor {

	public static void main(String[] args) {
	Car3 c1 = new Car3();//call for cons-1
	Car3 c2 = new Car3("red");//call for cons-2
	Car3 c3 = new Car3(2,"white");//call for cons-3
	Car3 c4 = new Car3(2500000,2,"white");//call for cons-4
	Car3 c5 = new Car3("benz",2500000,2,"white");//call for cons-5
	Car3 c6 = new Car3(4,"benz",2500000,2,"white");//call for cons-6
	}
}
