package StringProgram;
/*
 * equalsIgnoreCase()  :  This method helps to compare the contents 
 * of the strings ignoring checking their cases and return a boolean value.
 * It returns true if the strings match else it will return false
 * 
 */
public class Program4B {

	public static void main(String[] args) {
		String name1 = "KRiShNa";//Constant Pool
		String name2 = "SwETHa";//Constant Pool
		if(name1.equalsIgnoreCase(name2)==true) {
			System.out.println("Strings references are equal");
		}
		else {
			System.out.println("Strings references are not equal");
		}
	}

}
//Output: Strings references are not equal


