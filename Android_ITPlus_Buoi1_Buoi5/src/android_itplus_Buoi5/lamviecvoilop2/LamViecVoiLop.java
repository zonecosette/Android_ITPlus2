package android_itplus_Buoi5.lamviecvoilop2;

public class LamViecVoiLop {
    
    public static void main(String[] args) {
        
    HinhTron hinhTron = new HinhTron();
    hinhTron.setBanKinh(20);
    
    double chuVi = hinhTron.tinhChuVi();
        System.out.println("Chu vi: " + chuVi);
    }
}
