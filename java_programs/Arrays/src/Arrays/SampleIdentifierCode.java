package Arrays;
/*
 * Identifiers:
 * These are the names that are giev for:
 * a variable
 * a method
 * a class
 * an interface
 * 
 * Rules:
 * Rule-1 name of an identifier must not start with numeric values
 * Rule-2 name of an identifier must not contain any other special characters other than $ and _
 * Rule-3 name of an identifier can contain alphabets(upper case or lower case)
 * Rule-4 name of an identifier can contain mixture of numbers and alphabets
 * Rule-5 name of an identifier can contain mixture of numbers and special characters($ and _)
 * Rule-6 name of an identifier can contain mixture of numbers, special characters($ and _) and alphabets
 * Rule-7 There is no limitation on the size of identifiers
 */
public class SampleIdentifierCode {

	public static void main(String[] args) {
		//int 23 = 23;//Rule-1 name of an identifier must not start with numeric values
		//int %% = 23;//Rule-2 name of an identifier must not contain any other special character other than $ and _
		int a = 23;//Rule-3 name of an identifier can contain alphabets(upper case or lower case)
		int A = 23;//Rule-3 name of an identifier can contain alphabets(upper case or lower case)
		int a23 = 23;//Rule-4 name of an identifier can contain mixture of numbers and alphabets
		//int 23a = 23;//violation of rule-1
		int $23 = 23;//Rule-5 name of an identifier can contain mixture of numbers and special characters($ and _)
		int _23 = 23;//Rule-5 name of an identifier can contain mixture of numbers and special characters($ and _)
		int _23a$xyz = 23;//Rule-6 name of an identifier can contain mixture of numbers, special characters($ and _) and alphabets
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 23;
		//Rule-7 There is no limitation on the size of identifiers
	}

}
