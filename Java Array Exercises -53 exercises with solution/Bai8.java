package javaArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
	
	public static void main(String[] args) {
		System.out.print("Nhập số phần tử của mảng: ");
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
	     
        int [] my_arr = new int [n];
        
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            my_arr[i] = nhap.nextInt();
        	}
		   int[] new_arr = new int[n];     
		 
		   System.out.println("Mảng gốc : "+Arrays.toString(my_arr));     
		   
		   for(int i=0; i < my_arr.length; i++) {
		    new_arr[i] = my_arr[i];
		}
		   System.out.println("Mảng đã copy: "+Arrays.toString(new_arr));
		 }
}
