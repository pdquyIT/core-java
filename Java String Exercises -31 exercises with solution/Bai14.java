package javaStringExercises;

import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ thứ nhất");
		String chuoi1 = sc.nextLine();
		System.out.println("Nhập chuỗi bất kỳ thứ hai");
		String chuoi2 = sc.nextLine();
		
		boolean chuoiss = chuoi1.equalsIgnoreCase(chuoi2);
		System.out.println("Chuỗi "+chuoi1+" bằng chuỗi "+chuoi2+" là " +chuoiss);
		
    }
}
