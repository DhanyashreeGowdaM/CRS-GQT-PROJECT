package Arrays;
/*
 WAP to insert an element at a specific position of an existing array
 example: arr={23,45,56,12,7,32}
 ele=41
 pos=3 
 */

class ArrayOps1{
	public static void insertData(int arr[],int pos , int ele) {
		for(int i = arr.length-1;i>=pos;i--) {
			//moving each element one position to its right
			arr[i]=arr[i-1];
		}
		arr[pos-1] = ele;
		
	}
}
public class ArrayCode4C {

	public static void main(String[] args) {
		int arr[] =new int[7];
	    arr[0] = 23;
	    arr[1] = 45;
	    arr[2] = 56;
	    arr[3] = 12;
	    arr[4] = 7;
	    arr[5] = 32;
		int ele = 41;
		int pos = 3;
		ArrayOps1.insertData(arr, pos, ele);
		for(int i= 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		}

