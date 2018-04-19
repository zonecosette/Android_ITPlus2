/*
 In ra danh sach lop (diem)
=> Lop co la lop tien tien k?
Dieu kien: Khong co ban nao bi diem 0.
 */
package android_itplus_buoi4;

/**
 *
 * @author Admin
 */
public class Buoi4_110418_01_break {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
           //mong muon khi nao i chia het cho 5 se thoat khoi vong for
           if (i %5 == 0){
               break; //thoat khoi vong for
           }
            
            System.out.println(i);
        }
    }
}
