/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicExercises;

import java.util.Scanner;

/**
 *
 * @author Dinh Quy
 */
public class Bai22 {
   public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.print("Input a Binary: ");
    String num=scan.nextLine();
    int decimalValue = Integer.parseInt(String.valueOf(num), 2);
    System.out.print("Binary to Decimal :"+Integer.toString(decimalValue));
    }    
}
