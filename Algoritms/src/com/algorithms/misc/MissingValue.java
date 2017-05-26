package com.algorithms.misc;

/**
 * Find the missing element in the consecutive array elements.
 * 
 * Can be used to find out the missing element in duplicate array.
 * 
 * @author Sumit_Sumit
 *
 */
public class MissingValue {

	public static void main(String[] args) {

		//Sort the Array
		int [] arr={0,1,2,3,4,5,6,7,9};
		//Binary Search  
		int i=0,j=arr.length;
		while(i!=j-1){
			int temp=(i+j)/2;
			if(arr[temp]==temp){
				i=temp;
			}else{
				j=temp;
			}
		}
		System.out.println(i+1);
	}

}
