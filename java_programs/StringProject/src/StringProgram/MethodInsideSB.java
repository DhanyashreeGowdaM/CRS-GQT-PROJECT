package StringProgram;
/*
 * Methods inside StringBuffer and StringBuilder
 * 1) append() :
 * This is used to merge the content passed to it on to the given string
 */
public class MethodInsideSB {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mahabharatha");
		//StringBuilder sb = new StringBuilder("Mahabharatha");
		sb.append(false);//Mahabharathafalse
		sb.append('r');//Mahabharathar
		sb.append(2.34567);//Mahabharatha2.34567
		System.out.println(sb);

	}

}
//Both SB gives same output "//" comment it to check the output properly