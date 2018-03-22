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
public class Bai2 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Nhập a: ");
            double a = input.nextDouble();
            System.out.print("Nhập b: ");
            double b = input.nextDouble();
            System.out.print("Nhập c: ");
            double c = input.nextDouble();

            double del = b * b - 4.0 * a * c;

            if (del > 0.0) {
                double x1 = (-b + Math.sqrt(del)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(del)) / (2.0 * a);
                System.out.println("Kết quả là nghiệm 1 " + x1 + " và nghiệm 2 " + x2);
            } else if (del == 0.0) {
                double x1 = -b / (2.0 * a);
                System.out.println("Nghiệm duy nhất là " + x1);
            } else {
                System.out.println("Vô nghiệm");
            }

    }
}
