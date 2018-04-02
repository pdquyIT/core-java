package javaStringExercises;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ ");
		String chuoi = sc.nextLine();
		System.out.println("Nhập chuỗi cần kiểm tra");
		String chuoikt = sc.nextLine();
		StringBuffer strbuf = new StringBuffer(chuoi);
        System.out.println("Chuỗi bạn vừa nhập là " + chuoi);
        System.out.println("Chuỗi bạn kiểm tra là " + chuoikt);
        System.out.println("Kết quả so sánh 2 chuỗi " + chuoi.contentEquals(chuoikt));
        
    }
}
