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
public class Bai20 {
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.print("Input a Decimal: ");
    String num=scan.nextLine();
    int decimalValue = Integer.parseInt(num, 10);
    System.out.print("Decimal to Binary :"+Integer.toHexString(decimalValue));
    } 
}
