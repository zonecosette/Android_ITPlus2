package pkg180418_lamviecvoilop;

public class Student extends Person{
    private String lop;

    @Override
    public void xinChao() {
        //super.xinChao(); super la tu khoa de chay lai phuong thuc cua lop cha 
        System.out.println("Xin chao, toi la Student.");
    }
    
    public void tinhDiem(){
        System.out.println("Tinh diem.");
    }
    
    //day la Inner Class dc khai bao trong 1 lop khac
    public class giaoVien {
        private String boMon;
        
        public void tinhLuong(){
            
        }
    }
    
}
