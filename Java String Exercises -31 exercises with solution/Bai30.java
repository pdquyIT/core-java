package javaStringExercises;

import java.util.Scanner;

public class Bai30 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		String chuoihoa = chuoi.toUpperCase();
		System.out.println("Chuỗi ban đầu là" +chuoi);
		System.out.println("Chuỗi hoa là" +chuoihoa);
    }
}
