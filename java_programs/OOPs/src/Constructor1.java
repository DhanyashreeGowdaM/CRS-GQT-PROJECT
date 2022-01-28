class Car1 extends Object {
	int no_of_wheels;
	String brand;
	int cost;
	int no_of_doors;
	String color;
	//Case-1
	/*Car1(String brand){
	 * this.brand = brand;
	 * }
	 */
	//Case-2
	public Car1() {
		super();
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
public class Constructor1 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getCost());
		System.out.println(c1.getNo_of_doors());
		System.out.println(c1.getNo_of_wheels());
		
	}

}
