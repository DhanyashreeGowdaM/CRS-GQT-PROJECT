package Arrays;

class ArrayOps{
	int min(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {//23>43,23>11,11>45,11>32,11>5,5>7,
				min = arr[i];//11,5 so min value is 5
			}
	}
		return min;
	}
		int max(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
	}
}
		return max;
	}
}

public class ArrayCode3 {

	public static void main(String[] args) {
		int arr[] = {23,43,11,45,32,5,7};
		ArrayOps aop = new ArrayOps();
		int lowest = aop.min(arr);
		int highest = aop.max(arr);
		
		System.out.println(lowest);
		System.out.println(highest);

	}

}
