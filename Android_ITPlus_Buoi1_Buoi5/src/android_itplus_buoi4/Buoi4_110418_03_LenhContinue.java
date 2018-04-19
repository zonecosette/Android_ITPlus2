/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_itplus_buoi4;

public class Buoi4_110418_03_LenhContinue {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++){
            if (i%3 == 0)
                continue;
            System.out.println("I =" + i);
        }
    }
}
