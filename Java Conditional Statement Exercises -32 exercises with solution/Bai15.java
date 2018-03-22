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
public class Bai15 {
    public static void main(String[] args)
    {
    int i,n,sum=0;
    System.out.print("Nhap vao so le ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println ("\nCac so le tư 0 den" +n+" la");
    for(i=1;i<=n;i++)
        {
            System.out.println (2*i-1);
            sum+=2*i-1;
        }
   System.out.println ("Tong cac so le tu 0 den " +n+" la " +sum);
    }
}
