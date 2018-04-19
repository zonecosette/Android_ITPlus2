
package android_itplus_Buoi5.lamviecvoilop2;

public class HinhTron {
    private double banKinh;
    
    public double getBanKinh(){
        return banKinh;
    }
    
    public void setBanKinh (double banKinh){
        this.banKinh = banKinh;
    }
    
    //tinh chu vi, @return chuVi
    public double tinhChuVi() {
    double chuVi = 0;
    chuVi = 2*(banKinh*Math.PI);
    return chuVi;
}
    public double tinhDienTich(){
        return Math.PI*Math.pow(banKinh, 2);
    }
}
