package Instituto_Vanessa;

public class Alumno extends Persona{
    /* Atributo */
    private int notas;

    /* Constructor */
    public Alumno(String paramNombre, int paramEdad, String paramAula, int paramNotas) throws Exception {
        super(paramNombre, paramEdad, paramAula);
        this.notas = paramNotas;
    }

    /* Métodos */
    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [notas=" + notas + "] \n";
    }
}
