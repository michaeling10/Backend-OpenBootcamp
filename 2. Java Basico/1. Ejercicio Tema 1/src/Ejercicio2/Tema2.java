package Ejercicio2;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        float precio;

        System.out.print("Introduzca el precio: $");
        precio = sc.nextFloat();  //leer un precio
        System.out.println("");
        System.out.println("El precio con iva es de : $" + ivaPrecio(precio));
    }

    public static float ivaPrecio(float precio){

        float currentIva = (float) 0.19;
        float precioPlusIva;
        precioPlusIva = precio + (currentIva*precio);
        return precioPlusIva;
    }
}
