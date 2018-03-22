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
public class Bai24 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("So dong ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) 
        {
            for (int spc = n - i; spc > 0; spc--) 
                System.out.print(" ");
            for (int j = 0; j <= i; j++) 
                System.out.print("@");
            System.out.println();
        }
    }
}
