package StringProgram;
/*
 * == : this is used to compare the references of the strings.
 * it returns true if the strings references match else it will return false
 * 
 */
public class Program3A {

	public static void main(String[] args) {
		String name1 = "Krishna";//Constant Pool
		String name2 = "Krishna";//Constant Pool
		if(name1==name2) {
			System.out.println("Strings references are equal");
		}
		else {
			System.out.println("Strings references are not equal");
		}
	}
	}

//output: Strings references are equal