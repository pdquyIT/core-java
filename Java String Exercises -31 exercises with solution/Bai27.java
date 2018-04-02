package javaStringExercises;

import java.util.Scanner;

public class Bai27 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập vị trí lấy thứ nhất");
		int vitri1 = sc.nextInt();
		System.out.println("Nhập vị trí lấy thứ hai");
		int vitri2 = sc.nextInt();
		
        String chuoimoi = chuoi.substring(vitri1, vitri2);

        System.out.println("Chuỗi cũ là "+chuoi);
        System.out.println("Chuỗi mới là "+chuoimoi);
    }
}
