package javaStringExercises;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập chuỗi cần so sánh");
		String chuoiss = sc.nextLine();
		
        System.out.println("Chuỗi bạn vừa nhập là " + chuoi);
        System.out.println("Chuỗi bạn kiểm tra là " + chuoiss);
        System.out.println("Kết quả so sánh 2 chuỗi " + chuoi.contentEquals(chuoiss));
        
    }
}
