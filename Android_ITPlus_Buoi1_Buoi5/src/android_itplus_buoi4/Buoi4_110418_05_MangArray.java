package android_itplus_buoi4;

public class Buoi4_110418_05_MangArray {
    public static void main(String[] args) {
        //khi lam viec voi mang: cach khai bao, khoi tao, truy xuat phan tu du lieu
        //tinh so phan tu cua mang, duyet mang, sap xep mang
        
        //khai bao
        int[] diem;
        
        //khoi tao: noi ro mang nay co bao nhieu phan tu
        diem = new int[10]; //mang so nguyen co 10 phan tu
        
        
        //co the vua khai bao, vua khoi tao
        int[] age = new int[5];
        
        //co the vua khai bao,vua khoi tao, vua thiet lap gia tri cua mang
        int[] score = {10, 7, 8, 5, 1}; //mang so nguyen co 5 phan tu
        
        //muon lay ptu mang nao thi se dung theo chi so
        System.out.println("Phan tu dau tien: " + score[0]);
        
        //in ra toan bo phan tu cua mang
        // 0 --> n-1; n la so phan tu cua mang  
        int n = score.length;
        for (int i = 0; i < n; i++) {
            System.out.printf("Pt %d = %d %n", i, score[i]);
        }
        
        //cach 2: duyet mang, nhung ma duyet tat ca
        for (int i : score) {
            System.out.println(i);
        }
        
        //khai bao mang String[]
        String[] danhSachLop = {"Tu", "Linh", "Quang", "Hien"};
        for (String ten : danhSachLop){
            System.out.println("Hello " + ten);
        }
    }
}
