package javaArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Bai16 {
	 public static void main(String[] args) {
		  Scanner nhap = new Scanner(System.in);
		  System.out.print("Nhập số phần tử của mảng ");
		  int n = nhap.nextInt();
		     
	      int [] arr = new int [n];
	        
	      System.out.print("Nhập các phần tử của mảng: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr[i] = nhap.nextInt();
	        	}
	  System.out.println("Mảng : "+Arrays.toString(arr));
      
		 //Xóa phần tử trùng
	  System.out.print("Mảng sau khi xóa phần tử trùng \n");
		  for(int i=0;i<n-1;i++)
			  for( int k=i+1;k<n;k++) {
		    	        if (arr[k]==arr[i])
		    	        {
		    	            for(int j=k;j<n-1;j++)
		    	            arr[j]=arr[j+1];
		    	            n--;
		    	            k--;
		    	        }
			  }
		//Hiển thị sau xóa    	    
			   for (int k=0;k<n;k++)
				   System.out.printf("%d ",arr[k]);
			   System.out.printf("\n");

		  }
}
	 
