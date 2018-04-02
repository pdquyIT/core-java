package javaStringExercises;

import java.util.Scanner;

public class Bai28 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		char[] arr = chuoi.toCharArray();
		System.out.println(arr);
    }
}
