
package JavaBasicExercises;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so thu 1: ");
  int num1 = in.nextInt();
   
  System.out.print("Nhap so thu 2: ");
  int num2 = in.nextInt();
   
  System.out.print("Nhap so thu 3: ");
  int num3 = in.nextInt();
  
   System.out.println("Tong trung binh cua ba so tren la: " + 
   (num1 + num2 + num3) / 3);
 }
}
