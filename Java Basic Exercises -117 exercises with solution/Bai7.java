
package JavaBasicExercises;

import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so: ");
  int so = in.nextInt();
   
  for (int i=1; i<= 10; i++){
   System.out.println(so + " x " + i + " = " + 
     (so * i));
  }
 }
}
