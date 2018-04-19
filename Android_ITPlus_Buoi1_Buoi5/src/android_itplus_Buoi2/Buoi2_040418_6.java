/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_itplus_Buoi2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi2_040418_6 {
    
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập giá trị cạnh thứ nhất: ");
        a = scanner.nextInt();
        
        System.out.println("Nhập giá trị cạnh thứ hai: ");
        b = scanner.nextInt();
        
        System.out.println("Nhập giá trị cạnh thứ ba: ");
        c = scanner.nextInt();
        
        boolean tamGiac = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println(tamGiac ? "Dung la tam giac." : "Khong phai la tam giac.");
    }
    
}
