
package JavaBasicExercises;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args)
	 {
	  long binary1, binary2;
	  Scanner in = new Scanner(System.in);
	  System.out.print("Nhap so nhi phan thu 1: ");
	  binary1 = in.nextLong();
	  System.out.print("Nhap so nhi phan thu 2: ");
	  binary2 = in.nextLong();
	 
	  String s1 = String.valueOf(binary1);
	  String s2 = String.valueOf(binary2);
          
	  int decimalValue1 = Integer.parseInt(s1, 2);
	  int decimalValue2 = Integer.parseInt(s2, 2);
	  int tong = decimalValue1 + decimalValue2;
	
	  String strkq = Integer.toBinaryString(tong);
	  System.out.println("Ket qua = "+strkq);
	 }
}
