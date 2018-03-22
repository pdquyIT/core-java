/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConditionalStatementExercises;

import java.util.Scanner;

/**
 *
 * @author Dinh Quy
 */
public class Bai11 {
    public static void main(String[] args)

{
   int i, n, tong=0;
   {
   Scanner in = new Scanner(System.in);  
        System.out.print("Nhập số: ");  
         n = in.nextInt();
}
  System.out.println("Số đầu tiên là : "+n);
  
 for(i=1;i<=n;i++)
   {
     System.out.println(i);
     tong+=i;
   }
System.out.println("Tổng các số cho đến"+n+" là: " +tong);

}
}
