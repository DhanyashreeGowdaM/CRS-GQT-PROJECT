package StringProgram;
/*
 *3) delete(int start_pos,end_pos): this will remove the chars from the 
 *string in the specified range 
 *4) deleteCharAt(int index): this will remove the chars from the string in 
 *the specified Position 
 */
public class DeleteMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mahabharatha");
		//StringBuilder sb = new StringBuilder("Mahabharatha");
		System.out.println(sb.length());
		sb.delete(2, 8);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

	}

}
