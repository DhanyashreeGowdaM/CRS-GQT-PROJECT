package Methods;
class SampleExmp {
	static int a,b;//Static Variables
	int c,d;//Non-Static Variables
	
	//Static Block
	static {
		a = 10;
		b = 20;
	}
	//Non-Static Block
	{
		c = 30;
		d = 40;
	}
	
	//Static Method
	static void disp1() {
		System.out.println(a);
		System.out.println(b);
	}
	//Non-Static Method
	void disp2() {
		System.out.println(c);
		System.out.println(d);
	}
}
public class StaticExmp {

	public static void main(String[] args) {
		SampleExmp se = new SampleExmp();
		se.disp1();
		se.disp2();
	}

}
