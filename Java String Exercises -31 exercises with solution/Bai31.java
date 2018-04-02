package javaStringExercises;

import java.util.Scanner;

public class Bai31 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		String chuoicat = chuoi.trim();
		System.out.println("Chuỗi ban đầu là" +chuoi);
		System.out.println("Chuỗi đã cắt là" +chuoicat);
    }
}
