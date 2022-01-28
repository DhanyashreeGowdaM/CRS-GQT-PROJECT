class Plane{
	void takeOff() {//inherited
		System.out.println("Plane took off");;
	}
	void fly() {//overridden
		System.out.println("Plane is flying");
	}
	void land() {//inherited
		System.out.println("Plane is landed");
	}
}

class CargoPlane extends Plane{
	void fly() {//overridden
		System.out.println("CargoPlane is flying at lower heights");
	}
}

class FighterPlane extends Plane{
	void fly() {//overridden
		System.out.println("FighterPlane is flying at greater heights");
	}
}

class PrivatePlane extends Plane{
	void fly() {//overridden
		System.out.println("PrivatePlane is flying at medium heights");
	}
}

public class ParentTypeRefToChildTypeObject {

	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		FighterPlane f = new FighterPlane();
		PrivatePlane p = new PrivatePlane();
		
		Plane ref;
		ref = c;
		System.out.println("Cargo Plane :");
		ref.takeOff();//from Plane class
		ref.fly();//from Cargo Plane Class
		ref.land();//from Plane class
		System.out.println("---------------------");
		
		ref = f;
		System.out.println("Fighter Plane :");
		f.takeOff();//from Plane class
		f.fly();//from Fighter Plane Class
		f.land();//from Plane class
		System.out.println("---------------------");

		ref = p;
		System.out.println("Private Plane :");
		ref.takeOff();//from Plane class
		ref.fly();//from Fighter Plane Class
		ref.land();//from Plane class
		System.out.println("---------------------");

	}

}
