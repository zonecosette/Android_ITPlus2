/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_itplus.buoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_09_CauTrucLapDoWhile {
    public static void main(String[] args) {
        //buoc 1: Khai bao bien soNguyen
        int soNguyen;
        
        //buoc 2: Nhap so nguyen
        Scanner scan = new Scanner(System.in);
        do {            
            System.out.println("Nhap so nguyen duong.");
            soNguyen = scan.nextInt();
        } while (soNguyen < 0); //neu nhap vao so am thi se nhap lai
        
        //buoc 3: in ra thong bao
        System.out.println("Cam on.");
    }
}
