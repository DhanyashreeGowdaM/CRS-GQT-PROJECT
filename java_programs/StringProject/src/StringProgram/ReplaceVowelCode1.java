package StringProgram;
import java.util.Scanner;
/*
 * WAP to replace all the vowels in the string by following symbols
 * a,A = @
 * e,E = #
 * i,I = $
 * o,O = &
 * u,U = %
 */
public class ReplaceVowelCode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		String str2 = "";
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' ||str1.charAt(i)=='A')
			{
				str2=str2+"@";
			}
			else if(str1.charAt(i)=='e' ||str1.charAt(i)=='E')
			{
				str2= str2+"#";
			}
			else if(str1.charAt(i)=='i'||str1.charAt(i)=='I')
			{
				str2= str2+"$";
			}
			else if(str1.charAt(i)=='o'||str1.charAt(i)=='O')
			{
				str2= str2+"&";
			}
			else if(str1.charAt(i)=='u'||str1.charAt(i)=='U')
			{
				str2= str2+"%";
			}
			else
			{
				str2= str2+ str1.charAt(i);
			}
		}
		System.out.println(str2);
		}
		}