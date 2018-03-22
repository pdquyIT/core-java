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
public class Bai19 {
    public static void main(String[] args)
    {
        int i,j,n,s,x;
        System.out.print ("Nhap va so dong ");
        Scanner in = new Scanner(System.in);
	n = in.nextInt();
        s=n+4-1;
        for(i=1;i<=n;i++)
        {
            for(x=s;x!=0;x--)
            {
                System.out.print(" ");
            }
        for(j=1;j<=i;j++)
            System.out.print(i+" ");
        System.out.println();
        s--;
        }
    }
}
