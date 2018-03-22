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
public class Bai30 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        int  so1 = in.nextInt();
        System.out.print("Nhap so thu 2: ");
        int so2 = in.nextInt();
        System.out.print("Nhap so thu 3 ");
        int so3 = in.nextInt();

        if (so1 == so2 && so1 == so3)
        {
            System.out.println("Ba so bang nhau");
        }
        else if ((so1 == so2) || (so1 == so3) || (so3 == so2))
        {
            System.out.println("Co 1 cap so bang nhau");
        }
        else
        {
            System.out.println("Cac so khac nhau");
        }
    }
}
