package StringProgram;
/*
 * 6) reverse():
 * 7) setLength(): Sets new length to the string
 * 8) toString(): its belonging to immutable string category
 */
public class ReverseMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mahabharatha");
		//StringBuilder sb = new StringBuilder("Mahabharatha");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
		sb.setLength(20);//Sets new length to the string
		System.out.println(sb.length());
		String str = sb.toString();//its belonging to immutable string category
		System.out.println(str);
	}

}
