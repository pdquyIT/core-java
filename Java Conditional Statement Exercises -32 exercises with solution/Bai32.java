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
public class Bai32 {
    public static void main(String[] args) { 
    Scanner in = new Scanner(System.in); 
    System.out.print("Nhap so thap phan 1 "); 
    double so1 = in.nextDouble(); 
    System.out.print("Nhap so thap phan 2"); 
    double so2 = in.nextDouble(); 
    if (Math.abs(so1 - so2) <= 0.01)
        System.out.println("Giong nhau"); 
    else 
        System.out.println("Khac nhau");
} 
}
