package com.algorithms;

import java.util.Scanner;

/**
 * Generates the digit sequences which are restrictively increasing.
 * 
 * @author Judas
 * 
 */
public class SequenceGenerator {
	static int value;
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		value = n - 1;
		generate(arr, 0, 0);
	}

	/**
	 * Calls itself recursively to generate sequences.
	 * 
	 * @param arr
	 * @param index
	 * @param start
	 */
	private static void generate(int[] arr, int index, int start) {

		if (index > value)
			printArray(arr);
		else {
			for (int i = start; i < 10; i++) {
				arr[index] = i;
				// Calls recursively after setting the previous arr[index] value
				// in Array.
				generate(arr, index + 1, i + 1);
			}
		}
	}

	/**
	 * Prints the array
	 * 
	 * @param arr
	 */
	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.print(" ");
	}
}
