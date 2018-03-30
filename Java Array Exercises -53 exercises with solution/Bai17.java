package javaArrayExercises;

import java.util.Scanner;

public class Bai17 {
	 public static void main(String[] args) {
	        int a[]= new int[10];
	        Scanner sc = new Scanner(System.in);
	        int max1 = 0;
	        for(int i = 0 ; i < 10 ; i ++){
	            a[i] = sc.nextInt();
	            if( i == 0){
	                max1= a[0];
	                
	            } else if (a[i]> max1){
	                max1= a[i];
	            }
	        }
	        int max2 = a[0];
	        for(int i = 0 ; i < 10 ; i++){
	            if(a[i]> max2 && a[i] < max1){
	                max2 = a[i];
	            }
	        }
	        System.out.println("Phan tu lon thu hai trong mang la " + max2);
	    }
}
