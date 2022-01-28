package StringProgram;
/*
 * 5) ensureCapacity(int cpty): This will alter the initial capacity
 */
public class EnsureCapacityMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mahabharatha");
		//StringBuilder sb = new StringBuilder("Mahabharatha");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(38);
		System.out.println(sb.capacity());

	}

}
