package StringProgram;
/*
 * WAP to remove a specific character from the given string
 * Input string: apple
 * char to b removed: p
 * output: ale
 */
import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Char to be removed: ");
		String c1 = sc.nextLine();
		str1=str1.replace(c1, "");
		System.out.println(str1);
	}
	}
	        /*
	         String output = remove("apple", 'p');
	        System.out.println(output);
	    }

	    private static String remove(String input, char c) {

	        if (input == null || input.length() <= 1)
	            return input;
	        char[] inputArray = input.toCharArray();
	        char[] outputArray = new char[inputArray.length];
	        int outputArrayIndex = 0;
	        for (int i = 0; i < inputArray.length; i++) {
	            char p = inputArray[i];
	            if (p != c) {
	                outputArray[outputArrayIndex] = p;
	                outputArrayIndex++;
	            }

	        }
	        return new String(outputArray, 0, outputArrayIndex);

	    }
	}
	*/
/*
public class RemoveChar {
public static void main(String[] args) {
String str = "India is my country";
System.out.println(charRemoveAt(str, 7));
}
public static String charRemoveAt(String str, int p) {
return str.substring(0, p) + str.substring(p + 1);
}
*/