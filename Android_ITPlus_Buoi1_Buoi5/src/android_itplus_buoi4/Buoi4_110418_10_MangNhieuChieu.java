
package android_itplus_buoi4;

/**
 *
 * @author Admin
 */
public class Buoi4_110418_10_MangNhieuChieu {
    public static void main(String[] args) {
        //mang nhieu chieu (Mang 2 chieu)
        //khai bao 
        int[][] toaDo;
        
        //khoi tao --> noi ro bao nhieu hang, bao nhieu cot
        toaDo = new int[3][4];
        
        //khai bao, khoi tao, thiet lap gia tri
        //mang cua cac mang --> so mang = so hang, so pt cua mang = so cot
        int[][] diem = {{1, 2, 3, 4}, {4, 4, 4, 5}, {6, 7, 8, 9}}; // 3 hang, 4 cot
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("Phan tu %d cot %d = %d. %n", i + 1, j + 1, diem[i][j]);
            }
        }
    }
}
