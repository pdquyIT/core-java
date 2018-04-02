package javaStringExercises;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
	
		byte[] bytearr = chuoi.getBytes();
		String chuoimoi = new String(bytearr);
		System.out.println("Chuỗi mới sau khi đổi là" +chuoimoi);
	
    }
}
