package javaArrayExercises;

import java.util.Scanner;

public class Bai12 {
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
	        //Tìm phần từ lặp lại
	        for (int i = 0; i < arr.length-1; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if ((arr[i] == arr[j]) && (i != j))
	                {
	                    System.out.println("Phần tử lặp lại : "+arr[j]);
	                }
	            }
	        }
	  }	        
}
