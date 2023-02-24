import java.util.Scanner;

public class EjercicioTema4 {

    public static void main(String[] args) {

        Scanner tarea = new Scanner(System.in);
        int seleccion;
        System.out.println("Seleccione la tarea que quiere ejecutar:");

        System.out.println("1. Metofo if / else-if / else");
        System.out.println("2. Metodo While");
        System.out.println("3. Metodo Do-While");
        System.out.println("4. Metodo For");
        System.out.println("5. Metodo Switch");

        System.out.println("Escriba a continuación el número de la opción selecionada: ");
        seleccion = tarea.nextInt();

        if (seleccion > 0){
            switch (seleccion) {
                case 1 -> {
                    Scanner numeroOpcion = new Scanner(System.in);
                    float numeroolf;
                    System.out.println("----------------");
                    System.out.println("OPCION NUMERO 1");
                    System.out.println("----------------");
                    System.out.println();
                    System.out.println("Ingrese el numero: ");
                    numeroolf = numeroOpcion.nextFloat();

                    //1. Primer ejercicio
                    if (numeroolf < 0) {
                        System.out.println("El numero es negativo");
                    } else if (numeroolf == 0) {
                        System.out.println("El numero es 0");
                    } else {
                        System.out.println("El numero es positivo");
                    }
                }
                case 2 -> {
                    System.out.println("----------------");
                    System.out.println("OPCION NUMERO 2");
                    System.out.println("----------------");
                    System.out.println();
                    int numeroWhile = -3;
                    while (numeroWhile < 3) {
                        System.out.println(numeroWhile);
                        numeroWhile++;
                    }
                }
                case 3 -> {
                    System.out.println("----------------");
                    System.out.println("OPCION NUMERO 3");
                    System.out.println("----------------");
                    System.out.println();
                    int numeroWhile2 = 2;
                    do {
                        System.out.println(numeroWhile2);
                        break;
                    } while (numeroWhile2 < 3);
                }
                case 4 -> {
                    System.out.println("----------------");
                    System.out.println("OPCION NUMERO 4");
                    System.out.println("----------------");
                    System.out.println();
                    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                        System.out.println(numeroFor);
                    }
                }
                case 5 -> {
                    System.out.println("----------------");
                    System.out.println("OPCION NUMERO 5");
                    System.out.println("----------------");
                    System.out.println();
                    System.out.println("Elija un número para seleccionar la estación del año: ");
                    System.out.println("1.Invierno");
                    System.out.println("2.Primavera");
                    System.out.println("3.Verano");
                    System.out.println("4.Otoño");
                    Scanner SelecEstacion = new Scanner(System.in);
                    int estacion = SelecEstacion.nextInt();
                    switch (estacion) {
                        case 1 -> System.out.println("Estas en Invierno -> Abrigate");
                        case 2 -> System.out.println("Estas en Primavera -> Es hora de guardar los abrigos");
                        case 3 -> System.out.println("Estas en Verano -> A nadar!");
                        case 4 -> System.out.println("Estas en Otoño -> A buscar nuevamente los abrigos");
                        default -> System.out.println("No seleccionaste bien el numero de la estacion");
                    }
                }
                default -> System.out.println("No ingreso una opción valida");
            }

        }else{
            System.out.println("No ingreso una opción valida");
        }



    }

}
