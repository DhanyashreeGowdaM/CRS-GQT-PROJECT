package Arrays;
import java.util.Arrays;
public class ArrayCode6 {

	public static void main(String[] args) {
		int arr[] = {25,30,35,40,45,50};
		int arr1[] = {25,50,100,75,125,35};
		int arr2[] = {25,30,35,40,45,50};
		boolean res = Arrays.equals(arr, arr1);
		System.out.println(res);
		boolean res1 = Arrays.equals(arr, arr2);
		System.out.println(res1);
	}

}
