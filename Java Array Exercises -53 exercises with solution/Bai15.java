package javaArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Bai15 {
	  public static void main(String[] args) {
		  Scanner nhap = new Scanner(System.in);
		  System.out.print("Nhập số phần tử của mảng thứ nhất: ");
		  int n = nhap.nextInt();
		     
	      int [] arr1 = new int [n];
	        
	      System.out.print("Nhập các phần tử của mảng thứ nhất: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr1[i] = nhap.nextInt();
	        	}
	     System.out.print("Nhập số phần tử của mảng thứ hai: ");
		 int m = nhap.nextInt();
			     
		 int [] arr2 = new int [m];
		        
		 System.out.print("Nhập các phần tử của mảng thứ hai: \n");
		    for (int i = 0; i < m; i++) {
		         System.out.printf("a[%d] = ", i);
		         arr2[i] = nhap.nextInt();
		        }
		    System.out.println("Array1 : "+Arrays.toString(arr1));
		       System.out.println("Array2 : "+Arrays.toString(arr2));
		 
		      
		        for (int i = 0; i < arr1.length; i++)
		        {
		            for (int j = 0; j < arr2.length; j++)
		            {
		                if(arr1[i] == (arr2[j]))
		                {
		                 
		                 System.out.println("Phần tử chung của hai mảng : "+(arr1[i]));
		                 }
		            }
		       } 
	    }
 }

