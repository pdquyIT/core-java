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
public class Bai4 {
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Số âm nhỏ nhất");
            }
            else if (input > 1000000)
            {
                System.out.println("Số âm lớn nhất");
            }
            else
            {
                System.out.println("Số dương");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Số âm nhỏ nhất");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Số âm lớn nhất");
            }
            else
            {
                System.out.println("Số dương");
            }
        }
        else
        {
            System.out.println("Không");
        }
        
    }
}
