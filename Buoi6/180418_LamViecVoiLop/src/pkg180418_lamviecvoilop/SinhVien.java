
package pkg180418_lamviecvoilop;

public class SinhVien {
    private String ten;
    private String diaChi;
    private double diem;
    private int tuoi;
    
    //nap chong: trong 1 lop chung ta co the xay dung cac phuong thuc cung ten
    //(So cac tham so, kieu du lieu khac nhau)
    public double tinhDiem(){
        return diem;
    }
    public double tinhDiem(double diemKhuVuc){
        return diem + diemKhuVuc;
    }
    public double tinhDiem(String diaChi){
        double diem1;
        if(diaChi.contains("Ha Noi")){
            diem1 = diem;
        }
        else {
            diem1 = diem + 2;
        }
        return diem1;
    }
}
