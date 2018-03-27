package javaArrayExercises;

import java.util.Scanner;

public class Bai10 {
	 
	public static void main(String[] args) {
		  int n;
		  float array[] = new float[100];
		  
		  System.out.println("Nhap so phan tu cua mang: ");
		  Scanner nhap = new Scanner (System.in);
		  n = nhap.nextInt();
		  for (int i=0;i<n;i++)
		  {
		   System.out.println("Nhap phan tu thu "+i+" cua mang: ");
		   array[i] = nhap.nextFloat();
		  }
		        float max = array[0];
		        float min = array[0];;
		        for (int i=0;i<n;i++)
		        {
		            if(max<array[i])
		                max=array[i];
		            if(min>array[i])
		             min=array[i];
		        }
		        System.out.println("Giá trị lớn nhất"+max);
		        System.out.println("Giá trị nhỏ nhất"+min);
		 }
}
