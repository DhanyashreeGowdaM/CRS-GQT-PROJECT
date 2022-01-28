package StringProgram;
/*
 * 1. Equals(); This method helps to compare the contents of the strings 
 * and return a boolean value.
 * It returns true if the strings match else it will return false.
 */
public class Program2 {

	public static void main(String[] args) {
		String name1 = "Krishna";//Constant Pool
		String name2 = "Swetha";//Constant Pool
		
		if(name1.equals(name2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
