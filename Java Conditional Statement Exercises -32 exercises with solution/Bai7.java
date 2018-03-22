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
public class Bai7 {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int songaycuathang = 0; 

        System.out.print("Nhập vào số tháng: ");
        int thang = input.nextInt();

        System.out.print("Nhập vào số năm: ");
        int nam = input.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                songaycuathang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                songaycuathang = 30;
                break;
            case 2:
                if ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100 != 0))) {
                    songaycuathang = 29;
                } else {
                    songaycuathang = 28;
                }
                break;
        }
        System.out.print("Thang " + thang+ " nam " + nam + " co " + songaycuathang + " ngày\n");
    }
}
