/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDataTypesExercises;

import java.util.Scanner;

/**
 *
 * @author Dinh Quy
 */
public class Bai8 {
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao 1 so bat ky: ");
        double so = in.nextDouble();

        System.out.printf("Binh Phuong: %12.2f\n", so * so);
        System.out.printf("Lap Phuong: %14.2f\n", so * so * so);
        System.out.printf("Mu 4: %6.2f\n", Math.pow(so, 4));
    }
}
