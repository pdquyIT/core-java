package javaStringExercises;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập chuỗi đuôi cần so sánh");
		String chuoiss = sc.nextLine();
		boolean cuoi = chuoi.endsWith(chuoiss);
		System.out.println("Chuỗi "+chuoiss+" có trong chuỗi "+chuoi+" là " +cuoi);
		
    }
}
