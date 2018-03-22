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
public class Bai5 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long thoigianvao = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + thoigianvao) % 24);

        System.out.println("Thoi gian hien tai la " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
