package javaStringExercises;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập vào vị trí cần kiểm tra");
		int vitri = sc.nextInt();
		int kytu = chuoi.codePointBefore(vitri);
        System.out.println("Chuỗi bạn vừa nhập là " + chuoi);
        System.out.println("Ký tự kiểm tra thứ "+vitri+" là: " + (char)kytu);
    }
}
