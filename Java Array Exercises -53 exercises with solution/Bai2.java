package javaArrayExercises;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập số phần tử của mảng: ");
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
     
        int [] arr = new int [n];
        
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = nhap.nextInt();
        }
        //Tính tổng
       	int tong=0;
       	for (int i = 0; i < n; i++) {
       		tong = tong + arr[i];
        	}
        System.out.println("Tổng các phần tử trong mảng: "+tong);
        	}
}

