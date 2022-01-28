package StringProgram;
/*
 *2) capacity(): This will return the capacity of the SB.The inital capacity
 * of SB is 16
 */
public class CapacityMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mahabharatha");
		//StringBuilder sb = new StringBuilder("Mahabharatha");
		int capacity = sb.capacity();
		System.out.println(capacity);
	}

}
