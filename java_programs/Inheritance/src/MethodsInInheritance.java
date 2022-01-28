class Animal1{//Parent
	void eat() {//Type-2:Overridden Method
		System.out.println("Animal Eats food");
	}
	void run() {//Type-2:Overridden Method
		System.out.println("Animal Runs");
	}
	void sleeps() {//Type-1:Inherited Method
		System.out.println("Animal sleeps");
	}
}

class Tiger1 extends Animal1{//child
	void eat() {//Type-2:Overridden Method from Parent class
		System.out.println("Tiger Eats Meat");
	}
	void run() {//Type-2:Overridden Method from Parent class
		System.out.println("Tiger Runs at quicker pace");
	}
	void scars() {//Type-3:Specialized Method
		System.out.println("Tiger will have black scars on its body");
	}
}

class Lion1 extends Animal1{//child
	void eat() {//Type-2:Overridden Method from Parent class
		System.out.println("Lion Eats fresh Meat");
	}
	void run() {//Type-2:Overridden Method from Parent class
		System.out.println("Lion Runs at medium pace");
	}
	void hairs() {//Type-3:Specialized Method
		System.out.println("male lions will have hairs on its face");
	}
}

class Elephant extends Animal1{//child
	void eat() {//Type-2:Overridden Method from Parent class
		System.out.println("Elephant Eats green leaves,fruits and vegetables");
	}
	void run() {//Type-2:Overridden Method from Parent class
		System.out.println("Tiger Runs at very slow pace");
	}
	void trunk() {//Type-3:Specialized Method
		System.out.println("Elephant has a long trunk");
	}
}
public class MethodsInInheritance {

	public static void main(String[] args) {
		Tiger1 t = new Tiger1();
		Lion1 l = new Lion1();
		Elephant e = new Elephant();
		
		t.eat();
		t.run();
		t.scars();
		t.sleeps();
		System.out.println("----------------");
		l.eat();
		l.run();
		l.hairs();
		l.sleeps();
		System.out.println("----------------");
		e.eat();
		e.run();
		e.sleeps();
		e.trunk();

	}

}
