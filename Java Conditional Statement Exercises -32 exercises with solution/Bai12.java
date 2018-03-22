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
public class Bai12 {
    public static void main(String[] args)
{       
    int i,n,tong=0;
    double tb;
    System.out.println("Nhập vào 5 số : ");  
    for (i=0;i<5;i++)
	{
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            tong +=n;
	}
	tb=tong/5;
	System.out.println("Tong cua 5 so tren la " +tong+"\nCo trung binh cong la " +tb);
 
}
}
