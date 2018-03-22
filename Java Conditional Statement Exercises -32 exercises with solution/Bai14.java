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
public class Bai14 {
    public static void main(String[] args)
    {
    int j,n;
    System.out.print("nhap so: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println ("\n");
    for(j=0;j<=n;j++)
        System.out.println(n+" X "+j+" = " +n*j);
    }
}
