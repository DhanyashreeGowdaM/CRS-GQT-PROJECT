class Plane1{
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

class CargoPlane1 extends Plane1{
	void fly() {//overridden
		System.out.println("CargoPlane is flying at lower heights");
	}
}

class FighterPlane1 extends Plane1{
	void fly() {//overridden
		System.out.println("FighterPlane is flying at greater heights");
	}
}

class PrivatePlane1 extends Plane1{
	void fly() {//overridden
		System.out.println("PrivatePlane is flying at medium heights");
	}
}
class Airport{
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		}
}
public class LaunchPlane {

	public static void main(String[] args) {
		CargoPlane1 c1 = new CargoPlane1();
		FighterPlane1 f1 = new FighterPlane1();
		PrivatePlane1 p1 = new PrivatePlane1();
		Airport a = new Airport();
		
		System.out.println("Cargo Plane1 :");
		a.permit(c1);
		System.out.println("---------------------");
	
		System.out.println("Fighter Plane1:");
		a.permit(f1);
		System.out.println("---------------------");
		
		System.out.println("Private Plane1 :");
		a.permit(p1);
		System.out.println("---------------------");

	}

}
