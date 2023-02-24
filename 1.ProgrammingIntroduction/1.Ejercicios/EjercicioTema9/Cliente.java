package EjercicioTema9;

public class Cliente extends Persona{

    private float credito;

    public Cliente(){}

    public Cliente(String nombre, int edad, int telefono, float credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}
