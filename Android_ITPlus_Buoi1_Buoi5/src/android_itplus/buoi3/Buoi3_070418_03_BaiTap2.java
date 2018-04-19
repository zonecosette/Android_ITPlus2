/*
 Nhap luong
    Tinh thue: 
- < 9 trieu --> thue 0%
- 9 trieu <= luong < 15 trieu --> 10%
- 15 trieu <= luong < 30 trieu --> 15%
- > 30 trieu --> 20%
 */
package android_itplus.buoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_03_BaiTap2 {
    public static void main (String[] args)
    {
        double salary;
    String thue;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Nhap luong. (Don vi trieu)");
    
    salary = scan.nextDouble();
    
    //Check salary
    if (salary < 9)
    {
        System.out.println("Tax: 0%.");
    }
    else if (salary < 15)
    {
        System.out.println("Tax: 10%");
    }
    else if (salary < 30)
    {
        System.out.println("Tax: 15%");
    }
    else
    {
        System.out.println("Tax: 20%");
    }
            
    }
   
}
