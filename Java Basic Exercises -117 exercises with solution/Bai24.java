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
public class Bai24 {
    public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.print("Input a Binary: ");
    int a=scan.nextInt();
    int decimalValue = Integer.parseInt(String.valueOf(a), 2);
    System.out.print("Binary to Octal :"+Integer.toOctalString(decimalValue));
}
}
