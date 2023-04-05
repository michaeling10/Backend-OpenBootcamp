package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone((float) 5.8, 5, 5,128, "12 MP", "Black", SmartPhone.Brands.APPLE);
        SmartWatch watch1 = new SmartWatch(3, 2, (float)2.5, 60,"No-camara","White");

        System.out.println("El SMARTPHONE TIENE LAS SIGUIENTES CARACTERISTICAS : ");
        System.out.println("Camara : " + phone1.getCamera());
        System.out.println("Capacidad de almacenamiento : " + phone1.getCapacity() + " GB");
        System.out.println("Peso : " + phone1.getWeight() + " pounds");
        System.out.println("Tamaño : " + phone1.getSize());
        System.out.println("Color : " + phone1.getColor());
        System.out.println("Marca : " + phone1.getBrands());

        System.out.println();

        System.out.println("El SMARTWATCH TIENE LAS SIGUIENTES CARACTERISTICAS : ");
        System.out.println("Color : " + watch1.getColor());
        System.out.println("Peso : " + watch1.getWeight() + " pounds");

    }
}
