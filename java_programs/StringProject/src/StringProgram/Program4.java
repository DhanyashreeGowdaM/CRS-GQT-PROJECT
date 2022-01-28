package StringProgram;
/*
 * equalsIgnoreCase()  :  This method helps to compare the contents 
 * of the strings ignoring checking their cases and return a boolean value.
 * It returns true if the strings match else it will return false
 * 
 */
public class Program4 {

	public static void main(String[] args) {
				String name1 = new String("KRiShNa");//Non-Constant Pool
				String name2 = new String("SwETHa");//Non-Constant Pool
				if(name1.equalsIgnoreCase(name2)==true) {
					System.out.println("Strings references are equal");
				}
				else {
					System.out.println("Strings references are not equal");
				}
			}

		}
//Output: Strings references are not equal