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
public class Bai22 {
    public static void main(String[] args)
    {
        int n,c=1,blk,i,j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            for(blk=1;blk<=n-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
            if (j==0||i==0)
                c=1;
            else
               c=c*(i-j+1)/j;
            System.out.print(" "+c);
        }
        System.out.print("\n");
    }
}
}
