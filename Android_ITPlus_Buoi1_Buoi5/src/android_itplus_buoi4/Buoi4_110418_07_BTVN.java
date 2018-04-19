/*
 Tao 1 mang, hay viet chuong trinh thuc hien cac cong viec sau nay:
+ Tim so lon nhat trong mang
+ Trung binh cong cua cac so chan trong mang
 */
package android_itplus_buoi4;


public class Buoi4_110418_07_BTVN {
    public static void main(String[] args) {
        int max = mangSoNguyen[0];
        for (int i = 0; i < n; i++){
            if (mangSoNguyen[i] > Max){
                max = mangSoNguyen[i];
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
    }
}
