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
public class Bai28 {
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.print("Input a HexaDec: ");
    String a=scan.nextLine();
    int decimalValue = Integer.parseInt(a, 16);
    System.out.print("HexaDec to Binary :"+Integer.toBinaryString(decimalValue));
    }
}
