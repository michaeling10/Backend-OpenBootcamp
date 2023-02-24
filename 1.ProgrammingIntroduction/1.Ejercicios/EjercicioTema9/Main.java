package EjercicioTema9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose",20,315486,200000);
        Trabajador trabajador = new Trabajador("Michael", 28,2548364, 2500f);

        System.out.println("La información del cliente es la siguiente: ");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: $" + cliente.getCredito() + " US");
        System.out.println();
        System.out.println("La información del trabajador es la siguiente: ");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: $" + trabajador.getSalario() + " US");

    }
}
