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
public class Bai8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Lỗi");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Lỗi");
        }
        else if (vowels)
        {
            System.out.println("Nguyên âm");
        }
        else
        {
            System.out.println("Phụ âm");
        }
    }
}
