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
public class Bai29 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số nhỏ hơn 10 triệu ");
        if (in.hasNextLong())
        {
            long n = in.nextLong();
            if (n < 0)
                n *= -1;
            if (n >= 10000000000L)
                System.out.println("Số này lớn hơn hoặc bằng 10 triệu");
            else
            {
                int chuso = 1;
                if (n >= 10 && n < 100)
                    chuso = 2;
                else if (n >= 100 && n < 1000)
                    chuso = 3;
                else if (n >= 1000 && n < 10000)
                    chuso = 4;
                else if (n >= 10000 && n < 100000)
                    chuso = 5;
                else if (n >= 100000 && n < 1000000)
                    chuso = 6;
                else if (n >= 1000000 && n < 10000000)
                    chuso = 7;
                else if (n >= 10000000 && n < 100000000)
                    chuso = 8;
                else if (n >= 100000000 && n < 1000000000)
                    chuso = 9;
                else if (n >= 1000000000 && n < 10000000000L)
                    chuso= 10;
                System.out.println("Số vừa nhập có " + chuso+" chữ số");
            }
        }
        else
        {
            System.out.println("Không phải số nguyên");
        }
    }
}
