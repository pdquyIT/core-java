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
public class Bai9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap vao nam: ");
        int nam = in.nextInt();
        if (((nam % 4) == 0) && (((nam % 100) != 0) || ((nam % 100 == 0) && (nam % 400 == 0))))
        {
            System.out.println(nam + " la nam nhuan");
        }
        else
        {
            System.out.println(nam + " khong phai nam nhuan");
        }
    }
}
