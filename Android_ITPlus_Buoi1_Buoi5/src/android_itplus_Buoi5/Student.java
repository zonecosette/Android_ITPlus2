package android_itplus_Buoi5;

public class Student// khi khai bao ham abstract o duoi thi ham nay cung phai de la abstract
{
    //khai bao cac thuoc tinh
    public String studentName;
    private String studentAddress;
    private int studentAge;
    private String studentID;
    private float studentScore;
    
    //xay dung cac ham khoi tao

    public Student() {
    }

    //xay dung cac phuong thuc
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public double tinhHocPhi(){
        double hocPhi;
        if (studentAddress.contains("Ha Noi")) {
            hocPhi = 5000000;
        }
        else {
            hocPhi = 4500000;
        }      
        return hocPhi;
    }
    
    public static void gioiThieu(String address){
        System.out.println("Xin chao lop, toi den tu " + address);
    }
    
    //public abstract void tinhDiemTrungBinh();
    //chi dung de thong bao chu k khai bao gi
    //co nghia la k duoc dung {} ma chi dc de nthe thoi
    public void danhGiaHocLuc(){
        if (studentScore < 5){
            System.out.println("Hoc luc kem.");
        }
        else if (studentScore < 7) {
            System.out.println("Hoc luc trung binh");
        } else if (studentScore < 8){
            System.out.println("Hoc luc kha.");
        } else if (studentScore < 9){
            System.out.println("Hoc luc gioi.");
        } else {
            System.out.println("Hoc luc xuat sac.");
        }
    
}

    public Student(String studentName, 
            String studentAddress, 
            int studentAge, 
            String studentID, 
            float studentScore) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentID = studentID;
        this.studentScore = studentScore;
    }
    
    
}
