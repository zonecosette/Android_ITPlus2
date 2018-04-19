/*
 Nhap vao username va password tu ban phim:
Kiem tra xem neu username:
username = admin
password > 6 ky tu va bat dau bang "012"
=> dung thi in ra "Xin chao"
sai thi in ra "Dang ky lai"
 */
package android_itplus_Buoi5;

import java.util.Scanner;

public class Buoi5_140418_02_BT1 {
    
    public static void main(String[] args) {
       
        //buoc 1: KHai bao username, password
        String userName;
        String passWord;
        
        //buoc 2: Nhap username va password tu ban phim
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap username:");
        userName = scan.nextLine();
        System.out.println("Nhap password");
        passWord = scan.nextLine();
        
        //Buoc 2: Xu ly va in ra ket qua;
        if (userName.equals("admin") && 
                passWord.length() >= 6 &&
                passWord.startsWith("012")){
            System.out.println("Xin chao.");
        }
            else {
                    System.out.println("Dang ky lai. ");
                 }
        
    }
    
    }
    

