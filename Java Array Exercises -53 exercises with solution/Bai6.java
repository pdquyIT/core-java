package javaArrayExercises;

import java.util.Scanner;

public class Bai6 {

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
	        int vitri=0;
	        for (int i = 0; i < n; i++) {
	        	if (arr[i]==item)
	        		vitri=i+1;
	        }
	        System.out.println("Phần tử "+item+ " ở vị trí "+ vitri + " trong mảng");
	   }
}
