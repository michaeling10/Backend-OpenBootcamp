package EjercicioTema9;

public class Trabajador extends Persona{
    private float salario;

    public Trabajador(){}

    public Trabajador(String nombre, int edad, int telefono, float salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
