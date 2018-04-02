package javaStringExercises;

import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args)
	  {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String str = sc.nextLine();
	    int len = str.length();
	    System.out.println("Độ dài của chuỗi '"+str+"' là "+len);
	   }
}
