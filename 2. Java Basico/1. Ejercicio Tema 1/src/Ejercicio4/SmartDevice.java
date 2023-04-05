package Ejercicio4;

public class SmartDevice {
    private float size,weight,display;
    private int capacity;
    private String camera, color;

    public SmartDevice() {
    }

    public SmartDevice(float size, float weight, float display, int capacity, String camera, String color) {
        this.size = size;
        this.weight = weight;
        this.display = display;
        this.capacity = capacity;
        this.camera = camera;
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getDisplay() {
        return display;
    }

    public void setDisplay(float display) {
        this.display = display;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

