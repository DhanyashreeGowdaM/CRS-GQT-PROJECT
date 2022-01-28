package Arrays;
import java.util.Arrays;
public class ArrayCode5 {

	public static void main(String[] args) {
		int arr[] = {25,30,35,40,45,50};
		int res = Arrays.binarySearch(arr, 35);
		System.out.println(res);
		int arr1[] = {25,50,100,75,125,35};
		Arrays.sort(arr1);
		int res1 = Arrays.binarySearch(arr1, 35);
		System.out.println(res1);
		

	}

}
