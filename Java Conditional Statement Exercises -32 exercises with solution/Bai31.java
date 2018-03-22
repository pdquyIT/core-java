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
public class Bai31 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        int  so1 = in.nextInt();
        System.out.print("Nhap so thu 2: ");
        int so2 = in.nextInt();
        System.out.print("Nhap so thu 3 ");
        int so3 = in.nextInt();
        if (so1 < so2 && so2 < so3)
            System.out.println("Tang dan");
        else if (so1 > so2 && so2 > so3)
            System.out.println("Giam dan");
        else
            System.out.println("Ngau nhien");
    }
}
