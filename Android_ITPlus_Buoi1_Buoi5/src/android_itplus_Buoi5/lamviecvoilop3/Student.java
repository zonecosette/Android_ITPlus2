/*
 Tao lop mieu ta cac thuoc tinh cua sinh vien bao gom: 
Ho ten, diem va cac phuong thuc nhap, xuat va xep loai hoc luc
 */
package android_itplus_Buoi5.lamviecvoilop3;

public class Student {
    private String studentName;
    private float studentScore;
    
    //xay dung cac ham khoi tao
    public Student(){
        
    }

    public Student(String studentName, float studentScore) {
        this.studentName = studentName;
        this.studentScore = studentScore;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(float studentScore) {
        this.studentScore = studentScore;
    }
    
    
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
    
    
}
