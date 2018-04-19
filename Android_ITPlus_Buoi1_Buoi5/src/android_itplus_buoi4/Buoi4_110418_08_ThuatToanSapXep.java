package android_itplus_buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Buoi4_110418_08_ThuatToanSapXep {
    public static void main(String[] args) {
        
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
        
        //cach 1:
        for (int i = 0; i <= n - 2; i++){
            for (int j = i + 1; j <= n - 1; j++)
            {
                if (mangSoNguyen[i] < mangSoNguyen[j]){
                    int temp = mangSoNguyen[i];
                    mangSoNguyen[i] = mangSoNguyen[j];
                    mangSoNguyen[j] = temp;
                }
            }
        }
        
        //cach 2:
        
//        Arrays.sort(mangSoNguyen); //sap xep luon: sap xep tang dan
        
        //in mang da sap xep:
        System.out.println("Mang sau khi sap xep: ");
        for (int i = 0; i <  n; i++){
            System.out.println(mangSoNguyen[i]);
        }
    }
}
