package StringProgram;
/*WAP to replace all the Lower Case alphabets by Upper Case and 
 * Upper Case alphabets by Lower Case
 * 
 * range of A - Z = 65 to 90
 * range of a - z = 97 to 122
 * difference between upper case letter and lower case letter = 32
 */
public class LowerToUpperAndUpperToLower {

	public static void main(String[] args) {
		//Approach-1
		
		String s = "Hello Rama";
		String s1 = "";
		char ch[]=s.toCharArray();
		for(char c:ch) {//for each loop // for(Object o : value/variable){
			if(((int) c>=65)&&((int)c<=90)) {
				s1=s1+Character.toLowerCase(c);
			}
			else if(((int) c>=97)&&((int)c<=122)) {
				s1=s1+Character.toUpperCase(c);
			}
			else {
				s1=s1+c;
			}
		}
		System.out.println(s1);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		
		//Approach-2
		String str1 = "SitaRa#mA";
		StringBuffer sb = new StringBuffer(str1);
		for(int i=0;i<str1.length();i++) {
			if(Character.isLowerCase(str1.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str1.charAt(i)));	
			}
			else if(Character.isUpperCase(str1.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			
			}
			else {
				sb.setCharAt(i, str1.charAt(i));
			}
		}
		System.out.println("String after case conversion :"+sb);
}
}