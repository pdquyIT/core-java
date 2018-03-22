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
public class Bai4 {
     public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so phut ");
        double sophut = input.nextDouble();
        double nam = sophut/525600;
        double ngay = ((sophut - (nam *525600))/1440);
        System.out.println("So phut ban da nhap la "+sophut+ " bang "+nam+" nam va "+ngay+" ngay");
}
}
