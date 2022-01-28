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
public class UMLDiagramPlaneExmp {

	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		FighterPlane f = new FighterPlane();
		PrivatePlane p = new PrivatePlane();
		
		System.out.println("Cargo Plane :");
		c.takeOff();//from Plane class
		c.fly();//from Cargo Plane Class
		c.land();//from Plane class
		System.out.println("---------------------");
		
		System.out.println("Fighter Plane :");
		f.takeOff();//from Plane class
		f.fly();//from Fighter Plane Class
		f.land();//from Plane class
		System.out.println("---------------------");
		
		System.out.println("Private Plane :");
		p.takeOff();//from Plane class
		p.fly();//from Private Plane Class
		p.land();//from Plane class
		
	}

}
