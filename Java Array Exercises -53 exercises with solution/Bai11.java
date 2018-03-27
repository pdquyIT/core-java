package javaArrayExercises;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
        // TODO code application logic here
		System.out.print("Nhập số phần tử của mảng: ");
		Scanner nhap = new Scanner (System.in);
		int n = nhap.nextInt();
     
        int [] arr = new int [n];
        
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = nhap.nextInt();
        }
        System.out.print("Đảo ngược mảng \n");
        for(int i = n ; i >= 0 ; i --){
            System.out.println(arr[i] + " ");
        }
    }
}
