package javaStringExercises;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi thứ nhất");
		String chuoi1 = sc.nextLine();
		System.out.println("Nhập vào chuỗi thứ nhất");
		String chuoi2 = sc.nextLine();
		
        System.out.println("Chuỗi 1 bạn vừa nhập là " + chuoi1);
        System.out.println("Chuỗi 2 bạn vừa nhập là " + chuoi2);
        
        int sosanh = chuoi1.compareTo(chuoi2);
        if (sosanh < 0)
        {
            System.out.println("\"" + chuoi1 + "\"" +
                " ngắn hơn " +
                "\"" + chuoi2 + "\"");
        }
        else if (sosanh == 0)
        {
            System.out.println("\"" + chuoi1 + "\"" +
                " bằng nhau " +
                "\"" + chuoi2 + "\"");
        }
        else
        {
            System.out.println("\"" + chuoi1 + "\"" +
                " dài hơn " +
                "\"" + chuoi2 + "\"");
        }
    }
}
