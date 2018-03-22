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
public class Bai2 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so inch ");
        double inch = input.nextDouble();

        double  met =(inch*0.0254);
        System.out.println(inch + " inch bang " + met + " met");
    }
}
