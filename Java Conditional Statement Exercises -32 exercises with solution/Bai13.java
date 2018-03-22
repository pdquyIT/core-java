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
public class Bai13 {
    public static void main(String[] args)
{
    int i,n;
    System.out.print("Nhap so ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    for(i=1;i<=n;i++)
    {
        System.out.println(n+" mũ " +i+" bằng : "+Math.pow(n, i));     
    }
 }
}
