package Arrays;
import java.util.*;
public class ArraysCode4B {

	public static void main(String[] args) {
		int arr[] = {23,43,11,45,32,5,7};
		Arrays.sort(arr,2,6);//sort the elements in ascending order
		for(Integer i:arr) {
		System.out.println(i);
	}
	}
}
