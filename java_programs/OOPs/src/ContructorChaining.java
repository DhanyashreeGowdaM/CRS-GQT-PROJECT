class MainCar extends Object{
	MainCar(){
		super();
		System.out.println("Inside MainCar construcotr");
	}
}

class Car4 extends MainCar{
	private int no_of_wheels;
	private String brand;
	private int cost;
	private int no_of_doors;
	private String color;
	
	public Car4() {
		super();
		System.out.println("Inside construcotr 1 of car 4");
	}
	//cons-2
	public Car4(String color) {
		super();
		System.out.println("Inside construcotr 2 of car 4");
		this.color = color;
	}
	//cons-3
	public Car4(int no_of_doors, String color) {
		super();
		System.out.println("Inside construcotr 3 of car 4");
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
	
public class ContructorChaining {

	public static void main(String[] args) {
		Car4 c1 = new Car4();
		Car4 c2 = new Car4("red");
		Car4 c3 = new Car4(2,"white");
		
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_doors());
		System.out.println(c1.getNo_of_wheels());
		System.out.println("----------------------");
		System.out.println(c2.getBrand());
		System.out.println(c2.getColor());
		System.out.println(c2.getCost());
		System.out.println(c2.getNo_of_doors());
		System.out.println(c2.getNo_of_wheels());
		System.out.println("----------------------");
		System.out.println(c3.getBrand());
		System.out.println(c3.getColor());
		System.out.println(c3.getCost());
		System.out.println(c3.getNo_of_doors());
		System.out.println(c3.getNo_of_wheels());
	}

}
