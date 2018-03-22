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
public class Bai3 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so mot so nguyen bat ky ");
        double songuyen = input.nextDouble();
        double tong =0;
    while (songuyen>0) {
            tong+=songuyen%10;
            songuyen = songuyen/10;
        }
        System.out.println("tong cac chu so cua "+songuyen+ " la: "+tong);
}
}
