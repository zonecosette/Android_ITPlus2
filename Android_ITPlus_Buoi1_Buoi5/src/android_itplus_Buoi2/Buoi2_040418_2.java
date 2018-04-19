/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android_itplus_Buoi2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi2_040418_2 
{
    public static void main(String[] args)
    {
        //bai toan: Nhập thông tin, họ và tên, điểm, tuổi từ bàn phím
        //--> in ra màn hình
        
        //Buoc 1: Khai bao bien
        String hoten;
        float diem;
        byte tuoi;
        
        //Buoc 2: Nhap du lieu tu ban phim: Scanner giup nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        hoten = scanner.nextLine();//lấy cả chuỗi người dùng nhập vào
        
        System.out.println("Nhập điểm: ");
        diem = scanner.nextFloat();//kiểu gì thì next + kiểu đấy
        
        System.out.println("Nhập tuổi: ");
        tuoi = scanner.nextByte();
        
        //Bước 3: In ra kết quả
        System.out.printf("Xin chào %s, điểm của bạn là %.2f, tuổi của bạn là %d %n.",
        hoten, diem, tuoi);
    }
}
