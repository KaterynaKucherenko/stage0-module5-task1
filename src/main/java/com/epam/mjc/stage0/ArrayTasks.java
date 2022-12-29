package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
    String[] array =  { "winter", "spring", "summer", "autumn" };
         return array;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
    int [] array =  new int [length];
        for(int i=0; i<length; i++){
         array [i] =i+1; 
        
         }return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        
	    int sum = 0;
	    for (int i=0; i<arr.length; i++){
	        sum += arr[i];
	    }
	    return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
           int a = 0;
	    for (int i=0; i< arr.length; i++ ){
	        if (number == arr[i]){
	             return i;}
	             else{ a++;
	            }
	            if (a==arr.length){
	                return (-1);}
	            }
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
		 int a = arr.length;
		 int x = a-1;
		String [] arr1;
		arr1 = new String [a];
		for (int i =0; i<a; i++ ){
		    arr1 [i] = arr [x];
		    x--;
		    
		}
		return arr1;
	

    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
    int a = arr.length;
		 int x = 0;
		 int y = 0;
		for (int i =0; i<a; i++ ){
		    if (arr[i]>0){
		    x++;}}
	   int [] arr1;
	   arr1 = new int [x];
	   for (int p = 0; p<a; p++){
	      if(arr[p]>0){
	      arr1[y] = arr[p];
	      y++;}}
		
	return arr1;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
                 int a = arr[0].length;
		 int b = arr[1].length;
		 
	     boolean done = false;
	     while (!done){
	         done = true;
		 for (int i =1; i<a; i++){
		    if (arr[0][i]<arr[0][i-1]){
		        int vr = arr[0][i];
		        arr[0][i]=arr[0][i-1];
		        arr [0][i-1] = vr;
		        done = false;}
		    }}
		    boolean done2 = false;
		    while (!done2){
		        done2=true;
		        for(int j=1; j<b; j++){
		            if(arr[1][j]<arr[1][j-1]){
		                int var2 = arr[1][j];
		                arr[1][j] =arr[1][j-1];
		                arr[1][j-1]=var2;
		                done2=false;}
		            }}
		            if(a>b){
		                int [] fix = arr[1];
		                arr[1] = arr[0];
		                arr[0] = fix;
		             }
		           return arr;
    }
}
