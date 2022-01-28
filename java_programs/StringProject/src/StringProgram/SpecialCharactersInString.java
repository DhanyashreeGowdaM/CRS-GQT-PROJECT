package StringProgram;
/*
 * WAP to print all the special character in the string at the beginning
 * input: hello%%%%@ @good@@ @@*morning)))
 * output: %%%%@@@@@@*)))  hellogoodmorning
 */
public class SpecialCharactersInString {

	public static void main(String[] args) {
	String s1 = "hello%%%%@ @good@@ @@*morning))) ";
	String s2 = "";
	String s3 = "";
	
	for(int i=0;i<s1.length();i++) {
		if((s1.charAt(i)>64 && s1.charAt(i)<91) || (s1.charAt(i)>96 && s1.charAt(i)<123)) {
			s2=s2+s1.charAt(i);
	}
	else {
		s3=s3+s1.charAt(i);
	}
		
	}
	s2=s3+s2;
	System.out.println(s2);

	}

}

