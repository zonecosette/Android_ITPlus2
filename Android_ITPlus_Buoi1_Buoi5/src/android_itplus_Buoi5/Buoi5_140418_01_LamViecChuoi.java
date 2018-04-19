package android_itplus_Buoi5;

public class Buoi5_140418_01_LamViecChuoi {
    
    public static void main(String[] args) {
        //khai bao 1 chuoi
        String hovaten;
        //khoi tao
        hovaten = "Tran Hoang Minh";
        
        //chuyen thanh in thuong
        String inThuong = hovaten.toLowerCase();
        System.out.println(inThuong);
        String inHoa = hovaten.toUpperCase();
        System.out.println(inHoa);
        
        //cat khoang trang o 2 dau cua chuoi
        String hovaten2 = " Duong Van Cuong       ";
        String hovaten3 = hovaten2.trim();
        System.out.println(hovaten2);
        System.out.println(hovaten3);
        
        //lay do dai cua 1 chuoi
        int length = hovaten.length();
        System.out.println(length);
        
        //cat chuoi con
        String ten = hovaten.substring(11);
        System.out.println(ten);
        String ten2 = hovaten.substring(0,5);
        System.out.println(ten2);
        
        //lay ky tu o chi so index
        char kytu = hovaten.charAt(11);
        System.out.println(kytu);
        
        //tim va thay the
        String hovaten4 = hovaten.replaceAll("a", "o");
        System.out.println(hovaten4);
        
        //tach chuoi thanh mang
        String danhSachLop = "Hieu, Cuong, Tu, Linh, Dung, Phuong";
        String[] tens = danhSachLop.split(",");
        for (String ten1 : tens) { //duyet tat ca phan tu cua mang
            System.out.println(ten1);
        }
        
        //so sanh chuoi
        if (hovaten.equals(hovaten2)){
            System.out.println("Hai nguoi cung ten");
        }
        
        if (hovaten.equalsIgnoreCase(hovaten2)){
            System.out.println("Hai nguoi cung ten");
        }
        
        //kiem tra xem co chua hay khong
        if (hovaten.contains("Minh")){
            System.out.println("Xin chao Minh");
        }
        
        //kiem tra xem co bat dau/ket thuc la mot chuoi gi do khong?
        if(hovaten.startsWith("Tran")){
            System.out.println("Xin chao ho Tran");
        }
        
        //neu muon kiem tra tinh hop le cua mot chuoi dua vao dinh dang cho truoc
        String phoneNumber1 = "0985501368";
        String phoneNumber2 = "19855013683";
        String pattern = "0[0-9]{9,10}"; //0-9 la chuan chi co tu 9 den 10, 9-10 la so con lai (toi thieu 9, toi da 10)
        if (phoneNumber1.matches(pattern)){
            System.out.println("La so dien thoai hop le.");
        }
        else {
            System.out.println("La so dien thoai khong hop le.");
        }
        
        if (phoneNumber2.matches(pattern)){
            System.out.println("La so dien thoai hop le.");
        }
        else {
            System.out.println("La so dien thoai khong hop le.");
        }
        //--> day la bieu thuc chinh quy cua chuoi
        
        //tim vi tri xuat hien dau tien, cuoi cung cua chuoi con
        int index = hovaten.indexOf("n");
        int index2 = hovaten.lastIndexOf("n");
        System.out.println(index);
        System.out.println(index2);
        
        //--> 3 la vi tri chu n xuat hien dau tien, 13 la vi tri chu n xuat hien cuoi cung
    }
}
