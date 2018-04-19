
package android_itplus_Buoi5;

public class Buoi5_140418_04_LamViecVoiLop1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentAddress("Ha Noi");
        System.out.println("Que quan: " + student.getStudentAddress());
        
        double hocPhi = student.tinhHocPhi();
        System.out.println("Hoc phi: " + hocPhi);
        
        Student.gioiThieu("Hai Duong");
        Student student1 = new Student("Duong", "Hai Phong", 20, "1368", 8);
        System.out.println("Ban Duong: " + student.getStudentName());
        
        //giai thich tinh da hinh
        Car[] car = new Car[2];
        KiaCar kiaCar = new KiaCar();
        Car car1 = new Car();
        
        kiaCar.setCarName("Kia Morning");
        car1.setCarName("Oto");
        car[0]= car1;
        car[1] = kiaCar;
        
        kiaCar.tinhLuongNhienLieu();
        kiaCar.setCarName("Kia");
    }
}
