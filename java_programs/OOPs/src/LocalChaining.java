class car2{
	private int no_of_wheels;
	private String brand;
	private int cost;
	private int no_of_doors;
	private String color;
	
	//cons-1
	public car2() {
		this("red");
		System.out.println("inside constructor 1");
	}
	//cons-2
		public car2(String color) {
			this(2,"blue");
			System.out.println("inside constructor 2");
			this.color = color;
		}
		//cons-3
		public car2(int no_of_doors, String color) {
			this(2500000,2,"blue");
			System.out.println("inside constructor 3");
			this.no_of_doors = no_of_doors;
			this.color = color;
		}
		//cons-4
		public car2(int cost, int no_of_doors, String color) {
			this("benz",2500000,2,"blue");
			System.out.println("inside constructor 4");
			this.cost = cost;
			this.no_of_doors = no_of_doors;
			this.color = color;
		}
		//cons-5
		public car2(String brand, int cost, int no_of_doors, String color) {
			this(4,"benz",2500000,2,"blue");
			System.out.println("inside constructor 5");
			this.brand = brand;
			this.cost = cost;
			this.no_of_doors = no_of_doors;
			this.color = color;
		}
		//cons-6
		public car2(int no_of_wheels, String brand, int cost, int no_of_doors, String color) {
			super();
			System.out.println("inside constructor 6");
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
	
public class LocalChaining {

	public static void main(String[] args) {
	car2 c1 = new car2();	
	}
}
