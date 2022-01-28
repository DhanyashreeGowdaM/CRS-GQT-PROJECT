class Car{
	void start() {//inherited
		System.out.println("Car starts");
	}
	void stop() {//inherited
		System.out.println("Car stops");
	}
	void speed() {//Overridden
		System.out.println("speed of Car is 60km/hr");
	}
}

class Benz extends Car{
	void stop() {//overridden
		System.out.println("speed of Car is 80km/hr");
	}
	void logo() {//Specialized
		System.out.println("Benz logo");
	}
}

class Audi extends Car{
	void stop() {//overridden
		System.out.println("speed of Car is 100km/hr");
	}
	void sunroof() {//Specialized
		System.out.println("sunroof type : skyroof");
	}
}

class Hyundai extends Car{
	void stop() {//overridden
		System.out.println("speed of Car is 90km/hr");
	}
	void Cheap() {//Specialized
		System.out.println("Price is 15 lakh");
	}
}
public class CarSpecializedRefType {

	public static void main(String[] args) {
		Benz b = new Benz();
		Audi a = new Audi();
		Hyundai h = new Hyundai();
		
		Car ref;
		ref = b;
		System.out.println("Benz Car :");
		ref.start();//car class
		ref.stop();//car class
		b.logo();//benz1 class
		ref.speed();//car class
		System.out.println("-------------");
		ref = a;
		System.out.println("Audi Car :");
		ref.start();//car class
		ref.stop();//car class
		a.sunroof();//audi class
		ref.speed();//car
		System.out.println("-------------");
		ref = h;
		System.out.println("Hynudai Car :");
		ref.start();//car class
		ref.stop();//car class
		h.Cheap();//hyundai class
		ref.speed();//car class
		
	}

}
