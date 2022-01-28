class Car extends Object{
	String brand;
	int cost;
	String color;
	
	Car(){
		super();
		System.out.println("Inside the class Car");
		}
	
public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	public String getColor() {
		return color;
	}
}
class Benz extends Car{//Benz is-a Car
		//since Benz extends the Car all non-private instance variables from Car class will also be available for Benz class
		Benz(String brand,int cost,String color){
			super();
			this.brand=brand;
			this.cost=cost;
			this.color=color;
		}
		//since Benz extends the Car all non-private methods(getters) from Car Class will also be available for Benz Class
	}
class Swift extends Car{//Swift is-a Car
			//since Swift extends the Car all non-private instance variables from Car class will also be available for Swift Class
			Swift(String brand,int cost,String color){
				super();
				this.brand=brand;
				this.cost=cost;
				this.color=color;
			}
			//since Swift extends the Car all non-private methods(getters) from Car Class will also be available for Swift Class
	}

public class LaunchCar {
	public static void main(String[] args) {
		Benz b = new Benz("Benz",500000,"Black");
		System.out.println(b.getBrand());
		System.out.println(b.getCost());
		System.out.println(b.getColor());
		System.out.println("------------------");
		Swift s = new Swift("Swift",500000,"White");
		System.out.println(s.getBrand());
		System.out.println(s.getCost());
		System.out.println(s.getColor());
	}
}