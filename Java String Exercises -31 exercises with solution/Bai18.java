package javaStringExercises;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi bất kỳ");
		String chuoi = sc.nextLine();
	
		int hashcode = chuoi.hashCode();
		System.out.println("Chuỗi mới sau khi đổi là" +hashcode);
	
    }
}
