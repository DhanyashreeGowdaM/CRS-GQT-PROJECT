package StringProgram;
//WAP to check if the given string is pangram or not
public class PanagramCode {

	public static void main(String[] args) {
		String s = "abcde fghijklmn opqrstu vwxyz";
		//step-1: replace all the white space with non-space
		s = s.replace(" ", "");
		System.out.println("Strings after removal of spaces: "+s);
		
		//step-2: convert string to character array by moving it into either upper case or lower case
		s=s.toUpperCase();
		char[] c1 = s.toCharArray();
		
		//step-3: create a int array with 26 positions and default values
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		//step-4: traverse the string to check for all the characters
		int i= 0;
		while(i != (c1.length)) {
			int j = c1[i]-65;//A - 65 --->65-65=0--->j=0
			arr[j] = 1;//arr[0]
			++i;
		}
		//step-5: checking if the string is pangram or not
		i=0;
		while(i != (arr.length)) {
			if(arr[i]>=1) {
				++i;
			}
			else {
				System.out.println("Not a pangram");
				System.exit(0);//halts the execution of the program
				
			}
		}
		System.out.println("It is pangram");

	}

}
