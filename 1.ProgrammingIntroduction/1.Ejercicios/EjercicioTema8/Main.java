package EjercicioTema8;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Michael Caceres");
        persona1.setEdad(27);
        persona1.setTelefono(312454);

        System.out.println("El nombre de la persona 1 es : " + persona1.getNombre());
        System.out.println("La edad de la persona 1 es : " + persona1.getEdad());
        System.out.println("El telefono de la persona 1 es : " + persona1.getTelefono());
    }
}
