package javaStringExercises;

import java.util.Scanner;

public class Bai26 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ thứ nhất");
		String str1 = sc.nextLine();
		System.out.println("Nhập chuỗi bất kỳ thứ hai");
		String str2 = sc.nextLine();

        boolean starts = str1.startsWith(str2);

        System.out.println( str1 + " starts with " +
             str2 + "? " + starts);
    }
}
