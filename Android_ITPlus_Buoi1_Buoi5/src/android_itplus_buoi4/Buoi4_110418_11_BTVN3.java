/*
 Nhap mang so nguyen 2 chieu 2 hang, 3 cot tu ban phim
va xuat ra man hinh mang da nhap
 */
package android_itplus_buoi4;

import java.util.Scanner;

public class Buoi4_110418_11_BTVN3 {
    public static void main(String[] args) {
        //buoc 1: khai bao mang
        int [][] mang = new int[2][3];
{
        //Buoc 2: Nhap cac phan tu mang tu ban phim
	Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Nhap phan tu hang %d cot %d %n", i, j);
                mang[i][j] = scan.nextInt();
            }
        }
        //Buoc 3: In
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Phan tu hang %d cot %d = %d %n", i, j, mang[i][j]);
            }
        
    }
}
    }
}
