package Ejercicio3;

public class Tema3 {
    public static void main(String[] args) {
        StringBuilder finalText = new StringBuilder();
        String[] names = {"Michael", "Salome", "Daphne", "Steven","Jorge"};

        for (String position : names) {
            finalText.append(position);
        }

        System.out.println("Este es el texto final concatenado : " + finalText);
    }
}
