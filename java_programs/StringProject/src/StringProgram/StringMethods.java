package StringProgram;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Ramayana Is one of the BEST STORIES";
		String s2 = "";
		System.out.println("Original String:"+s1);
		//UpperCase()
		System.out.println("Upper Case : "+s1.toUpperCase());
		//LowerCase()
		System.out.println("Lower Case : "+s1.toLowerCase());
		//length()
		System.out.println("Length is : "+s1.length());
		//charAt(int i)
		System.out.println("Char at the given pos is : "+s1.charAt(25));
		//contains(String s)
		System.out.println("the result of contains is : "+s1.contains("one"));
		System.out.println("the result of contains is : "+s1.contains("two"));
		//contentEquals(String s)
		System.out.println("the result of contentEquals is : "+s1.contentEquals("Ramayana Is one of the BEST STORIES"));
		//endsWith(String s)
		System.out.println("the result of endsWith() is : "+s1.endsWith("STORIES"));
		System.out.println("the result of endsWith() is : "+s1.endsWith("Lorries"));
		//startsWith(String s)
		System.out.println("the result of startsWith() is : "+s1.startsWith("Ram"));
		System.out.println("the result of startsWith() is : "+s1.startsWith("sham"));
		//getclass()
		System.out.println("the result of getClass() is : "+s1.getClass());
		//indexOf(char c)
		System.out.println("the char B is in index : "+s1.indexOf('B'));
		System.out.println("the char a is in index : "+s1.indexOf('a'));
		System.out.println("the char z is in index : "+s1.indexOf('z'));//gives -ve value which means the char is not present in the seq
		//isEmpty()
		System.out.println("the result of isEmpty() is : "+s1.isEmpty());
		System.out.println("the result of isEmpty() is : "+s2.isEmpty());
		//lastIndexOf(char c)
		System.out.println("the last occurance of a is at : "+s1.lastIndexOf('a'));
	}

}

/*String s1 = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
String s2 = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
//System.out.println("Original String:"+s1+s2);

System.out.println("Upper Case : "+s1.toUpperCase());

System.out.println("Lower Case : "+s2.toLowerCase());
*/