/*
 Nhap diem tu 0 den 10
 */
package android_itplus.buoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_10_BaiTap5 {
    public static void main(String[] args) {
        //buoc 1: Khai bao bien Diem
        int diem;
        
        //buoc 2: Nhap diem
        Scanner scan = new Scanner(System.in);
        do {            
            System.out.println("Nhap diem.");
            diem = scan.nextInt();
        } while (diem < 10 || diem > 10); 
        
        //buoc 3: in ra thong bao
        System.out.println("Cam on.");
    }
}
