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
public class Bai17 {
    public static void main(String[] args)
    {
   	int i,j,n;
        System.out.print("Nhap so : ");
        Scanner in = new Scanner(System.in);
	n = in.nextInt();
        for(i=1;i<=n;i++)
            {
	    for(j=1;j<=i;j++)
	    System.out.print(i);
	    System.out.println("");
            }
    }
}
