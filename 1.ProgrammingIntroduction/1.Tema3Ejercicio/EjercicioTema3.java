public class EjercicioTema3 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        int num3 = 3;
        int resultadoSuma = suma3(num1,num2,num3);

        //Respuesta Parte 1
        System.out.println("El resultado de la suma entre los números " + num1 + " , " + num2 + " , " + num3 + " es igual a : " + resultadoSuma);

        Coche miCoche = new Coche();
        int numeroPuertas = 1;
        miCoche.incrementoPuertas(numeroPuertas);
        //Respuesta Parte 2
        System.out.println("El coche tiene: " + miCoche.numeroPuertas + " puertas");
    }

    //Parte 1 - Función
    public static int suma3(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

//Parte 2 - Clase y Función
class Coche {
    public int numeroPuertas = 0;

    public void incrementoPuertas(int number) {
        for (int i = 0; i < number; i++) {
            this.numeroPuertas++;
        }
    }
}
