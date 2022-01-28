class Car1{
	void start() {//inherited
		System.out.println("Car started");
	}
	void stop() {//inherited
		System.out.println("Car has been stoped");
	}
	void speed() {//Overridden
		System.out.println("speed of the Car");
	}
}

class Benz1 extends Car1{
	void stop() {//overridden
		System.out.println("Benz1 Car stops at greater speed");
	}
	void logo() {//Specialized
		System.out.println("Benz1 Car logo is Unique");
	}
}

class Audi extends Car1{
	void stop() {//overridden
		System.out.println("Audi car stops at medium speed");
	}
	void sunroof() {//Specialized
		System.out.println("Audi cars have sunroof");
	}
}

class Hyundai extends Car1{
	void stop() {//overridden
		System.out.println("Hyundai car stops at lower speed");
	}
	void Cheap() {//Specialized
		System.out.println("Hyundai car is offeredable");
	}
}
public class UMLCarExmp {

	public static void main(String[] args) {
		Benz1 b1 = new Benz1();
		Audi a = new Audi();
		Hyundai h = new Hyundai();
		
		System.out.println("Benz1 Car :");
		b1.start();//car class
		b1.stop();//car class
		b1.logo();//benz1 class
		b1.speed();//car class
		System.out.println("-------------");
		System.out.println("Audi Car :");
		a.start();//car class
		a.stop();//car class
		a.sunroof();//audi class
		a.speed();//car
		System.out.println("-------------");
		System.out.println("Hynudai Car :");
		h.start();//car class
		h.stop();//car class
		h.Cheap();//hyundai class
		h.speed();//car class
		
	}

}
