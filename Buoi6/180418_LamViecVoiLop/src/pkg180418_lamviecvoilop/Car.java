
package pkg180418_lamviecvoilop;

public final class Car {
    //su dung tu khoa final de dinh nghia "lop vo sinh"
    //lop vo sinh thi k the ke thua duoc
    //final voi thuoc tinh, ten bien, tham so ==> goi la hang so
    private int soBanhXe;
    private final String tenXe = "Honda";

    //phuong thuc vo sinh (ham vo sinh)
    public final int SoBanhXe() {
        return soBanhXe;
    }
}
