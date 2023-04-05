package Ejercicio4;

public class SmartPhone extends SmartDevice {

    enum Brands {
        APPLE,
        SAMSUNG,
        XIAOMI
    }

    Brands brands;

    public SmartPhone(float size, float weight, float display, int capacity, String camera, String color, Brands brands) {
        super(size, weight, display, capacity, camera, color);
        this.brands = brands;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }
}
