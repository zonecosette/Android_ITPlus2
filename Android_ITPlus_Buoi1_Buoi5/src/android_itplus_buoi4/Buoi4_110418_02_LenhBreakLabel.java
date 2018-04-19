package android_itplus_buoi4;

public class Buoi4_110418_02_LenhBreakLabel {
    public static void main(String[] args) {
        //dung 2 vong for de duyet
        //vong 1: i chay tu 1 - 5
        //vong 2: j chay tu 1 - 10
//        for (int i = 1; i <= 2; i++){
//            for (int j = 1; j <= 3; j++){
//                if (j%2 == 0)
//                    break;
//                System.out.println("J = " + j);
//            }
//            System.out.println("I = " + i);
//        }
        
        //vi du dung nhan (label)
        vong1: for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 3; j++){
                if (j%2 == 0)
                    break vong1;
                System.out.println("J = " + j);
            }
            System.out.println("I = " + i);
        }
    }
}
