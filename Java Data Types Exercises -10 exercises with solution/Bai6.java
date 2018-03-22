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
public class Bai6 {
     public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double cannang = input.nextDouble();

        System.out.print("Input height in inches: ");
        double chieucao = input.nextDouble();

        double BMI = cannang * 0.45359237 / ((chieucao* 0.0254) * (chieucao * 0.0254));
        System.out.print("Chi so BMI cua ban la " + BMI+"\n");
    }
}
