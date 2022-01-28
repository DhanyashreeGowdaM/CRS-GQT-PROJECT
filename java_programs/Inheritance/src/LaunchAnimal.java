class Animal extends Object{
	String name;
	int age;
	String country;
	
	Animal(){
		super();
		System.out.println("Inside the class Animal");
		}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}
	
}

class Lion extends Animal{//Lion is-a Animal
//since lion extends the animal all non-private instance variables from Animal class will also be available for Lion class
	Lion(String name,int age,String country){
		super();
		this.name=name;
		this.age=age;
		this.country=country;
	}
//since Lion extends the Animal all non-private methods(getters) from Animal Class will also be available for Lion Class
}
class Tiger extends Animal{//Lion is-a Animal
	//since tiger extends the animal all non-private instance variables from Animal class will also be available for Tiger class
		Tiger(String name,int age,String country){
			super();
			this.name=name;
			this.age=age;
			this.country=country;
		}
	//since Tiger extends the Animal all non-private methods(getters) from Animal Class will also be available for Tiger Class
	}
public class LaunchAnimal {

	public static void main(String[] args) {
		Lion l = new Lion("Ramu",5,"Africa");
		System.out.println(l.getName());
		System.out.println(l.getAge());
		System.out.println(l.getCountry());
		System.out.println("------------------");
		Tiger t = new Tiger("Laxman",4,"India");
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(t.getCountry());

	}

}
