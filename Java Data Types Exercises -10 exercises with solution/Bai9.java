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
public class Bai9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thư nhat: ");
        int so1 = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int so2 = in.nextInt();

        System.out.printf("Tong: %d%n", so1 + so2);
        System.out.printf("Hieu: %d%n", so1 - so2);
        System.out.printf("Tich: %d%n", so1 * so2);
        System.out.printf("Gia tri Trung binh: %.2f%n", (double) (so1 + so2) / 2);
        System.out.printf("Khoang cach giua 2 so: %d%n", Math.abs(so1 - so2));
        System.out.printf("So lơn nhat: %d%n", Math.max(so1, so2));
        System.out.printf("So nho nhat: %d%n", Math.min(so1, so2));
    }
}
