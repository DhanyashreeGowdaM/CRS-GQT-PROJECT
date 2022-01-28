package StringProgram;
//WAP to Swap contents of the 2 strings
public class Swap2StringsCode {

	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "sita";
		String temp="";
		
		System.out.println("Before swap: first string="+s1+" & second string="+s2);
		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("After swap: first string="+s1+" & second string="+s2);

	}

}
