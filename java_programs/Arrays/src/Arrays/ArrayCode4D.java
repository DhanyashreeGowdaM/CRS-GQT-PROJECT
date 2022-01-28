package Arrays;
/*
WAP to delete an element at a specific position of an existing array
example: arr = {23,45,41,56,12,7,32}
ele = 41
pos = 3 
*/

class ArrayOps2{
	public static void deleteData(int arr[],int pos) {
		//moving the elements one position to left
		for(int i=pos-1;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
		}
		//adding the default value to the last position
		arr[arr.length-1]=0;
	}
}

public class ArrayCode4D {

	public static void main(String[] args) {
		int arr[] =new int[7];
	    arr[0] = 23;
	    arr[1] = 45;
	    arr[2] = 41;
	    arr[3] = 56;
	    arr[4] = 12;
	    arr[5] = 7;
	    arr[6] = 32;
		int ele = 41;
		int pos = 3;
		ArrayOps2.deleteData(arr, pos);
		for(int i= 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		}