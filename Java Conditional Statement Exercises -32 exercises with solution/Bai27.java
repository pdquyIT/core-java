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
public class Bai27 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so");
        int n = in.nextInt();
        if (n > 0)
            System.out.println("So duong");
        else if (n < 0)
            System.out.println("So am");
        else
            System.out.println("So khong");
    }
}
