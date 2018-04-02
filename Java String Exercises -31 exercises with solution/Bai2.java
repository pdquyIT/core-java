package javaStringExercises;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập vào vị trí cần kiểm tra");
		int vitri = sc.nextInt();
		int kytu = chuoi.codePointAt(vitri);
        System.out.println("Chuỗi bạn vừa nhập là " + chuoi);
        System.out.println("Ký tự kiểm tra thứ "+vitri+" dưới dạng Unicode là " + kytu);
    }
}
