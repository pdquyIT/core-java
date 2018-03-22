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
public class Bai28 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so ");
        double n = in.nextDouble();
        if (n > 0)
        {
            if (n < 1)
                System.out.println("Số dương nhỏ");
            else if (n > 1000000)
                System.out.println("Số dương lớn");
            else
                System.out.println("Số dương");
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
                System.out.println("Số âm nhỏ");
            else if (Math.abs(n) > 1000000)
                System.out.println("Số âm lớn");
            else
                System.out.println("Số âm");
        }
        else
            System.out.println("Số không");
    }
}
