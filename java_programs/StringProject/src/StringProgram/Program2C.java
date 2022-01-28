package StringProgram;

public class Program2C {

	public static void main(String[] args) {
		String name1 = new String("Krishna");//Non-Constant Pool
		String name2 = new String("Swetha");//Non-Constant Pool
		
		if(name1.equals(name2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
