package javaArrayExercises;

import java.util.Scanner;

public class Bai5 {

	   public static void main(String[] args) {
		   System.out.print("Nhập số phần tử của mảng: ");
		   Scanner nhap = new Scanner(System.in);
		   int n = nhap.nextInt();
		     
	        int [] arr = new int [n];
	        
	        System.out.print("Nhập các phần tử của mảng: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr[i] = nhap.nextInt();
	        	}
	        System.out.println("Nhập vào phần tử cần kiểm tra");
	        int item = nhap.nextInt();
	        kiemtra(arr, item);
	   }
	   
	   public static void kiemtra(int[] arr, int item) {
		      for (int n : arr) {
		         if (item == n) {
		            System.out.println("Có phần tử này trong mảng"); 
		         }
		         System.out.println("Không có phần tử này trong mảng"); 
		        	 
		      }
	   }
		   
}
