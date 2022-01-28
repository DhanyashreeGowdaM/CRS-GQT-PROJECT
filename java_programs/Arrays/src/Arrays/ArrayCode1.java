package Arrays;

public class ArrayCode1 {

	public static void main(String[] args) {
		String arr[] = new String[] {"Ram","Laxman","Bharath","Shatrugan"};
		//String arr[] = {"Ram","Laxman","Bharatg","Shatrugan"};
		System.out.println(arr.length);
		System.out.println(arr);
		//For each loop with arrays
		for(String s:arr) {
			System.out.println(s);
		}
}
}