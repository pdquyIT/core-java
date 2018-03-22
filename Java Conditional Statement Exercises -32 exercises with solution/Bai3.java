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
public class Bai3 {
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input the 1st number: ");
  int so1 = in.nextInt();
  System.out.print("Input the 2nd number: ");
  int so2 = in.nextInt();
  System.out.print("Input the 3rd number: ");
  int so3 = in.nextInt();
  int max=0;  
  if (so1 > so2)
   if (so1 > so3)
        max = so1;
   
  if (so2 > so1)
   if (so2 > so3)
        max = so2;
   
  if (so3 > so1)
   if (so3 > so2)
       max = so3;
  
System.out.println("Số lớn nhất là " + max);
 }
}
