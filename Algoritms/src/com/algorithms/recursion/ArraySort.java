package com.algorithms.recursion;

public class ArraySort {

public static void main(String[] args) {
	
	int arr[]={1,2,3,10,5,6};
	System.out.println(checkSort(arr,5));
}

static boolean checkSort(int [] arr, int index){
	if(index<1){
		return true;
	}
	return arr[index]<arr[index-1]? false:checkSort(arr,index-1);
}
}