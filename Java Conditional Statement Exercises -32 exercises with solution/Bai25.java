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
public class Bai25 {
   public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so dong  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start;
        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - no_of_spaces; spc > 0; spc--) 
                System.out.print(" ");
            if (i < n) 
                {
                start = i;         
                no_of_spaces++;
                } 
            else 
                {
                start = n * 2 - i;   
                no_of_spaces--;      
                }
            for (int j = 0; j < count; j++) 
                {
                System.out.print(start);
                if (j < count / 2) 
                    {
                    start--;
                    } 
                else 
                    {
                    start++;
                    }
                }
            if (i < n)
                count = count + 2;
            else 
                count = count - 2;
            System.out.println();
        }
    } 
}
