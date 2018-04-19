/*
 Nhap thang va nam tu ban phim.
Xuat so ngay cua thang da nhap.
 */
package android_itplus.buoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_05_BaiTap3 
{
    public static void main (String [] args)
    {
        int thang;
        int nam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao thang:");
        thang = scan.nextInt();
        System.out.println("Nhap vao nam:");
        nam = scan.nextInt();
        switch(thang)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang co 31 ngay.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Thang co 30 ngay.");
                break;
            case 2:
                if (nam%400 == 0 || (nam%4 == 0 && nam% 100 != 0))
                    System.out.println("Thang co 29 ngay.");
                else
                    System.out.println("Thang co 28 ngay.");
            default:
                System.out.println("Nhap lai.");
        }
    }
}
