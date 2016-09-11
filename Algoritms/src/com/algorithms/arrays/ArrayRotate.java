package com.algorithms.arrays;

import java.util.Scanner;

/**
 * Rotates the array to right by given position.
 * Uses temporary memory.
 * *********Input format********
 *          3 2 3(size,rotation,queries)
 *          1 2 3
 *            0
 *            1
 *            2
 * @author Judas
 *
 */
public class ArrayRotate {

	public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        String line=scan.nextLine();
        String [] arr=line.split(" ");
        int size=Integer.parseInt(arr[0]),rotation=Integer.parseInt(arr[1]),q=Integer.parseInt(arr[2]);
        int [] array=new int [size];
        rotation=rotation%size;
       
        int []temp=new int [rotation];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        //Storing the last positions in the array.
        for(int i=0;i<rotation;i++){
            temp[i]=array[size-rotation+i];
            
        }
        //Shifts the array to make room for elements present in temporary array.
        for(int i=size-rotation-1;i>=0;i--){
                array[i+rotation]=array[i];
            }
        //assigning values present in temporary array.
        for(int k=0,i=0;i<temp.length;k++,i++){
            array[k]=temp[i];
        }
         for(int i=0;i<q;i++){
            int m=scan.nextInt();
             System.out.println(array[m]);
        }
    }
}
