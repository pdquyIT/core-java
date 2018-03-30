package javaArrayExercises;

import java.util.Scanner;

public class Bai18 {
	 public static void main(String[] args) {
	        
	        int a[]= new int[10];
	        Scanner sc = new Scanner(System.in);
	        int min1 = 0;
	        for(int i = 0 ; i < 10 ; i ++){
	            a[i] = sc.nextInt();
	            if( i == 0){
	                min1= a[0];
	                
	            } else if (a[i]< min1){
	                min1= a[i];
	            }
	        }
	        int min2 = a[0];
	        for(int i = 0 ; i < 10 ; i++){
	            if(a[i]< min2 && a[i] > min1){
	                min2 = a[i];
	            }
	        }
	        System.out.println("Phan tu lon thu hai trong mang la " + min2);
	    }
}
