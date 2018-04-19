/*
 Tinh trung binh cong cac so chia het cho 3 tu 27 den 250
 */
package android_itplus.buoi3;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_08_BaiTap4 {
    public static void main (String [] args)
    {
        int k = 27;
        int soCacSoChiaHetCho3 = 0;
        int tongCacSoChiaHetCho3 = 0;
        while (k <= 250)
        {
            if (k%3 == 0)
            {
                soCacSoChiaHetCho3++;
                tongCacSoChiaHetCho3 = tongCacSoChiaHetCho3 + k;
            }
            k++;
        }
        System.out.println("Trung binh cong: " + (float) tongCacSoChiaHetCho3 / soCacSoChiaHetCho3);
    }
}
