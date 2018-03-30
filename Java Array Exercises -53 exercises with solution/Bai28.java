package javaArrayExercises;

import java.util.Scanner;

public class Bai28 {
	public static void main(String[] args) {
		int arrInt[];
		int n;
		Scanner input =new Scanner(System.in);
		System.out.println("nhap so phan tu n=: ");
		n=input.nextInt();
		arrInt = new int[n];
		for (int i = 0; i < n; i++) {
		System.out.println("nhap a[" +i+"] =");
		arrInt[i]=input.nextInt();
		}
		for (int i = 0; i < n; i++) {
		System.out.print(" a[" +i+"] =" + arrInt[i]+";");
		}
		int min=arrInt[0];
		int max=arrInt[0];
		for (int i = 0; i < n; i++) {
		if (arrInt[i]<min) {
		min=arrInt[i];
		}
		if (arrInt[i]>max) {
		max=arrInt[i];
		}
		}
		System.out.println("gia tri nho nhat: "+min);
		System.out.println("gia tri lon nhat: "+max);
		System.out.println("Khoang cach: "+(max-min));
	}
}
