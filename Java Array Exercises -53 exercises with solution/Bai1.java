package javaArrayExercises;

import java.util.Scanner;

public class Bai1 {
	
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
        
        sortASC(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
