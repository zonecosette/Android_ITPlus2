/*
 Nhap 2 mang ho ten va diem
 Xuat 2 mang giam theo diem.

VD: 
    Tung    8
    Cuong   7
    Hung    6
    
    Tuan    1
    Phong   5
 */
package android_itplus_buoi4;

public class Buoi4_110418_09_BTVN2 {
    public static void main(String[] args) {
        int[] diem = {10, 6, 7, 8, 4, 6};
        String[] ten = {"Cuong", "Tu", "Hien", "Dung", "Hai", "Phong"};
        
        for (int i = 0; i <= 4; i++)// 4 la n - 2 (6-2)
        {
            for (int j = i + 1; j <= 5; j++){
                if(diem[i] > diem[j]){
                //doi cho mang diem
                int temp = diem[i];
                diem[i] = diem[j];
                diem[j] = temp;
                
                //doi cho mang ten
                String tempName = ten[i];
                ten[i] = ten[j];
                ten[j] = tempName;
                }
            }
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("Ban %s co diem la %d. %n", ten[i], diem[i]);
        }
    }
}
