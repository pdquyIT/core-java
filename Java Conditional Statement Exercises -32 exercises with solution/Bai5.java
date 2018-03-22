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
public class Bai5 {
    public static String ngaythu(int ngay) {
        String ngaythu;
        switch (ngay) {
            case 1: ngaythu = "Thứ 2"; break;
            case 2: ngaythu = "Thứ 3"; break;
            case 3: ngaythu = "Thứ tư"; break;
            case 4: ngaythu = "Thứ năm"; break;
            case 5: ngaythu = "Thứ sáu"; break;
            case 6: ngaythu = "Thứ bảy"; break;
            case 7: ngaythu = "Chủ nhật"; break;
            default:ngaythu = "Bạn nhập sai ngày";
        }
        return ngaythu;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập ng: ");
        int ngay = in.nextInt();
        System.out.println(ngaythu(ngay));
    }

    
}
