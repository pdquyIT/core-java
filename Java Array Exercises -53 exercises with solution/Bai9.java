package javaArrayExercises;

import java.util.Scanner;

public class Bai9 {
	
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
        System.out.printf("\nNhập phần tử cần chèn vào mảng");
        int k = nhap.nextInt();
        arr = insert(arr, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(arr);

	}
	 public static int [] insert(int [] arr, int k) {
	        int arrIndex = arr.length - 1;
	        int tempIndex = arr.length;
	        int [] tempArr = new int [tempIndex + 1];
	        boolean inserted = false;
	         
	        for (int i = tempIndex; i >= 0; i--) {
	            if (arrIndex > -1 && arr[arrIndex] > k) {
	                tempArr[i] = arr[arrIndex--];
	            } else {
	                if (!inserted) {
	                    tempArr[i] = k;
	                    inserted = true;
	                } else {
	                    tempArr[i] = arr[arrIndex--];
	                }
	            }
	        }
	        return tempArr;
	    }

	public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
