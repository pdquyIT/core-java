package javaStringExercises;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi thứ nhất");
		String chuoi1 = sc.nextLine();
		System.out.println("Nhập vào chuỗi thứ nhất");
		String chuoi2 = sc.nextLine();
		
        System.out.println("Chuỗi 1 bạn vừa nhập là " + chuoi1);
        System.out.println("Chuỗi 2 bạn vừa nhập là " + chuoi2);
        
        String chuoi = chuoi1.concat(chuoi2);
        
        System.out.println("Chuỗi đã nối là "+chuoi);
    }
}
