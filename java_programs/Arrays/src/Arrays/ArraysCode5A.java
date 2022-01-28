package Arrays;
import java.util.Arrays;
public class ArraysCode5A {

	public static void main(String[] args) {
		int arr[] = {25,30,35,40,45,50};
		int res = Arrays.binarySearch(arr, 35);
		System.out.println(res);
		int arr1[] = {25,50,100,75,125,35,35,35};
		Arrays.sort(arr1);//25,35,50,75,100,125
		for(Object x:arr1) {
			System.out.print(x+",");
		}
		System.out.println();
		int res1 = Arrays.binarySearch(arr1, 35);
		System.out.println(res1);
		int res2 = Arrays.binarySearch(arr1, 1, 4, 100);//-5
		//(because search happens from starting index till specified last index 
		//but element in last index is not considered 
		System.out.println(res2);
		int res3 = Arrays.binarySearch(arr1, 1, 5, 100);//4
		System.out.println(res3);
	}

}
