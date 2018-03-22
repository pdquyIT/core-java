
package JavaBasicExercises;

import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so thu 1: ");
  int so1 = in.nextInt();
   
  System.out.print("Nhap so thu 2: ");
  int so2 = in.nextInt();
   
  System.out.println(so1 + " + " + so2 + " = " + 
  (so1 + so2));
   
  System.out.println(so1 + " - " + so2 + " = " + 
  (so1 - so2));
   
  System.out.println(so1 + " x " + so2 + " = " + 
  (so1 * so2));
   
  System.out.println(so1 + " / " + so2 + " = " + 
  (so1 / so2));
 
  System.out.println(so1 + " mod " + so2 + " = " + 
  (so1 % so2));
 }
}
