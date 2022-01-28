package Challenges;
/*
 * find the number of occurrences of each number in the following array 
 * 1,1,1,2,2,3,4,4,4,5,5,5,5,5,5,6,6,7,7,8,8
 */
public class Program1 {
	public static void main(String[] args) {
		 int arr[] = new int [] {1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8};  
	        //Array occ will store frequencies of element  
	        int occ[] = new int [arr.length];  
	        int check = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    occ[j] = check;  
	                }  
	            }  
	            if(occ[i] != check)  
	                occ[i] = count;  
	        }  
	        //Displays the frequency of each element present in array
	        System.out.println(" Number of occurences");  
	        for(int i = 0; i < occ.length; i++){  
	            if(occ[i] != check)  
	                System.out.println("    " + arr[i] + "    --->    " + occ[i]);  
	        }  
	    } 
	}