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
public class Bai1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen bat ky: ");
        int songuyen = in.nextInt();

        if (songuyen > 0)
        {
            System.out.println("So "+songuyen+" la so duong");
        }
        else if (songuyen < 0)
        {
            System.out.println("So "+songuyen+" la so am");
        }
        else
        {
            System.out.println("So ban vua nhap la so 0");
        }
    }
}
