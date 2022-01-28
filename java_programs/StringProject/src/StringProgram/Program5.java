package StringProgram;
/*compareTo()  : This method helps to compare the contents of the strings
 *  character by character. 
 * If any character is found to b mismatched during the comparision then
 * the ASCII value of those characters will be collected and the difference
 * will be returned.
 * If the compareTo() returns 0 as the output the strings are equal else if 
 * any other number is returned the strings are not equal
 */
public class Program5 {

	public static void main(String[] args) {
		String name1 = "Krishna";//Constant Pool
		String name2 = "Swetha";//Constant Pool
		int res = name1.compareTo(name2);
		System.out.println(res);//-8
		if(res == 0) {
			System.out.println("Strings references are equal");
		}
		else {
			System.out.println("Strings references are not equal");
		}
	}

}
//Output: -8
//Strings references are not equal	
//ASCII value of K is 75 and for S is 83. 
//The difference between 75 and 83 is -8 so we getting -8 as output
