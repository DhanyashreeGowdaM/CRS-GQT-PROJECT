package Arrays;

public class ArrayCode2 {

	public static void main(String[] args) {
		int arr[] = {23,43,11,45,32,5,7};
		int min = arr[0];//23
		int max = arr[0];//23
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {//23>43,23>11,11>45,11>32,11>5,5>7,
				min = arr[i];//11,5 so min value is 5
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum value of the array is :"+min);
		System.out.println("Maximum value of the array is :"+max);
	}

}
