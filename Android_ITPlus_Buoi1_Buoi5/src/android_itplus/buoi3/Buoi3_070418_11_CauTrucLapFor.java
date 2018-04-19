/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_itplus.buoi3;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_11_CauTrucLapFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("7 * %d = %d. %n", i, 7*i);
        }
        
        for (int i = 6; i%5 != 0; i++)
        {
            if (i %2 == 0)
                System.out.println(i);
        }
        
        for (int i = 2; i <= 9; i++)
        {
            for (int j = 1; j <= 10; j++)
                System.out.printf("%d * %d = %d %n", i, j, i * j);
        }
    }
}
