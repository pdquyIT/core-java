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
public class Bai1 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao do F ");
        double dof = input.nextDouble();

        double  doc =((dof-32) / 1.8);
        System.out.println(dof + " do F bang " + doc + " do C");
    }
}
