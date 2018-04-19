
package android_itplus_buoi4;

/**
 *
 * @author Admin
 */
public class Buoi4_110418_04_LenhContinueLabel {
    public static void main(String[] args) {
        vong1: for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 3; j++){
                if (j%2 == 0)
                    continue vong1;
                System.out.println("J = " + j);
            }
            System.out.println("I = " + i);
        }
    }
}
