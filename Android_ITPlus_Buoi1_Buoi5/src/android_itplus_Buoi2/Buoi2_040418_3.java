
package android_itplus_Buoi2;

import java.util.Scanner;


public class Buoi2_040418_3 {
    
    public static void main(String[] args)
    {
        float chieuDai;
        float chieuRong;
        float chuVi;
        float dienTich;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        chieuDai = scanner.nextFloat();
        
        System.out.println("Nhập chiều rộng: ");
        chieuRong = scanner.nextFloat();
  
        chuVi = (chieuDai + chieuRong)*2;
        dienTich = chieuDai*chieuRong;
        
        System.out.printf("Chu vi là %.2f %n", chuVi);
        System.out.printf("Diện tích là %.2f %n", dienTich);
        
               
    }
}
