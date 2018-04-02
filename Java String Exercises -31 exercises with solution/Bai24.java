package javaStringExercises;

import java.util.Scanner;

public class Bai24 {
	  public static void main(String[] args)
	    {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập chuỗi bất kỳ");
			String str = sc.nextLine();

	        String new_str = str.replace('d', 'f');

	        System.out.println("Chuỗi ban đầu " + str);
	        System.out.println("Chuỗi sau thay thế " + new_str);
	    }
	
}
