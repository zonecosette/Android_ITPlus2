
package android_itplus_Buoi5;

public class Car {
    public String carName;
    public String carColor;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    
    public void gioiThieu(){
        System.out.println("Xin chao, toi la Car. ");
    }
}
