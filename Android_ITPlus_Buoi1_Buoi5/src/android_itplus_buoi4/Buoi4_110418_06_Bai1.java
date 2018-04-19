/*
 Nhap mang so nguyen:
+ Tinh va xuat trung binh cong
+ Xuat lap phuong cac phan tu
 */
package android_itplus_buoi4;

import java.util.Scanner;

public class Buoi4_110418_06_Bai1 {
    public static void main(String[] args) {
        //Buoc 1: Khai bao mang va so phan tu cua mang
        int[] mangSoNguyen = {4, 7, 19, 5, 26, 31};
        int n = mangSoNguyen.length;
        
        //buoc 2: Nhap so pt cua mang va cac pt cua mang tu ban phim
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = scan.nextInt();
        mangSoNguyen = new int[n]; //khoi tao mang
        
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1));
            mangSoNguyen[i] = scan.nextInt();
        }
        
        //buoc 3: tinh toan va in ra ket qua
        int tong = 0;
        for (int i = 0; i < n; i++){
            tong = tong + mangSoNguyen[i];
        }
        System.out.println("Trung binh = " + (float)tong/n);
        
        //in lap phuong
        System.out.println("Lap phuong cua tung phan tu la: ");
        for (int i = 0; i < n; i++){
            //math.pow(mangSoNguyen[i], 3) : a ^3
            System.out.println(Math.pow(mangSoNguyen[i], 3));
        }
    }
}
