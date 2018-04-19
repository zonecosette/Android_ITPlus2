    /*Nhap cac he so a, b, c tu ban phim
Giai phuong trinh bac 2
*/

package android_itplus.buoi3;

import java.util.Scanner;

public class Buoi3_070418_02_BaiTap {
    public static void main (String[] args)
    {
        float a, b, c;
        double delta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap cac he so tuong ung: a, b, c");
        System.out.println("Nhap a:");
        a = scan.nextFloat();
        System.out.println("Nhap b");
        b = scan.nextFloat();
        System.out.println("Nhap c");
        c = scan.nextFloat();
        
        //buoc 3: xu ly va in ra ket qua
        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
                {
                    System.out.println("Phuong trinh co vo so nghiem.");
                }
                else 
                {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
            else
            {
                System.out.println("Phuong trinh co nghiem x = " + ((float) - c/b));
            }
        }
        
        else
        {
        delta = b * b - 4 * a * c;
        if (delta < 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0)
        {
            System.out.println("Phuong trinh co 1 nghiem kep x = " + (float) - b/(2*a));
        } else
        {
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + (float) (-b + Math.sqrt(delta)) / (2*a));
            System.out.println("x2 = " + (float) (-b - Math.sqrt(delta)) / (2*a));
        }
        }
    }
}
