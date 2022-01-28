package Arrays;
import java.util.Arrays;
public class ArrayCode4 {

	public static void main(String[] args) {
		int arr[] = {23,43,11,45,32,5,7};
		Arrays.sort(arr);//sort the elements in ascending order
		System.out.println("Lowest element is:"+arr[0]);
		System.out.println("Highest element is:"+arr[arr.length-1]);

	}

}
